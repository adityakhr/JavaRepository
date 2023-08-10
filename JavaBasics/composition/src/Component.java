public class Component {
    private String tyertype;
    private String Headlamptypr;
    private String Cartype;
    private Dimensions dime;

    public Component(String tyertype, String headlamptypr, String cartype, Dimensions dime) {
        this.tyertype = tyertype;
        Headlamptypr = headlamptypr;
        Cartype = cartype;
        this.dime = dime;
    }

    public String getTyertype() {
        return tyertype;
    }

    public String getHeadlamptypr() {
        return Headlamptypr;
    }

    public String getCartype() {
        return Cartype;
    }

    public Dimensions getDime() {
        return dime;
    }
}
