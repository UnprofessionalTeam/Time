import Vue from 'vue'
import App from './App.vue'
import ElementUI from 'element-ui';
import VueRouter from 'vue-router';
import router from './router/index.js'
import 'element-ui/lib/theme-chalk/index.css';
import store from './store/index.js'
import * as echarts from 'echarts/core';
import { TooltipComponent, LegendComponent } from 'echarts/components';
import { PieChart } from 'echarts/charts';
import { LabelLayout } from 'echarts/features';
import { CanvasRenderer } from 'echarts/renderers';


Vue.config.productionTip = false
Vue.config.productionTip = false
Vue.use(ElementUI);
Vue.use(VueRouter)
echarts.use([
  TooltipComponent,
  LegendComponent,
  PieChart,
  CanvasRenderer,
  LabelLayout
]);

new Vue({
  render: h => h(App),
  store,
  router,
  beforeCreate(){
    Vue.prototype.$bus = this
    Vue.prototype.$echarts = echarts
  }
}).$mount('#app')
