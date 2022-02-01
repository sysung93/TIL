package com.example.Filter.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.ContentCachingResponseWrapper;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
//@Component
@WebFilter(urlPatterns = "api/user/*")
public class GlobalFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //전처리
        //필터단에서는 request와 response에 대해 변경이 가능하다.
        //HttpServletRequest는 결국 ServletRequest를 상속받은 것이다.
        /* 한번밖에 못읽음
        HttpServletRequest httpServletRequest = (HttpServletRequest)request;
        HttpServletResponse httpServletResponse = (HttpServletResponse)response;

        String url = httpServletRequest.getRequestURI();


       BufferedReader br = httpServletRequest.getReader();
        br.lines().forEach(line ->{
            log.info("url + {}, line : {}", url, line);
        });
       */

        //생성했을 때 read를 하지 않고 길이만 초기화
        ContentCachingRequestWrapper httpServletRequest
                = new ContentCachingRequestWrapper((HttpServletRequest) request);
        ContentCachingResponseWrapper httpServletResponse
                = new ContentCachingResponseWrapper((HttpServletResponse) response);

        //doFilter를 통해 실제 내부 스프링안으로 들어가야 메소드 실행
        chain.doFilter(httpServletRequest, httpServletResponse);
        String url = httpServletRequest.getRequestURI();

        //후처리에서 모든 정보를 기록
        //실행 후 content에 담기게 되어 읽어올 수 있음
        String reqContent = new String(httpServletRequest.getContentAsByteArray());
        log.info("request url : {}, request body : {}", url, reqContent);

        //내가 한번 읽으면 바디에 커서가 끝까지 내려가서 더이상 읽을 수 없음
        String resContent = new String(httpServletResponse.getContentAsByteArray());
        int httpStatus = httpServletResponse.getStatus();

        //내가 읽었던 내용만큼 다시한번 복사해서 body를 채워 넣음
        httpServletResponse.copyBodyToResponse();

        log.info("response status : {}, responseBody : {}",httpStatus, resContent);
    }
}
