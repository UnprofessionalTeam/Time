<template>
  <div id="app">    
    <div ref="bg" v-if="bgShow" class="bg" :style="note" v-on="{mouseover:bgC,mouseleave:bgI}"></div>    
    <router-view></router-view>
  </div>
</template>

<script>


export default {
  name: 'App',
  components: {
    
  },
  data(){
    return{
      note: {
        backgroundImage: "url(" + require("./assets/logo.png") + ")",
        backgroundRepeat: "no-repeat",
        backgroundPosition: "25px auto",     
          
      },
      isBg:true,      
    }    
  }, 
  computed:{
    bgShow:function(){
      return this.$route.path=='/'
    }
  }, 
  methods:{
    bgC(){
      this.$refs.bg.setAttribute('class','bg')
    },
    bgI(){
      this.$refs.bg.setAttribute('class','bg bgc')
    }
  },
  mounted(){ 
       
  }
}
</script>

<style>
  body{
    margin: 0px;
  }
  #app{
    background-color: rgb(235, 235, 235);
    height: 100vh;
    width: 100vw;
  }
  .bg{
    position: absolute;
    width: 100vw;
    height: 100vh;    
  }
  .bgc{
    filter: blur(10px);
  }
</style>
