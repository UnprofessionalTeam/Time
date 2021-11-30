<template>
  <div>
    <h2>个人信息</h2>    
    <el-card :body-style="{ padding: '0px' }" class="">      
      <div style="padding: 14px;">        
        <el-avatar :size="80" :src="circleUrl" style="verticalAlign:middle"></el-avatar>
        <h1 style="display:inline-block;marginLeft:20px;verticalAlign:middle">{{info.name}}</h1>
      </div>
    </el-card>
    <br>
    <el-card>
      <div v-for="item in list" :key="item.key" class="text">
        <span style="fontWeight:700">{{item.value}}：</span>
        <span>{{info[item.key]}}</span>
      </div>
    </el-card>
  </div>
</template>
<script>
import avatar from '../../../assets/logo.png'
export default {
  data() {
    return{
      circleUrl:avatar,
      list:[        
        {key:'department',value:'学院'},
        {key:'speciality',value:'专业'},
        {key:'classno',value:'班级'},
        {key:'sno',value:'学号'},
        {key:'introduction',value:'个人简介'},
      ],
      info:{
        name:'Rengoz',
        department:'计算机学院',
        speciality:'信息安全',
        classno:'1班',
        sno:'3119005418',
        introduction:'阿巴巴'
      }
    }    
  },
}
</script>
<style scoped>
  .text {
    padding: 5px;
    font-family:  "Helvetica Neue",Helvetica,"PingFang SC","Hiragino Sans GB","Microsoft YaHei","微软雅黑",Arial,sans-serif;
  }
</style>