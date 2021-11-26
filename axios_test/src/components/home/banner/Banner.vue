<template>
  <el-menu
    :default-active="activeIndex"
    class="el-menu-demo"
    mode="horizontal"
    @select="handleSelect"
    background-color="rgb(0,0,0,0.8)"
    text-color="#fff"
    active-text-color="#ffd04b"
    :router="true"
    >
    <el-menu-item index="/home">个人首页</el-menu-item>
    <el-submenu index="2">
      <template slot="title">活动中心</template>
      <el-menu-item index="2-1">选项1</el-menu-item>
      <el-menu-item index="2-2">选项2</el-menu-item>
      <el-menu-item index="2-3">选项3</el-menu-item>
      <el-submenu index="2-4">
        <template slot="title">管理</template>
        <el-menu-item index="2-4-1">选项1</el-menu-item>
        <el-menu-item index="2-4-2">选项2</el-menu-item>
        <el-menu-item index="2-4-3">选项3</el-menu-item>
      </el-submenu>
    </el-submenu>
    <el-menu-item index="3">消息中心</el-menu-item>
    <el-menu-item index="4"><a href="https://www.ele.me" target="_blank">订单管理</a></el-menu-item>
    <span id="logout">
      <Avatar></Avatar>
      <a style="color:white;" href="javascript:" @click="logout">退出登录</a>
    </span>    
  </el-menu>
</template>

<script>
import Avatar from '../personalCenter/Avatar.vue'
  export default {
    components:{Avatar},
    data() {
      return {
        activeIndex: this.$route.path,        
      };
    },
    methods: {
      logout(){
        window.localStorage.removeItem("gdutPassword");
        window.localStorage.removeItem("isAuto")
        this.$router.replace("/")
      },
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
        console.log(this.$router)
        console.log(this.$route.path)
      }
    }
  }
</script>

<style scoped>
 #logout{   
   height: 60px;
   margin:0 auto;
   line-height: 60px;
   float: right;   
   margin-right: 15px;   
 }
 a {
   text-decoration: none;
 }
</style>