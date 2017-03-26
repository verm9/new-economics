/**
 * Created by eignatik on 3/26/17.
 */

var main = {
    /**
     * init chart function (from charts.js)
     */
    initChart: function() {
      Chart.init();
    }
};

$(document).ready(function(){
    main.initChart();
});
