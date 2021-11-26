<template>
  <div>
    <div id="reg_input_area">
      <span>学 号：</span><el-input placeholder="请输入学号" v-model="account" prefix-icon="el-icon-s-custom"></el-input><br>
      <span>学 号：</span><el-input placeholder="请输入密码" v-model="password" show-password prefix-icon="el-icon-s-unfold"></el-input>      
      <div style="display:flex;width:100%;justifyContent: space-around;margin:10px 0px 10px 0px;color:rgb(119, 119, 119)">
        <el-switch
          v-model="rememberMe"
          active-text="记住我"
        >
        </el-switch>
        <el-switch
          v-model="autoLogin"
          active-text="免登陆"
        >
        </el-switch>
      </div>
    </div>
    <div id="reg_button_area">
      <el-button @click="login">登陆</el-button>
    </div>    
  </div>
</template>
<script>
export default {
  data(){
    return {
      account:'',
      password:'',
      rememberMe:false,
      autoLogin:false,    
    }
  },
  methods:{
    login(){
      window.sessionStorage.setItem('gdutAccount',this.account)//保存当前会话用户输入的账号不因刷新而丢失
      
    }
  },
  mounted(){
    
  }
}
</script>
<style scoped>
  #reg_input_area{
    border:solid 1px rgb(224, 224, 224);
    border-radius: 10px;
    padding: 10px;
  }
  #reg_input_area .el-input{
    margin: 10px 0px 10px 0px;
    width: 80%;
  }
  #reg_input_area span{
    font-weight: 500;
    font-size: 18px;
    display: inline-block;
    text-align: center;
    width: 20%;
  }
</style>