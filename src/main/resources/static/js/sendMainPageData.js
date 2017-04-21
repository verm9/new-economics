function call() {
    var msg   = $('#calcForm').serialize();
    $.ajax({
        type: 'GET',
        url: '/eth/doCalculationsForAMonth',
        data: msg,
        success: function(data) {
            const localData = data;
            $('#roiDiv').show();
            $('#roiParagraph').html("ROI: <b>" + Number(data.roiDays).toFixed(0) + "</b> days (" + Number(365 / data.roiDays * 100).toFixed(0) + "%/year)");
            $('#profitTable').show();
            $('#profitInCryptoCurrencyTd').html(localData.profitInCryptoCurrency + "");
            $('#profitInBtcTd').html(localData.profitInBtc + "");
            $('#profitInUsdTd').html(localData.profitInUsd + "");
            $('#profitInRubTd').html(localData.profitInRub + "");
            $('#wastedPowerInRubTd').html(localData.wastedPowerInRub + "");
            console.log(data);
        },
        error:  function(xhr, str){
            alert('Error has occured: ' + xhr.responseCode);
        }
    });

}