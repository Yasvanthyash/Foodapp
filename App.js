import React from 'react';
import { BrowserRouter,Routes,Route } from 'react-router-dom';
import './App.css';
import Login from './Login';
import Signup from './Signup';
import Post from './Post';
import TableData from './Table';
import Home from './Home';
function App() {
  return (
    <div className="App">
      <BrowserRouter>
      <Routes>
      <Route path='/' element={<Login/>}></Route>
      <Route path='Signup' element={<Signup/>}></Route>
      <Route path="/home" element={<Home />} />
        <Route path="/get" element={<TableData />} />
        <Route path="/post" element={<Post />} />
      </Routes>
      </BrowserRouter>      
    </div>
  );
}

export default App;