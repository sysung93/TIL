package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchImageRes;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.naver.dto.SearchLocalRes;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Component
public class NaverClient {
    @Value("${naver.client.id}")
    private String naverClientId;

    @Value("${naver.client.secret}")
    private String naverClientSecret;

    @Value("${naver.url.search.local}")
    private String naverLocalSearchUrl;

    @Value("${naver.url.search.image}")
    private String naverImageSearchUrl;


    public SearchLocalRes searchLocal(SearchLocalReq searchLocalReq){
        //검색 요청
        var uri = UriComponentsBuilder.fromUriString(naverLocalSearchUrl)
                //SearchLocalReq가 queryParam으로 들어가야 함
                //.queryParam(key, value)
                .queryParams(searchLocalReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();
        //header
        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", naverClientId);
        headers.set("X-Naver-Client-Secret", naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);

        //요청
        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchLocalRes>(){};

        //결과
        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );

        //결과 리턴
        return responseEntity.getBody();
    }

    public SearchImageRes searchImage(SearchImageReq searchImageReq){
        //검색 요청
        var uri = UriComponentsBuilder.fromUriString(naverImageSearchUrl)
                //SearchLocalReq가 queryParam으로 들어가야 함
                //.queryParam(key, value)
                .queryParams(searchImageReq.toMultiValueMap())
                .build()
                .encode()
                .toUri();
        //header
        var headers = new HttpHeaders();
        headers.set("X-Naver-Client-Id", naverClientId);
        headers.set("X-Naver-Client-Secret", naverClientSecret);
        headers.setContentType(MediaType.APPLICATION_JSON);

        //요청
        var httpEntity = new HttpEntity<>(headers);
        var responseType = new ParameterizedTypeReference<SearchImageRes>(){};

        //결과
        var responseEntity = new RestTemplate().exchange(
                uri,
                HttpMethod.GET,
                httpEntity,
                responseType
        );

        //결과 리턴
        return responseEntity.getBody();

    }

}
