<template>
  <div>
    <Banner></Banner>    
    <router-view></router-view>
  </div>
</template>
<script>
import Banner from './banner/Banner.vue'
export default {
  components:{Banner},
  data(){
    return{}
  },
  mounted(){
  }
}
</script>
<style scoped>

</style>