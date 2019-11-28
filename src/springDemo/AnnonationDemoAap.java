package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnonationDemoAap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
	}

}
