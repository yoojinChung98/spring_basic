package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.Setter;

@Setter
public class AsianRestaurant implements Restaurant {

	//레스토랑은 요리사와 요리에 의존적임 (둘중에 하나라도 없으면 레스토랑이 제대로 굴러가지 않는다!)
	private Chef chef;
	//요리 코스
	private Course course;

	@Autowired
	public AsianRestaurant(@Qualifier("asianChef") Chef chef, @Qualifier("sushi") Course course) {
		super();
		this.chef = chef;
		this.course = course;
	}
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("*** 아시안 요리를 주문합니다. ***");
		course.combineMenu();
		chef.cook();
	}




	
	
	
}
