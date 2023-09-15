import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    Node n = null;
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rock");
        names.add("Paper");
        names.add("Caeser");
        System.out.println("Choose from the below options\n1. Rock\n2. Paper\n3. Caeser\n4. Quit");
        Random m = new Random();
        int number = m.nextInt(3);
        boolean iteration = true;
        while (iteration){
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()){
                int input = scan.nextInt();
                scan.nextLine();
                String k = names.get(number);
                if (input>=1 && input<= 3){
                    switch (input){
                        case 1:
                            if (k == "Rock"){
                                System.out.print("TIE!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Paper"){
                                System.out.print( "YOU LOST!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Caeser"){
                                System.out.print("YOU WON!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            break;
                        case 2:
                            if (k == "Rock"){
                                System.out.print("YOU WON!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Paper"){
                                System.out.print("TIE!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Caeser"){
                                System.out.print("YOU LOST!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            break;
                        case 3:
                            if (k == "Rock"){
                                System.out.print("YOU LOST!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Paper"){
                                System.out.print("YOU WON!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            else if( k == "Caeser"){
                                System.out.print("TIE!\nBecause Computer has selected "+k.toUpperCase());
                            }
                            break;
                        case 4:
                            System.out.println("Quit");
                            iteration = false;
                        default:
                            System.out.print("Entered wrong input");
                            break;
                    }
                }
                else{
                    System.out.println("Invalid input");
                    break;
                }
            }
            else{
                System.out.println("Invalid input");
                break;
            }
            scan.close();
        }
        }
    }
