package springDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		boolean result = (theCoach==alphaCoach);
		System.out.println("Is Equal-Pointing to same object? " +result);
		System.out.println("Memory Location for TheCOach " +theCoach);
		System.out.println("Memory Location for AlphaCOach " +alphaCoach);
		
		context.close();
		
		
	}

}
