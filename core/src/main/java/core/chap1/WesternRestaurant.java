package core.chap1;

public class WesternRestaurant implements Restaurant {

	//레스토랑은 요리사와 요리에 의존적임 (둘중에 하나라도 없으면 레스토랑이 제대로 굴러가지 않는다!)
	private Chef chef = new FrenchChef();
	//요리 코스
	private Course course = new FrenchCourse();
	
	// 요리를 주문하는 기능
	public void order() {
		System.out.println("*** 서양 요리를 주문합니다. ***");
		course.combineMenu();
		chef.cook();
	}
	
	
	
}
