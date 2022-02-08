// html의 search > input을 찾는다
const searchEl = document.querySelector('.search');
const searchInputEl = searchEl.querySelector('input')

// search에 클릭 이벤트 추가
searchEl.addEventListener('click', function(){
  searchInputEl.focus();
});

searchInputEl.addEventListener('focus',function(){
  searchEl.classList.add('focused');
  //searchInputEl에 html을 추가하겠다
  searchInputEl.setAttribute('placeholder', '통합검색');
});

searchInputEl.addEventListener('blur',function(){
  searchEl.classList.remove('focused');
  searchInputEl.setAttribute('placeholder', '');
});

//뱃지 사라지게하기
const badgeEl = document.querySelector('header .badges');
//_.throttle(함수, 시간) 내가 실행하고자 하는 함수가 몇초 단위로 실행될건지 정하는 것
window.addEventListener('scroll', _.throttle(function(){
  console.log(window.scrollY);
  if(window.scrollY > 500){
    //배지 숨기기
    // 애니메이션 처리 gsap.to(요소, 지속시간, 옵션)
    gsap.to(badgeEl, 0.6, {
      opacity : 0,
      display : 'none'
    })
  } else{
    //배지 보이기
    gsap.to(badgeEl, 0.6, {
      opacity : 1,
      display : 'block'
    })
    
  }
}, 300));


//visual section image 나타내기
const fadeEls = document.querySelectorAll('.visual .fade-in');
fadeEls.forEach(function(fadeEl, index) {
  gsap.to(fadeEl, 1, {
    delay: (index + 1) * 0.7, //0.7  1.4  2.1  2.7
    opacity: 1
  })
});
