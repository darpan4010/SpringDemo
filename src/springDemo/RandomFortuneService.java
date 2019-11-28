package springDemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String data[] = {"Darpan", "Rajendra","Sathe"};
	
		private Random myrandomnumber = new Random();
	
	@Override
	public String getDailyFortune() {

		int index = myrandomnumber.nextInt(data.length);
		String newData = data[index];
		
		return newData;
	}

}
