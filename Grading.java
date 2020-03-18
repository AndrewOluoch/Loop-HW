import java.util.Random;

public class Grading {
    public static void main(String[] args) {

        int num = 0;
        Random rnd = new Random();

        System.out.println("Your grade is ");
        int n2 = rnd.nextInt(101);
        System.out.println(n2);

            if (num <90)
            {
                System.out.println("You got an A");

            }
            else if (num < 80)
            {
                System.out.println("You got a B");

            }
            else if (num < 70) {
                System.out.println("you got a C");

            }
            else if (num < 60) ;
            System.out.println("You got a D");
            {

            }
            if (num > 59) ;
            System.out.println("You Failed");
        }

    }
