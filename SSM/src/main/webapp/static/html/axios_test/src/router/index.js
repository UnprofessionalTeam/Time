import VueRouter from "vue-router";

import Login from '../components/login/Index.vue'
import Home from '../components/home/Home.vue'

export default new VueRouter({
  routes:[
    {
      path:'/',
      component:Login
    },
    {
      path:'/home',
      component:Home,
      children:[
        
      ]
    }   
  ]
})