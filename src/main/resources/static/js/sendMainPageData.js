function call() {
    var msg   = $('#calcForm').serialize();
    $.ajax({
        type: 'GET',
        url: '/eth/doCalculationsForAMonth',
        data: msg,
        success: function(data) {
            $('#results').html(data);
        },
        error:  function(xhr, str){
            alert('Возникла ошибка: ' + xhr.responseCode);
        }
    });

}
