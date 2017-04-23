function drawChart() {
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
				text: 'BTC-ETH price'
			},
			opposite: 1
		}, {
			title: {
				text: 'BTC-USD price'
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
	var btcPriceUsd = {
		yAxis: 2,
		name: 'BTC price in $',
		data: []
	};
	var roi = {
		yAxis: 3,
		name: 'ROI (days)',
		data: []
	};

    $.ajaxSetup({
        async: false
    });

	$.getJSON('./eth/', function(data) {
        data.forEach(function(item, i, data) {
            var time = item.time * 1000;
            totalHashRate.data.push([time, item.totalHashRate]);
            btcPrice.data.push([time, item.price]);

            // get some ROI calculations from the server
            // let the request execute until roi is pushed to options
			// by using sync request before
            if (i % 10 == 0) {
                callEthRoiCalculations(time);
            }
        });

        options.series.push(totalHashRate);
        options.series.push(btcPrice);
        options.series.push(roi);
    });

    $.getJSON('./btc/', function(data) {
        data.forEach(function(item, i, data) {
            var time = item.time * 1000;
            btcPriceUsd.data.push([time, item.price]);
        });

        options.series.push(btcPriceUsd);
    });

    // Draw the chart assuming all the requests have been executed. (async: false)
    var chart = new Highcharts.Chart(options);
}

$(document).ready(function() {
	drawChart();
});