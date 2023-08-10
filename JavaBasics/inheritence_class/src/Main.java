public class Main {
    public static void main(String[] args) {
        Vehical v = new Vehical("Hatchback" , 4 , 2);
        Mycar mc = new Mycar("Creta" , "Hyundai" , 1898050);
        mc.typeOfVehical();
        mc.count1();
        mc.count2();
        System.out.print("====================================================\n");
        Eriksha ei = new Eriksha("Herculus" , "Hero" , 83000);
        ei.typeOfVehical();
        ei.count1();
        ei.count2();
    }
}