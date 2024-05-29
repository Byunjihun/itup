package kr.ac.hnu.itup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@Slf4j
@SpringBootApplication
@Import(RestaurantConfig.class)  // Java 기반 구성 클래스 임포트
public class ItupApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ItupApplication.class, args);
        Restaurant restaurant = context.getBean(Restaurant.class);

        log.info("restaurant: {}" +  restaurant);
        Chef chef = restaurant.getChef();
        Ingredient ingredient = chef.prepare();

        Food food = chef.cook(ingredient);
        log.info("Food:{}",food);
    }
}
