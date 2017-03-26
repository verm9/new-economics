function call() {
    var msg   = $('#calcForm').serialize();
    $.ajax({
        type: 'GET',
        url: '/eth/doCalculationsForAMonth',
        data: msg,
        success: function(data) {
            $('#roiDiv').show();
            $('#profitTable').show();
            $('#profitInCryptoCurrencyTd').html(data.profitInCryptoCurrencyTd);
            $('#profitInBtcTd').innerHTML = data.profitInCryptoCurrencyTd;
            $('#profitInUsdTd').text(data.profitInCryptoCurrencyTd.toString());
            $('#profitInRubTd').text(data.toString());
            console.log(data.profitInCryptoCurrency);
            console.log(data);
        },
        error:  function(xhr, str){
            alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });

}
