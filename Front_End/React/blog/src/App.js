import React, { useState } from "react";
import logo from "./logo.svg";
import "./App.css";

function App() {
  let [title, settitle] = useState(["text", "text2", "text3"]);
  let [like, setlike] = useState(0);
  let [modal, setmodal] = useState(false);
  let [pushtitle, setpushtitle] = useState(0);

  function titleChange() {
    let newtitle = [...title];
    newtitle[0] = "여행지";
    settitle(newtitle);
  }

  return (
    <div className="App">
      <div className="black-nav">
        <div>개발 blog</div>
      </div>
      <button onClick={titleChange}>버튼</button>
      <div className="list">
        <h3>
          {title[0]}
          <span
            onClick={() => {
              setlike(like + 1);
            }}
          >
            ❤
          </span>
          {like}
        </h3>
        <p> 2월 17일 발행</p>
        <hr />
      </div>
      <div className="list">
        <h3> {title[1]} </h3>
        <p> 2월 17일 발행</p>
        <hr />
      </div>
      <div className="list">
        <h3>{title[2]} </h3>
        <p> 2월 17일 발행</p>
        <hr />
      </div>

      {title.map(function (a, i) {
        return (
          <div className="list">
            <h3>{a}</h3>
            <p> 2월 17일 발행</p>
            <hr />
          </div>
        );
      })}
      <buton
        onClick={() => {
          setpushtitle(0);
        }}
      >
        버튼 1
      </buton>
      <buton
        onClick={() => {
          setpushtitle(1);
        }}
      >
        버튼 2
      </buton>
      <buton
        onClick={() => {
          setpushtitle(3);
        }}
      >
        버튼 3
      </buton>

      <button
        onClick={() => {
          setmodal(!modal);
        }}
      ></button>
      {modal === true ? <Modal title={title} pushtitle={pushtitle} /> : null}
    </div>
  );
}

function Modal(props) {
  return (
    <div className="modal">
      <h2>{props.title[props.pushtitle]}</h2>
      <p>날짜</p>
      <p>상세내용</p>
    </div>
  );
}

export default App;
