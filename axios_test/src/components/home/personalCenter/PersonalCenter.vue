<template>
<div>
  <div class="box">
    <Show></Show>    
  </div>
  
</div>
  
</template>

<script>
import Show from '../personalCenter/Show.vue'
import axios from 'axios'
export default {
  components:{Show},
  data() {
    return {

    }
  },
  methods:{
    
  },
  mounted(){
    axios({
      method:"get",
      url:'/SSM/user/info',

    }).then(resp=>{
      //{"id":"3119005418","speciality":"信息安全","classNo":"信安一","timeInfo":{"wenTi":5.0,"shuangChuang":2.0,"zhiYuan":6.0,"xiaoYuan":17.0,"liXiang":9.0}}
      let item = resp.data.timeInfo
      let sum = 0
      let keys = Object.keys(item)
      keys.forEach(element=>{
        sum+=item[element]
      })

      let info = [
        {name:'文体',value:item.wenTi},
        {name:'双创',value:item.shuangChuang},
        {name:'志愿',value:item.zhiYuan},
        {name:'校园',value:item.xxiaoYuan},
        {name:'理想',value:item.liXiang},
        {name:'剩余',value:50-sum}
      ]
      this.$bus.$emit('updateShow',info)

    }).catch(err=>{

    })  
  }
}
</script>

<style scoped>
  .box {
  
    width: 400px;
    height: 400px;
  }
</style>