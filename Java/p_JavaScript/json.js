//1. Object to JSON
let json = JSON.stringify(true);
console.log(json);


json = JSON.stringify(['apple', 'banana'])
console.log(json);

const rabbit = {
    name: 'tori',
    color: 'white',
    size: null,
    birthDate: new Date(),
    jump: () => {
        console.log(`${name} can jump!`)
    },
};

json = JSON.stringify(rabbit);
console.log(json);

json = JSON.stringify(rabbit,['name']);
console.log(json);


json = JSON.stringify(rabbit, (key, value) => {
    //console.log(`key: ${key}, value: ${value}`);
    return key === 'name'? 'ellie' : value;
});

console.log(json);

console.clear();
//2. JASON to Object
json = JSON.stringify(rabbit);
const obj = JSON.parse(json, (key, value) => {
    console.log(`key: ${key}, value: ${value}`)
    return key === 'birthDate' ? new Date(value) : value;
});
//console.log(obj)

console.log(rabbit.birthDate.getDate());
console.log(obj.birthDate.getDate());