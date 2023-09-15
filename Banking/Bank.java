import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branches> branches ;

    public Bank(String name) {
        this.name = name;
        this.branches =  new ArrayList<Branches>();
    }
    public boolean addbranch(String branchname){
        if (findbranch(branchname) == null){
            this.branches.add(new Branches(branchname));
            return true;
        }
        System.out.println("Branch name already exists.");
        return false;
    }
    public boolean addnewcostomer(String branchname , String costumername , double amount){
        Branches branch = findbranch(branchname);
        if (branch != null){
            return branch.newCostumer(costumername , amount);
        }
        return false;
    }
    public boolean addcostumerTransection(String branchname , String cotumername , double amount){
        Branches  branch  = findbranch(branchname);
        if (branch != null){
            return branch.transectionupdate(cotumername , amount);
        }
        return false;
    }
    private Branches findbranch( String branchname){
        for (int i =0 ; i<branches.size() ; ++i){
            Branches existingBranch = branches.get(i);
            if (branches.get(i).getName().equals(branchname)){
                return existingBranch;
            }
        }
        return null;
    }
    public boolean printcostumer(String branchname , boolean transection){
        Branches branch = findbranch(branchname);
        if(branch != null){
            System.out.println("Customers details are for Branch '"+branchname+"'-->>");
            ArrayList<Costumer> costumername = branch.getcostumer();
            for(int i = 0 ; i<costumername.size() ; ++i ){
                System.out.println((i+1)+". "+costumername.get(i).getName());
                if (transection){
                    System.out.println("     The transection details of "+ costumername.get(i).getName()+" are: -->>");
                    ArrayList<Double> trans = costumername.get(i).gettransection();
                    for(int j =0 ; j < trans.size() ; ++j ){
                        System.out.println("     "+ (i+1)+"."+(j+1)+" "+trans.get(j));
                    }
                }
            }
            return true;
        }
      return false;
    }
}
