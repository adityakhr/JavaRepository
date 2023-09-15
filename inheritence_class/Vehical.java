public class Vehical {
    private String type ;
    private int tyercount;
    private int seatcount;

    public Vehical(String type , int tyercount , int seatcount){
        this.type = type;
        this.tyercount = tyercount;
        this.seatcount = seatcount;
    }

    public void typeOfVehical( ){
        System.out.println("The type of this Vehical is "+this.type);
    }
    public void count1(){
        System.out.println("has "+this.tyercount+ " Tyer");
    }
    public void count2(){
        System.out.println("has "+this.seatcount+" Seat");
    }
}
