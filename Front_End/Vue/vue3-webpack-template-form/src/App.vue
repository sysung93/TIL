<template>
  <MyBtn @click="log" @change-msg="logMsg">
    Banana
  </MyBtn>
</template>

<script>
import MyBtn from '~/components/MyBtn'

export default {
  components: {
    MyBtn
  },

  methods: {
    log(event) {
      console.log('Click!!')
      console.log(123)
    },
    logMsg(msg){
      console.log(msg)
    }
  }
}
</script>