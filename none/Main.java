import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GuesstheNumber num = new GuesstheNumber();
        boolean bool = true;
        System.out.println("\n====*******************************====\nWELCOME TO THE GUESS THE NUMBER GAME\n=======================================\nEnter the number: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()){
            while (bool){
                int integer = scan.nextInt();
                scan.nextLine();
                if (integer>0){
                    if (num.thenumberis(integer) == 1){
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("Invalid Input");
        }
        scan.close();
    }
}