public class Main {
    public static void main(String[] args) {
        Bank sbi = new Bank("State Bank of Ukrain");
        sbi.addbranch("Prithvipur");
        sbi.addnewcostomer("Prithvipur" , "Aditya Khare" , 50000.23);
        sbi.addnewcostomer("Prithvipur" , "Rajesh Khare" , 830050.25);
        sbi.addnewcostomer("Prithvipur" , "Deepmalika Khare" , 60000.43);
        sbi.addnewcostomer("Prithvipur" , "Ayushi Khare" , 100000.89);
        sbi.addbranch("Bhopal");
        sbi.addnewcostomer("Bhopal" , "Saroj Khare" , 785023.25);
        sbi.addnewcostomer("Bhopal" , "Deepali Shrivastava" , 85023.54);
        sbi.addnewcostomer("Bhopal" , "Rajendra Kumar Shrivastava" , 5023.4);
        sbi.addcostumerTransection("Prithvipur" , "Aditya Khare" , 60000.25);
        sbi.addcostumerTransection("Prithvipur" , "Aditya Khare" , 70000);
        sbi.addcostumerTransection("Prithvipur" , "Aditya Khare" , 80000.00);
        sbi.printcostumer("Prithvipur" , false);
        sbi.printcostumer("Bhopal" , false);
    }
}