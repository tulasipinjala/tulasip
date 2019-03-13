package fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;

public class FizzBuzzTest {
	
		@Test
		    public void shouldReturnOneAsNumber() {
		 
			String answer = FizzBuzz.getAnswerFor(1);
			assertEquals(answer,"1");
		 
		    }
		@Test
	    public void shouldReturnTwoAsNumber() {
	 
	        String answer = FizzBuzz.getAnswerFor(2);
	        assertEquals(answer,"2");
	    }
		@Test
	    public void shouldReturnThreeAsFizz() {
	        String answer = FizzBuzz.getAnswerFor(3);
	        assertEquals(answer, "Fizz");
	    }
		@Test
		public void shouldReturnBuzzForFive() {
			String answer =FizzBuzz.getAnswerFor(5);
			assertEquals(answer, "Buzz");
		}
		@Test
		public void shouldReturnBuzzForTen() {
			String answer =FizzBuzz.getAnswerFor(10);
			assertEquals(answer, "Buzz");
		}
		@Test
		public void shouldReturnBuzzForFifteen() {
			String answer =FizzBuzz.getAnswerFor(15);
			assertEquals(answer, "FizzBuzz");
}
}

