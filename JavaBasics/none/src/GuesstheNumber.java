import java.util.Random;

public class GuesstheNumber {
    private Random rand  = new Random();
    private int number = 1+rand.nextInt(101);
    public int thenumberis(int num1 ){
        if (num1 > number) {
            System.out.println("Oops....!\nNumber is Bigger than MY NUMBER\nEnter again: ");
            return 0;
        }
        else if(num1<number){
            System.out.println("Sorry....!\nNumber is Smaller than MY NUMBER\nEnter again:");
            return 0;
        }
        else if (num1 == number){
            System.out.print("CONGRATULATIONS!\nYou got the MY NUMBER");
            return 1;
        }
        return -1;
    }

}
