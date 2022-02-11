import axios from 'axios'

function fetchMovies(){
  axios
  .get('https://www.omdbapi.com/?apikey=7035c60c&s=frozen')
  .then(res => {
    console.log(res)
    const h1El = document.querySelector('h1')
    const imgEl = document.querySelector('img')
    h1El.textContect = res.data.Search[0].title
    imgEl.src = res.data.Search[0].Poster
  })
}
fetchMovies()