import logo from './logo.svg';
import './App.css';
import { Calendar } from 'antd';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit <code>src/App.js</code> and save to reload.
        </p>
        <Calendar fullscreen={false}  />
      </header>
    </div>
  );
}

export default App;
