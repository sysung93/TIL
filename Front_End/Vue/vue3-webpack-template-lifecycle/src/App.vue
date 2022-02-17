<template>
  <h1>{{ count }}</h1>
</template>

<script>
export default {
  data() {
    return{
      count: 2
    }
  },
  beforeCreate() {
    console.log('Before Create!')
  },
  created() {
    console.log('Created!', this.count)
  },
  beforeMount() {
    console.log('Before Mount!')
    console.log(document.querySelector('h1'))  
  },
  mounted() {
    console.log('Mounted!')
    
  },
}
</script>