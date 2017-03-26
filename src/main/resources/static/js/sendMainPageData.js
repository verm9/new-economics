function call() {
    var msg   = $('#calcForm').serialize();
    $.ajax({
        type: 'GET',
        url: '/eth/doCalculationsForAMonth',
        data: msg,
        success: function(data) {
            $('#roiDiv').show();
            $('#roiParagraph').html("ROI: <b>" + Number(data.roiDays).toFixed(0) + "</b> days (" + Number(365 / data.roiDays * 100).toFixed(0) + "%/year)");
            $('#profitTable').show();
            $('#profitInCryptoCurrencyTd').html(data.profitInCryptoCurrencyTd);
            $('#profitInBtcTd').innerHTML = data.profitInCryptoCurrencyTd;
            $('#profitInUsdTd').text(data.profitInCryptoCurrencyTd.toString());
            $('#profitInRubTd').text(data.toString());
            $('#wastedPowerInRubTd').html(data);
            console.log(data.profitInCryptoCurrency);
            console.log(data);
        },
        error:  function(xhr, str){
            alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });

}
