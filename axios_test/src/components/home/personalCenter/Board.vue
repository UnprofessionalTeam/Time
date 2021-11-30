<template>
  <div class="board">
    <h2>时长记录</h2>
    <el-col>
      <el-card shadow="hover">
        <el-collapse v-model="activeNames">
          <el-collapse-item v-for="(item) in titles" :key="item.key" :title="item.name" :name="item.key">                       
              <div v-for="item1 in info[item.key]" :key="item1.name" shadow="hover" style="width:95%">
                <span>{{item1.name}}</span>
                <span class="score">{{item1.value}}</span>
              </div>                                                
          </el-collapse-item>
        </el-collapse>  
      </el-card>
    </el-col>
  </div>
</template>
<script>
export default {
  data() {
    return {
      activeNames:['shuangChuang'],
      titles:[
        {name:'双创实训时长',key:'shuangChuang'},
        {name:'文体艺术时长',key:'wenTi'},
        {name:'理想信念时长',key:'liXiang'},
        {name:'实践志愿时长',key:'zhiYuan'},
        {name:'校园建设时长',key:'jianShe'}
      ],
      info:{
        shuangChuang:[{name:'活动1',value:'2'},{name:'活动2',value:'2'}],
        wenTi:[],
        liXiang:[],
        zhiYuan:[],
        jianShe:[]
      }
    }
  },
}
</script>
<style scoped>
  .board{   
    height: 100%; 
    overflow: scroll;
  }
  .board::-webkit-scrollbar {display:none}
  .item{
    width: 90%;
    padding: 2px;
    border: solid 1px rgb(224, 224, 224);
    border-radius: 5px;
    background-color: #fff;
  }
  .score{  
    float: right;
    background-color:#67C23A;
    color: rgb(255, 255, 255);
    border-radius: 4px;
    text-align: center;
    line-height: 18px;
    width:18px;    
    height:18px;
  }
</style>