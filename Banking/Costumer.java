import java.util.ArrayList;

public class Costumer {
    private ArrayList<Double> transection = new ArrayList<Double>();
    private String name;

    public Costumer(String name , double initialAmount) {
        this.name = name;
        addtransection(initialAmount);
    }
    public void addtransection(double amount){
        transection.add(amount);
    }

    public ArrayList<Double> gettransection() {
        return transection;
    }

    public String getName() {
        return name;
    }
}
