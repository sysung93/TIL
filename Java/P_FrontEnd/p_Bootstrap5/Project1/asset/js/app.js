// slick은 jquery 언어라 cdn을 따로 추가해야함
const slickSlide = jQuery('#slick-slide')

if(slickSlide) {
    slickSlide.slick({
        dots: true,
        arrow: false,
        slidesToShow: 3,
        slideToScroll: 1,
        autoplay: true,
        autoplaySpeed: 3000,
        Response: [
            {
                breakpotin: 768,
                settings: {
                    slidesToShow: 2
                }
            },
            {
                breakpoint: 576,
                settings: {
                    slidesToShow: 1
                }
            }
        ]
    })
}