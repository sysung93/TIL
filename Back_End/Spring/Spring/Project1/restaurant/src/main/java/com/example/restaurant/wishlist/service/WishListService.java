package com.example.restaurant.wishlist.service;

import com.example.restaurant.naver.NaverClient;
import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;
import com.example.restaurant.wishlist.dto.WishListDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WishListService {
    private final NaverClient naverClient;

    public WishListDto search(String query){
        // 지역검색
        var searchLocalReq = new SearchLocalReq();
        searchLocalReq.setQuery(query);;

        //검색 결과 리턴
        var searchLocalRes = naverClient.searchLocal(searchLocalReq);

        //결과가 있음
        if(searchLocalRes.getTotal() > 0){
            var localItem = searchLocalRes.getItems().stream().findFirst().get();

            //찾은 item으로 이미지 쿼리만들기
            var imageQuery = localItem.getTitle().replaceAll("<[^>]*>", "");
            var searchImageReq = new SearchImageReq();
            searchImageReq.setQuery(imageQuery);

            //이미지 검색
            var searchImageRes = naverClient.searchImage(searchImageReq);
            if(searchImageRes.getTotal() > 0) {
                var imageItem = searchImageRes.getItems().stream().findFirst().get();

                //결과 리턴
                var result = new WishListDto();
                result.setTitle(localItem.getTitle());
                result.setCategory(localItem.getCategory());
                result.setAddress(localItem.getAddress());
                result.setReadAddress(localItem.getRoadAddress());
                result.setHomePageLink(localItem.getLink());
                result.setImageLink(imageItem.getLink());

                return result;
            }
        }
        return new  WishListDto();
    }
}
