import React, { useState } from 'react';
import axios from 'axios';

function Login() {
  const [form, setForm] = useState({ id: '', password: '' });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleLogin = async () => {
    try {
      const res = await axios.post('http://localhost:8080/user/login', form);
      alert('로그인 결과: ' + res.data.result);
    } catch (err) {
      alert('오류 발생: ' + err.message);
    }
  };

  return (
    <div>
      <h2>로그인</h2>
      <form>
        <input type="text" name="id" placeholder="아이디" onChange={handleChange} />
        <input type="password" name="password" placeholder="비밀번호" onChange={handleChange} />
        <button type="button" onClick={handleLogin}>로그인</button>
      </form>
    </div>
  );
}

export default Login;
