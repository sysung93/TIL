package com.example.client.service;

import com.example.client.dto.Req;
import com.example.client.dto.UserRequest;
import com.example.client.dto.UserResponse;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class RestTemplateService {

    //http://localhost/api/server/hello
    //response
    //get으로 보내기
    public UserResponse hello(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("/api/server/hello")
                //주소뒤에 queryparam이 들어가야하면 queryparam작성
                .queryParam("name", "gildong")
                .queryParam("age", "15")
                .encode()
                .build()
                .toUri();

        System.out.println(uri.toString());
        RestTemplate restTemplate = new RestTemplate();

        //getForObject : http의 getmethod를 object로 가져오겠다는 의미
        //String result = restTemplate.getForObject(uri, String.class);
        ResponseEntity<UserResponse> result = restTemplate.getForEntity(uri, UserResponse.class);

        System.out.println(result.getStatusCode());
        System.out.println(result.getBody());
        return result.getBody();
    }

    //post로 보내기
    public UserResponse post() {
        //http://localhost:9090/api/server/user/{userId}/{userName}

        //주소만들기
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "gildong")
                .toUri();
        System.out.println(uri);

        //http body > object > object mapper > json > rest templat >  http body json
        //내가 보내고 싶은 body데이터 object로 만들기
        UserRequest req = new UserRequest();
        req.setName("gildong");
        req.setAge(20);

        //응답을 뭘로 받을지 지정
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.postForEntity(uri, req, UserResponse.class);

        System.out.println(response.getStatusCode());
        System.out.println(response.getHeaders());
        System.out.println(response.getBody());

        return response.getBody();
    }

    //header에 추가
    public UserResponse exchange(){
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "gildong")
                .toUri();
        System.out.println(uri);

        //http body > object > object mapper > json > rest templat >  http body json
        //내가 보내고 싶은 body데이터 object로 만들기
        UserRequest req = new UserRequest();
        req.setName("gildong");
        req.setAge(30);

        RequestEntity<UserRequest> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        //응답을 뭘로 받을지  지정
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<UserResponse> response = restTemplate.exchange(requestEntity, UserResponse.class);
        return response.getBody();

    }

    public Req<UserResponse> genericExchange() {
        URI uri = UriComponentsBuilder
                .fromUriString("http://localhost:9090")
                .path("api/server/user/{userId}/name/{userName}")
                .encode()
                .build()
                .expand(100, "gildong")
                .toUri();
        System.out.println(uri);

        //http body > object > object mapper > json > rest templat >  http body json
        //내가 보내고 싶은 body데이터 object로 만들기
        UserRequest userRequest = new UserRequest();
        userRequest.setName("gildong");
        userRequest.setAge(30);

        Req<UserRequest> req= new Req<>();
        req.setHeader(
            new Req.Header()
        );
        req.setResBody(
            userRequest
        );

        RequestEntity <Req<UserRequest>> requestEntity = RequestEntity
                .post(uri)
                .contentType(MediaType.APPLICATION_JSON)
                .header("x-authorization", "abcd")
                .header("custom-header", "fffff")
                .body(req);

        RestTemplate restTemplate = new RestTemplate();



        ResponseEntity<Req<UserResponse>> response
                = restTemplate.exchange(requestEntity, new ParameterizedTypeReference<Req<UserResponse>>() {});

        //첫번째 getbody는 ResponseEntity body를 가져온 것, 2번째는 그 안의 내용을 가져오기위해서 getbody해준것
        return response.getBody();
    }
}
