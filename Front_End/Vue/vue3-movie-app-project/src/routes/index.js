import { createRouter, createWebHashHistory } from 'vue-router'
import Home from './Home'
import Movie from './Movie'
import About from './About'

//main.js로 내보내기
export default createRouter({
  //Hash모드,history모드 2가지로 이용 가능
  //Hash모드 http://google.com/#/search
  history: createWebHashHistory(),
  
  //page를 구분
  routes: [
    {
      //페이지를 구분해주는 각각의 경로
      path : '/',
      //어떤 vue.js의 component를 연결할 것인지?
      component: Home
    },
    {
      path: '/movie',
      component: Movie
    },
    {
      path: '/about',
      component: About
    }
  ]
})