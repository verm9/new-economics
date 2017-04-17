$(document).ready(function() {

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

    $.getJSON('./js/data.json', function(data) {
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
				$.getJSON('./js/dataROI.json', function(roiData) {
					console.log(roi.data);
					roi.data.push([time, roiData.roiDays]);
				});
			}
		});
		
        options.series.push(totalHashRate);
		options.series.push(btcPrice);
		console.log(roi);
		options.series.push(roi);
        var chart = new Highcharts.Chart(options);
    });

});