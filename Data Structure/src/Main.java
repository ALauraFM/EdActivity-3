
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pile pile = new Pile();
        pile.Pile();

        int option;
        do {
            System.out.println("""
                    Choose an option:
                    1) Insert in the top of the pile
                    2) Remove from the top of the pile
                    3) Read the top of the pile
                    4) Indicate if the pile is empty
                    5) Return the pile size
                    6) Exit the program
                    """);
            option = sc.nextInt();

            switch (option){

                case 1:
                    System.out.println("Choose the element to be inserted:");
                    int element1 = sc.nextInt();
                    System.out.println(pile.push(element1));
                    break;

                case 2:
                    System.out.println(pile.pop());
                    break;

                case 3:
                    System.out.println("The top of the line is: " + pile.top());
                    break;

                case 4:
                    System.out.println("The pile is empty? " + pile.empty());
                    break;

                case 5:
                    System.out.println("The pile size is: " + pile.pileSize());
                    break;
            }

        } while (option < 6);
    }
}