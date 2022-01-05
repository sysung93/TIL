//Q. 주어진 배열을 스트링으로 변환
{
const fruits = ['apple', 'banana', 'orange'];
const result = fruits.join('|');
console.log(result);
}

//Q2. 주어진 스트링을 배열로 만들기
{
const fruits = '🥝,🍇,🍈,🍊';
const result = fruits.split(',', 2);
console.log(result);
}

//Q3. 주어진 배열의 순서를 거꾸로 만들기
{
const array = [1, 2, 3, 4, 5];
const result = array.reverse();
console.log(result);
console.log(array);
}

//Q4. 주어진 배열에서 첫번째와 두번째 요소를 삭제하고 새로운 배열을 만들기
{
const array = [1, 2, 3, 4, 5];
const result = array.slice(2, 5);
console.log(result);
console.log(array);
}

class Student {
    constructor(name, age, enrolled, score) {
      this.name = name;
      this.age = age;
      this.enrolled = enrolled;
      this.score = score;
    }
  }
  const students = [
    new Student('A', 29, true, 45),
    new Student('B', 28, false, 80),
    new Student('C', 30, true, 90),
    new Student('D', 40, false, 66),
    new Student('E', 18, true, 88),
  ];

//Q5. 학생의 점수가 90점인 학생을 찾기
{
    const result =  students.find((student) => student.score === 90);
    console.log(result);
}

//Q6. 수업에 등록한 학생들만 골라서 배열을 만들기
{
    const result = students.filter((student) => student.enrolled);
    console.log(result);
}

// Q7. 학생들의 배열에서 점수만 뽑아서 새로운 배열 만들기
{
const result = students.map((student) => student.score);
console.log(result);
}
//Q8. 배열안에 50점보다 작은 학생을 있는지 확인해서 true가 리턴되게 만들기

{
const result = students.some((students) => students.score < 50);
console.log(result);

const result2 = students.every((students) => students.score > 90);
console.log(result2);
}

;
//Q9. 학생들의 평균 점수를 구하시오
{
const result = students.reduce((prev, curr) => {
    console.log('----------');
    console.log(prev);
    console.log(curr);
    return prev + curr.score;
}, 0);
console.log(result / students.length);
}

//Q10. 학생들의 모든 점수를 string으로 변환하기
{
const result = students
    .map((students) => students.score)
    .filter((score) => score >= 50)
    .join();
console.log(result);
}
console.clear()
//학생들의 점수를 오름차순으로 정렬해서 string으로 변환
{
const result = students.map((students) => students.score)
.sort((a, b) => a - b)
.join();
console.log(result);
}
