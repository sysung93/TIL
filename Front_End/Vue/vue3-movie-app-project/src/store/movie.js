//영화 검색과 관련된 데이터 취급
import axios from 'axios'
import _uniqBy from 'lodash/uniqBy'

export default {
  //movie.js가 store에서 module화 될수있다는 것을
  //명시적으로 나타내주는 것
  namespaced: true,
  
  //실제로 취급해야되는 각각의 데이터
  state: () => ({
      movies: [],
      message: '',
      loading: false
  }),
  
  //상태를 활용해서 계산된 데이터를 만들어 내는 것
  getters: { },
  
  // methods와 유사
  // 변이. mutations를 통해 관리하는 데이터를 변경이 가능하다.
  // mutations를 통해서만 데이터 수정이 가능하다.
  mutations: {
    updateState(state, payload) {
      //['movies', 'message', 'loading']
      Object.keys(payload).forEach(key => {
        state[key] = payload[key]
      })
    },
    resetMovies(state){
      state.movies = []
    }
  },
  
  // 비동기로 동작을 한다.
  // 실제로 데이터를 갱신하기위해 mutations의 updateState를 commit메소를 통해 실행하고
  // 실행할때 기본적인 객체데이터를 담아서 payload매개변수로 전달이 된다.
  // payload는 객체데이터, object.keys를 통해 배열데이터로 만들어서 반복해서 state로 할당.
  actions: {
    async searchMovies({ state, commit }, payload) {
      const { title, type, number, year} = payload
      const OMDB_API_KEY = '7035c60c'

      const res = await axios.get(`https://www.omdbapi.com/?apikey=${OMDB_API_KEY}&s=${title}&type=${type}&y=${year}&page=1`)
      const { Search, totalResults } = res.data
      commit('updateState', {
        movies: _uniqBy(Search, 'imdbID')
      })
      console.log(totalResults)
      console.log(typeof totalResults)

      const total = parseInt(totalResults, 10)
      const pageLength = Math.ceil(total / 10)

      if(pageLength > 1) {
        for(let page = 2; page <= pageLength; page += 1) {
          if(page > (number / 10)) break
          const res = await axios.get(`https://www.omdbapi.com/?apikey=${OMDB_API_KEY}&s=${title}&type=${type}&y=${year}&page=${page}`)
          const { Search } = res.data
          commit('updateStae', {
            movies: [
              ...state.movies, 
              ..._uniqBy(Search, 'imdbID')]
          })
        }
      }
    }
  }

}