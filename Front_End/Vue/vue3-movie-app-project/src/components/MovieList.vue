<template>
  <div class="container">
    <div class="inner">
      <MovieItem 
        v-for="movie in movies"
        :key="movie.imdbID" 
        :movie="movie"
        />  
    </div>
  </div>
</template>

<script>
import MovieItem from '~/components/MovieItem'

export default {
  components: {
    MovieItem
  },
  //Store에 있는 movie 데이터를 가져온다
  computed: {
    movies() {
      return this.$store.state.movie.movies
    }
  }
}
</script>