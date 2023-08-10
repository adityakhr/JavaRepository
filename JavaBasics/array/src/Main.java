import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array  = new int [5];

        for (int i  = 0 ; i<5  ; ++i){
            System.out.print("Enter the "+(i+1)+" Number: ");
            int number   = sc.nextInt();
            array[i] = number;
            sc.nextLine();
        }
        enlarging(array);
    }
    public static void enlarging(int [] array){
        int [] abhi = array;
        array = new int [7];
        for (int  i = 0 ; i<abhi.length ; ++i){
            array[i] = abhi[i];
        }
        array[5]  = 12;
        array [6] = 13;
        int i  = 0;
        while (i<array.length) {
            System.out.print("The " + (i + 1) + " Number is: " + array[i] + "\n");
            ++i;
        }
    }
}