package springDemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Inside DatabaseFortuneService";
	}

}
