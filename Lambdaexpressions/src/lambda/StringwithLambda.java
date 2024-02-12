package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class StringwithLambda {

	public static void main(String[] args) {
		
		    Function<String> concatenate=(str1,str2)->str1+str2;
		    String str1="hello";
		    String str2="morning";
		    String result=concatenate.test()
		    System.out.println(result);
		  }
		
	}


