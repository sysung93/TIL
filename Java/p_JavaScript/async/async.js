//1. async
async function fetchUser(){
    return 'ellie';
}
const user = fetchUser();
user.then(console.log);
console.log(user);

//2. await
function delay(ms){
    return new Promise(resolve => setTimeout(resolve, ms));
}

async function getApple() {
    await delay(1000);
    return '🍎';
}

async function getBanana() {
    await delay(1000);
    return'🍌';
}

// function picFruits() {
//     return getApple()
//     .then(apple => {
//         return getBanana().
//         then(banana => `${apple} + ${banana}`);
//     });
// }

async function picFruits() {
    const apple = await getApple();
    const banana = await getBanana();
    retrun `${apple} + ${banana}`;
}

picFruits().then(console.log)