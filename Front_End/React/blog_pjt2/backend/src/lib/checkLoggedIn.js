//로그인 상태가 아니라면 401
//로그인 상태인경우 그 다음 미들웨어 실행
const checkLoggedIn = (ctx, next) => {
  if (!ctx.state.user) {
    ctx.status = 401;
    return;
  }
  return next();
};

export default checkLoggedIn;
