<template>
  <div id="container" ref="container" style="width:100%;height:100%"></div>
</template>
<script>
  export default {
    data(){
      return{
        option:{
            tooltip: {
              trigger: 'item'
            },
            legend: {
              top: '5%',
              left: 'center'
            },
            series: [
              {
                name: '时长',
                type: 'pie',
                radius: ['50%', '70%'],
                avoidLabelOverlap: false,
                itemStyle: {
                  borderRadius: 10,
                  borderColor: '#fff',
                  borderWidth: 2
                },
                label: {
                  show: false,
                  position: 'center'
                },
                emphasis: {
                  label: {
                    show: false,
                    fontSize: '40',
                    fontWeight: 'bold'
                  }
                },
                labelLine: {
                  show: false
                },
                data: []
              }
            ]
        },
        theInfo:[],
        theCharts:'',
        
      }
    },    
    methods:{
      getInfo(info){           
        var option = this.theCharts.getOption()
        option.series[0].data = info
        this.theCharts.setOption(option)        
      },
      update(data){        
        this.getInfo(data)
      },
      getText(info){
      return '7h'
      },
    },    
    mounted(){
      var chartDom = document.getElementById('container');
      var myChart = this.$echarts.init(chartDom);
      this.theCharts = myChart
      this.option && myChart.setOption(this.option,true);

      this.$bus.$on('getInfo',this.getInfo)
      this.$bus.$on('updateShow',this.update)
    }
  }
</script>