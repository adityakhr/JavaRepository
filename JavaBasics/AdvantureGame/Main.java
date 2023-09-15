import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static int a =50 ;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer , Location> locations = new HashMap<>();
        locations.put(0 , new Location(0 , "Infront of your laptop, signing out Good Bye!"));
        locations.put(1 , new Location(1, "Road"));
        locations.put(2 , new Location(2 , "Hill"));
        locations.put(3 , new Location(3 , "Building"));
        locations.put(4 , new Location(4 , "Valley"));
        locations.put(5 , new Location(5 , "Forest"));

        int locate;
        while (true){
            locate = scan.nextInt();
            scan.nextLine();
            if (locate == 0){
                System.out.println("Infront of your laptop, signing out Good Bye!");
                break;
            }
            System.out.println(locations.get(locate).getExits().get(locate));

        }
    }
}