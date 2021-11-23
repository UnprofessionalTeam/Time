import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import VueRouter from 'vue-router';
import router from './router/index.js'
import 'element-ui/lib/theme-chalk/index.css';
import store from './store/index.js'


Vue.config.productionTip = false
Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.use(VueRouter)

new Vue({
  render: h => h(App),
  store,
  router,
  beforeCreate(){
    Vue.prototype.$bus = this
  }
}).$mount('#app')
