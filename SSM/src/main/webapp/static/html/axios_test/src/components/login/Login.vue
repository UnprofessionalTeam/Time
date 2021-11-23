<template>
  <div>
    <div id="login_input_area">
      <el-form :model="info" :rules="rules">
        <el-form-item prop="account">
          <span>学 号：</span><el-input placeholder="请输入学号" v-model="info.account" prefix-icon="el-icon-s-custom"></el-input>
        </el-form-item>
        <br>
        <el-form-item prop="password">
          <span>密 码：</span><el-input placeholder="请输入密码" v-model="info.password" show-password prefix-icon="el-icon-s-unfold"></el-input>
        </el-form-item>   
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
      </el-form>
    </div>
    <div id="login_button_area">
      <el-button @click="login">登陆</el-button>
    </div>    
  </div>
</template>
<script>
import axios from 'axios'
export default {
  data(){
    return {
      info:{
        account:'',
        password:'',
      },
      rules:{
        account:[
          { required: true, message: '请输入学号', trigger: 'blur' },
          { min:10,max:10, message: '格式不正确', trigger: 'blur' }
        ],
        password:[
          { required: true, message: '密码不能为空', trigger: 'blur' },
          { min:6 ,max:15, message:'密码长度在6-15之间',trigger: 'blur'}
        ]
      },
      rememberMe:false,
      autoLogin:false,    
    }
  },
  methods:{
    login(){
      window.sessionStorage.setItem('gdutAccount',this.account)//保存当前会话用户输入的账号不因刷新而丢失          
      return axios({
        method:"get",
        params:this.info,
        url:'/api/SSM/login/in'
      }).then(resp=>{
        console.log(resp)
        if(resp.status == 200 && resp.data.state=='ok'){
          window.localStorage.setItem('gdutAccount',this.info.account);//登陆成功记住账号
          if(this.rememberMe){window.localStorage.setItem('gdutPassword',this.info.password);}//记住密码对应操作
          else{window.localStorage.removeItem('gdutPassword')}
          window.localStorage.setItem('isAuto',this.autoLogin)
          this.$notify({title:'登陆情况',message:resp.data.message,type:'success',position: 'top-left',duration:2000})
          setTimeout(()=>{this.$router.push('/home')},1000)
        } else {
          this.info.password = ''
          this.$notify.error({title:'登陆情况',message:resp.data.message,position: 'top-left'})
        }

      }).catch(err=>{
        console.log(err)
      })
    }
  },
  mounted(){
    //从浏览器本地储存中取出账号    
    let gdutAccount = window.localStorage.getItem('gdutAccount')||'';
    this.info.account = gdutAccount;
    let gdutPassword = window.localStorage.getItem('gdutPassword')||'';
    this.info.password = gdutPassword;
    let isAuto = window.localStorage.getItem('isAuto')==='true'?true:false
    this.autoLogin = isAuto
    if(gdutPassword){this.rememberMe = true}    
    if(isAuto){//如果设置了自动登录
      if(!gdutPassword&&gdutAccount){this.autoLogin = false;this.$notify({message:'请重新登陆'})}
      else{this.login()}
    }        
  }
}
</script>
<style scoped>
  #login_input_area{
    border:solid 1px rgb(224, 224, 224);
    border-radius: 10px;
    padding: 10px;
  }
  #login_input_area .el-input{    
    width: 80%;
  }
  #login_input_area span{
    font-weight: 500;
    font-size: 18px;
    display: inline-block;
    text-align: center;
    width: 20%;
  }
</style>