import client from './client';

// 로그인
export const login = ({ userid, password }) =>
  client.post('/api/auth/login', { userid, password });

// 회원가입
export const register = ({ userid, username, password }) =>
  client.post('/api/auth/register', { userid, username, password });

// 로그인 상태 확인
export const check = () => client.get('/api/auth/check');