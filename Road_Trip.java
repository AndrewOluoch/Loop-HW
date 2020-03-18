import java.util.Scanner;

public class Road_Trip
{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean conditionCheck = true;

        while (conditionCheck)
        {
            System.out.println("Are we there yet?");
            String userInputFromKeyBoard = scanner.nextLine();

            if (userInputFromKeyBoard.equalsIgnoreCase ("Yes"))
            {
                System.out.println("Yes");

            }else if (userInputFromKeyBoard.equalsIgnoreCase("No"))

            {
                System.out.println("No");
                conditionCheck = false;
            }
        }

    }
}
