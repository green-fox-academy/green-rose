import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App.vue'
import Home from './components/Home.vue'
import ToDo from './components/ToDo.vue'

Vue.use(VueRouter)

Vue.config.productionTip = false

const routes = [
  { path: '/todo', component: ToDo },
  { path: '/', component: Home },
]

const router = new VueRouter({
  routes // short for routes: routes
})

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')