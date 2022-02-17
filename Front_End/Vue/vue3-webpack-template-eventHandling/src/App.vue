<!-- 이벤트 핸들링
<template>
  <button @click="handlerA(), handlerB()"> 
    Click me!
  </button>
</template>

<script>
export default {
  methods: {
    handlerA(){
      console.log('A')
    },
    handlerB(){
      console.log('B')
    }
  }
}
</script>

-->

<template>
  <a 
    href="http://naver.com"
    target="_blank"
    @click.once="handler">
    NAVER
    </a>
</template>

<script>
export default {
  methods: {
    handler() {
      console.log('ABC')
    }
  }
}
</script>
