import React from 'react';
import { Routes, Route, useNavigate } from 'react-router-dom';
import Home from './Component/Home/Home';
import Join from './Component/Member/Join/Join';
import Login from './Component/Member/Login/Login';
import Header from './Component/Common/Header/Header';
import Footer from './Component/Common/Footer/Footer';
import './styles/App.css';

function Navigation() {
  const navigate = useNavigate();
  return (
    <nav className="nav">
      <button onClick={() => navigate('/')}>메인</button>
      <button onClick={() => navigate('/join')}>회원가입</button>
      <button onClick={() => navigate('/login')}>로그인</button>
    </nav>
  );
}

function App() {
  return (
    <div className="container">
      <Header />
      <Navigation />
      <main className="main">
        <Routes>
          <Route path="/" element={<Home />} />
          <Route path="/join" element={<Join />} />
          <Route path="/login" element={<Login />} />
        </Routes>
      </main>
      <Footer />
    </div>
  );
}

export default App;
