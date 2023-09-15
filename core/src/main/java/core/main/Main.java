package core.main;

import org.springframework.context.support.GenericXmlApplicationContext;

import core.chap2.Hotel;

public class Main {

	public static void main(String[] args) {
		
		//Spring 컨테이너를 쓰지 않았을 때
//		Hotel hotel = new Hotel();
//		hotel.inform();
		
		//Spring 컨테이너에 빈을 등록한 상태
		//(빈 등록에 사용된 xml의 설정을 가져오는 객체를 생성)
		//classpath == src/main/resources
		GenericXmlApplicationContext ct = new GenericXmlApplicationContext("classpath:hotel-config.xml");
		
		Hotel hotel1 = ct.getBean("hotel1", Hotel.class);
		hotel1.inform();
		
		Hotel hotel2 = ct.getBean("hotel2", Hotel.class);
		hotel2.inform();
		
	}
	
}
