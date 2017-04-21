$(document).ready(function() {

    /**
     * Sends data to get ROI on the specific time. And pushed a retrieved data to charts options.
     */
    function callEthRoiCalculations(time) {
        var msg = $('#calcForm').serialize();
        msg = msg + "&timestamp=" + time;
        $.ajax({
            type: 'GET',
            url: '/eth/calcRoiForTheTime',
            data: msg,
            success: function(data) {
                roi.data.push([time, data]);
            },
            error:  function(xhr, str){
                alert('Error has occured: ' + xhr.responseCode);
            }
        });
    }

    var options = {
        chart: {
            renderTo: 'chart',
            type: 'spline'
        },
		yAxis: [{ 
			title: {
				text: 'totalHashRate'
			}
		}, { 
			title: {
				text: 'BTC price'
			},
			opposite: 1
		}, { 
			title: {
				text: 'ROI days'
			},
			opposite: 1
		}],
		xAxis: { type: 'datetime' },
        series: []
    };
	
	var totalHashRate = {
		yAxis: 0,
		name: 'totalHashRate',
		data: []
	};
	var btcPrice = {
		yAxis: 1,
		name: 'BTC price in ETH',
		data: []
	};
	var roi = {
		yAxis: 2,
		name: 'ROI (days)',
		data: []
	};

    $.getJSON('./eth/', function(data) {
		data.forEach(function(item, i, data) {
			var time = item.time * 1000;
			totalHashRate.data.push([time, item.totalHashRate]);
			btcPrice.data.push([time, item.price]);
		
			// get some ROI calculations from the server
			// let the request execute until roi is pushed to options
			$.ajaxSetup({
				async: false
			});
			if (i % 10 == 0) {
			    callEthRoiCalculations(time);
			}
		});
		
        options.series.push(totalHashRate);
		options.series.push(btcPrice);
		options.series.push(roi);
        var chart = new Highcharts.Chart(options);
    });

});