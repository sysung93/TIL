import React, { Component } from 'react';

class Counter extends Component {
  state = {
    number: 0,
    fixedNumber: 0
  };
  
  render() {
    //state를 초기화 할떄는 this.state로 조회
    const { number, fixedNumber } = this.state;
    return (
      <div>
        <h1>{number}</h1>
        <h2>바뀌지 않는 값: {fixedNumber}</h2>
        <button
          /* onClick을 통해 버튼이 클릭되었을 때 호출 될 함수*/
          onClick={() => {
            this.setState(
              {
                number: number +1
              },
              () => {
                console.log('방금 setState가 호출되었습니다.');
                console.log(this.state);
              }
            )
          }}
        >
        +1
        </button>
      </div>
    )
  }
}

export default Counter;