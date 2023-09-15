public class Mycar extends Vehical{
    public String name ;
    public String company;
    public int price;
    public Mycar(String name  , String company, int price) {
        super("Sport Utility Vehical(SUV)", 4, 5);
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void typeOfVehical() {
        super.typeOfVehical();
        System.out.print("The name of this car is "+getName()+"\nComapay name is "+ getCompany()+"\nPrice is "+getPrice());
        System.out.println();
    }

    @Override
    public void count1() {
        System.out.print(getName()+" ");
        super.count1();
    }

    @Override
    public void count2() {
        System.out.print(getName()+" ");
        super.count2();
    }
}
