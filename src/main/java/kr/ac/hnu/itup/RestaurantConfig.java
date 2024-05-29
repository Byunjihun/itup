package kr.ac.hnu.itup;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 이걸 붙이게 되면 RestaurantConfig 클래스가 환경설정을 담당하게 됨
public class RestaurantConfig {
    @Bean // 오직 메서드에만 붙일 수 있다 Bean을 붙히면 호출이 끝나고 객체가 반환된다.
    public Restaurant restaurant(){
        Restaurant restaurant = new Restaurant();
        restaurant.setName("미소 천국");
        restaurant.setAddress("대전광역시 동구");
        restaurant.setPhone("042-222-3333");
        restaurant.setChef(chef());
        return  restaurant;
    }

    @Bean
    public Chef chef(){
        Chef chef = new Chef();
        chef.setName("백종원");
        chef.setAge(57);
        return chef;
    }
}
