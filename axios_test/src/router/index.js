import VueRouter from "vue-router";

import Login from '../components/login/Index.vue'
import Home from '../components/home/Home.vue'
import PersonalCenter from '../components/home/personalCenter/PersonalCenter.vue'

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
        {
          path:"/",
          component:PersonalCenter
        },{
          path:"/activities"
        }
      ]
    }   
  ]
})