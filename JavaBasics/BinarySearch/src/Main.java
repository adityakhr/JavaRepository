import java.util.Scanner;

public class Main {
    public static int binarysearch(int array [] , int siz , int key){
        int s = 0;
        int e = siz;
        while (s<e){
            int mid = (s+e)/2;
            if (array[mid] > key){
                e = mid-1 ;
            }
            else if (array[mid] < key){
                s = mid+1 ;
            }
            else if (array[mid] == key){
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int size;
        System.out.println("Enter the size of array: ");
        Scanner scan = new Scanner(System.in);
        size  = scan.nextInt();
        scan.nextLine();
        int [] arr  = new int [size];
        System.out.println("Now enter the elements of array separated by space: ");
        for (int i = 0  ; i<size ; ++i){
            int num = scan.nextInt();
            scan.nextLine();
            arr[i] = num;
        }
        System.out.println("Enter the element you wanna find into array: ");
        int element = scan.nextInt();
        scan.nextLine();
        if(binarysearch(arr , size , element) != -1){
            System.out.println(binarysearch(arr , size , element));
        }
        else {
            System.out.println("Not valid");
        }
        scan.close();
    }

}