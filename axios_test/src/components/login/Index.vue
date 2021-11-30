<template>
  <div id="login_box" >
    <transition-group name="el-zoom-in-top">
    <div ref="login_view" v-show="loginState" :key=1>
      <h2 style="marginLeft:10px;marginRight:10px;display:inline-block">登 陆</h2>
      <el-button circle icon="el-icon-refresh" size="mini" @click="changeView"></el-button>
      <h4 style="marginLeft:10px;display:inline-block">注 册</h4>
      <Login></Login>
    </div>
    <!-- </transition>
    <transition name="el-zoom-in-bottom"> -->
    <div ref="register_view" v-show="registerState" :key=2>
      <h4 style="marginLeft:10px;marginRight:10px;display:inline-block">登 陆</h4>
      <el-button circle icon="el-icon-refresh" size="mini" @click="changeView"></el-button>
      <h2 style="marginLeft:10px;display:inline-block">注 册</h2>
      <Register></Register>   
    </div> 
    </transition-group>   
  </div>
</template>
<script>
import Login from './Login.vue'
import Register from './Register.vue'
export default {
  components:{
    Login,
    Register,
  },
  data(){
    return {
      loginState:true,
      registerState:false,
      
    }
  },
  methods:{
    changeView(){
      this.loginState = !this.loginState      
      this.$nextTick(()=>{this.registerState = !this.registerState})                
    }
  }
}
</script>
<style scoped>
  #login_box {
    color: rgb(119, 119, 119);
    position: relative;
    left: calc(50vw - 200px);
    top: calc(25vh);
    width: 400px;
    
    border-radius: 10px;
    border: solid 1px rgb(224, 224, 224);
    box-shadow: 2px 3px 10px 0px rgba(0, 0, 0, 0.2);
    padding: 25px 10px 25px 10px;
    background-color: rgb(255, 255, 255);
  }
</style>