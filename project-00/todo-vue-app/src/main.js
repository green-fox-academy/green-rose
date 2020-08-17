import Vue from 'vue'
import VueRouter from 'vue-router'

import store from "./store";
import routes from "./router/routes.js"
import App from './App.vue'

Vue.use(VueRouter)

Vue.config.productionTip = false

const router = new VueRouter({
  routes, // short for routes: routes
  mode: 'history'
})

new Vue({
  router,
  store,
  render: h => h(App),
}).$mount('#app')