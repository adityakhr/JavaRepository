import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<String> ggrocery = {"bhataa" , "Bhindi" , "gajar" , "aaloo" , "saljam"};
//        for (int i  =0 ; i<5 ; ++i){
//            System.out.print("Enter the "+(i+1)+" itme :");
//            String m = sc.next();
//            sc.nextLine();
//            ggrocery.add(m);
//        }
        for (int i  =0 ; i<5 ; ++i){
            System.out.print(ggrocery.get(i)+" ");
        }
        System.out.println();
        int i = ggrocery.indexOf("mooli");
        if (i>=0){
            System.out.println("Index of mooli is "+i);
        }else{
            System.out.println(" Mooli is Not in the list");
        }



    }
}