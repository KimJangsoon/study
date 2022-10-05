import Vue from 'vue'
import VueRouter from 'vue-router'
import HomeView from '../views/HomeView.vue'
import Test from "@/components/basics/Test";
import RpgGameView from "@/views/rpg/RpgGameView";

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/test',
    name: 'test',

    component: Test
  },
  {
    path: '/rpg_game',
    name: 'rpg_game',

    component: RpgGameView
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
