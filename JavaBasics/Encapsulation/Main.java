public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Aditya" , 120 , "Machinegun");
        System.out.println(p1.getName());
        System.out.println(p1.getHealth());
        System.out.print(p1.getWeapon());
    }
}