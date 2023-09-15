public class Cars{
    private String name;

    public String getName() {
        return name;
    }

    public Cars(String name) {
        this.name = name;
    }
}

public class Main {

    public static void main(String[] args) {
        check();
    }
    public static Cars check( ){
        return Cars();
    }
}