// function a(callback) {
//   setTimeout(() => {
//     console.log('A')
//     callback()
//   }, 1000)
// }

function a() {
  // promise 약속의 객체가 반환된다.
  return new Promise(function (resolve) {
    setTimeout(function () {
      console.log('A')
      resolve('Hello A')
    }, 1000)
  })
}

function b() {
  return new Promise(function (resolve) {
    setTimeout(function () {
      console.log('B')
      resolve('Hello B')
    }, 1000)
  })
}

function c() {
  return new Promise(function (resolve) {
    setTimeout(function () {
      console.log('C')
      resolve('Hello C')
    }, 1000)
  })
}

function d() {
  return new Promise(function (resolve) {
    setTimeout(function () {
      console.log('D')
      resolve('Hello D')
    }, 1000)
  })
}

async function test() {
  const h1 = await a()
  const h1 = await b()
  const h1 = await c()
  const h1 = await d()
  console.log('done!')
}

test()
