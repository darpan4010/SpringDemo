package springDemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("thatsillycoach")
@Component
@Scope("prototype")
public class TennisCoach implements Coach {

	//Field Injection uses Reflection which is a java concept.
	@Autowired
	//If you have multiple implementations for ur interface then you have to specify implementation 
	//using Qulifier annotation
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;

/*	//Constructor Injection
	public  TennisCoach(FortuneService thefortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = thefortuneService;
	}*/
	
	public  TennisCoach() {
		// TODO Auto-generated constructor stub
	System.out.println("Inside Defult constructor:- TennisCoach");
	}
	
	//Setter Injection
	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Autowired Block");
		this.fortuneService = fortuneService;
	}*/
	
	//Method Injection
	/*@Autowired
	public void dosomeFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Autowired Block :- Method dosomeFortuneService");
		this.fortuneService = fortuneService;
	}*/
	@PostConstruct
	public void domyStartupstuff()
	{
		System.out.println("TennisCOach:: Inside my domyStartupstuff");
	}
	@PreDestroy
	public void domyCleanupStuff()
	{
		System.out.println("TennisCOach:: inside domyCleanupStuff");
	}
	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub	
		return "Practice front hand daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}	
