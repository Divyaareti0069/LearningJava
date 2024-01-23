package string;
public class PerformanceTesting {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

      
        StringBuffer buffer = new StringBuffer("string buffer");
        for (int i = 1; i < 10000; i++) {
        	buffer.append("String builder");
        }
        System.out.println("The time taken by StringBuffer is: " + (System.currentTimeMillis() - startTime));

        
        long startTime1 = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("String Builder");
        for (int i = 1; i < 10000; i++) {
            builder.append("String builder");
        }
        System.out.println("The time taken by StringBuilder is: " + (System.currentTimeMillis() - startTime1));
    }
}
