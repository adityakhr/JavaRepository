public class Main {
    public static void main(String[] args) {
        Component co = new Component("Alloy" , "'LED" , "Automatic" ,  new Dimensions(4500, 2700 , 350));
        Car c = new Car("Vectus" , "Volkswagun" , co );
        System.out.println(c.getComp().getDime().getY());
    }
}