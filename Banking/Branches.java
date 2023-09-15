import java.util.ArrayList;

public class Branches  {
    private String name;
    private ArrayList<Costumer> costumers;

    public Branches(String name) {
        this.name = name;
        this.costumers = new ArrayList<Costumer>();
    }

    public String getName() {
        return name;
    }
    public  boolean newCostumer(String costumerName , double amout){
        if (findCostumer(costumerName) != null){
            System.out.println("Costumer already exist");
            return false;
        }
        costumers.add(new Costumer(costumerName , amout));
        return true;
    }

    public ArrayList<Costumer> getcostumer(){
        return costumers;
    }

    public  boolean transectionupdate(String costumerName, double amount){
        Costumer existingCostumer = findCostumer(costumerName);
        if (existingCostumer !=  null){
            existingCostumer.addtransection(amount);
            return true ;
        }
        return false;
    }
    private Costumer findCostumer (String costumerName){
        for(int i = 0 ; i<costumers.size() ; ++i){
            if (costumers.get(i).getName().equals(costumerName)){
                return this.costumers.get(i);
            }

        }
        return null;
    }
}
