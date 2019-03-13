package fizzbuzz;

public class FizzBuzz {

public static String getAnswerFor(int number) {
	if (number == 15) {
		return "FizzBuzz";
}else if (number % 3 == 0) {
		return "Fizz";
	}else if (number % 5 == 0) {
		return "Buzz";
	} else {
		return "" +  number;
	}
	
	}
	}
		
	


