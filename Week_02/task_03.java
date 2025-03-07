import java.util.Random;
public class Main
{
            public static void main(String[] args) {
                Random random = new Random(); 
                int number = random.nextInt(100) + 1; 
                System.out.println("Generated number: " + number); 

                if (number % 2 == 0) {
                    System.out.println(number + " is an even number.");
                } else {
                    System.out.println(number + " is an odd number.");
                }
            }
        }
