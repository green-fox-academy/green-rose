import Home from '../components/Home.vue'
import ToDo from '../components/ToDo.vue'
import OneItem from '../components/OneItem.vue'

export default [
    { path: '/todo/:id', component: OneItem },
    { path: '/todo', component: ToDo},
    { path: '/', component: Home},
]