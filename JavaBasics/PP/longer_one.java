public class longer_one {
    public static void main(String[] agrs){
        byte num1= 2;
        short num2 = 9;
        int num3 = 8;
        int my_total = (num1 + num2 + num3);
        /*
        here in my_total variable byte short and int are smalleror equal in  size of int but in case if we want
        to store byte and int and short values in my_total which is short that's smalle than int and byte so my_total
        cant store value it will show error.....here comes static cast
        short my_total =  (short)(num1 + num2 + num3); it will handle size matter.
        */

        long  apun = 50000L;
        int jk = (int) (apun+(10*my_total)); //bcoz long value is here in assignment which is larger in size than int.//
        System.out.println(jk);
        int i = 1;
        while(i<=6){
            int myans = i*5;
            System.out.print(myans+" ");
          //  System.out.println();
            ++i;
        }
        System.out.println();
        boolean  chaman = false;
        if (!chaman){
            System.out.print(chaman);
            }
    }
}

