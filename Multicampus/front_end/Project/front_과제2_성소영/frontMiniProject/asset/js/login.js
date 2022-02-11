let id = $('#id');
let pw = $('#pw');
let login = $('#btn-area');

$(login).on('click', function() {
    if($(id).val() == ""){
        alert('아이디를 입력해주세요');
    }
    else if($(pw).val() == ""){
        alert('패스워드를 입력해주세요');
    }
    else{
        //alert('로그인 성공!');
        window.location.href('index.html');
    }
})