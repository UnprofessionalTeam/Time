<template>
    <el-avatar ref="avatar" style="display:inline-block" :size="50" :src=imgUrl></el-avatar>                               
</template>

<script>
export default {
  props:{
    imgUrl:{required:false,type:String,default:'https://cube.elemecdn.com/3/7c/3ea6beec64369c2642b92c6726f1epng.png'}
  },
  data() {
    return {    
      
    }
  },
  methods:{
    append(){
      this.$refs.avatar.size = 60
    },
    close(){
      this.$refs.avatar.size = 50
    }
  },
  mounted(){
    
  }
}
</script>