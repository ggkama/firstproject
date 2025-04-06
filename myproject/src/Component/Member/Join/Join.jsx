import React, { useState } from 'react';
import axios from 'axios';

function Join() {
  const [form, setForm] = useState({
    id: '',
    name: '',
    address: '',
    phone: '',
    password: ''
  });

  const handleChange = (e) => {
    setForm({ ...form, [e.target.name]: e.target.value });
  };

  const handleSubmit = async () => {
    try {
      const res = await axios.post('http://localhost:8080/user/signup', form);
      alert('회원가입 결과: ' + res.data.result);
    } catch (err) {
      alert('오류 발생: ' + err.message);
    }
  };

  return (
    <div>
      <h2>회원가입</h2>
      <form>
        <input type="text" name="id" placeholder="아이디" onChange={handleChange} />
        <input type="text" name="name" placeholder="이름" onChange={handleChange} />
        <input type="text" name="address" placeholder="주소" onChange={handleChange} />
        <input type="text" name="phone" placeholder="전화번호" onChange={handleChange} />
        <input type="password" name="password" placeholder="비밀번호" onChange={handleChange} />
        <button type="button" onClick={handleSubmit}>회원가입</button>
      </form>
    </div>
  );
}

export default Join;
