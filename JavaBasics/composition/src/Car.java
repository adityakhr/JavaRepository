public class Car {
    private String name;
    private String type;
    private Component comp;


    public Car(String name, String type, Component comp) {
        this.name = name;
        this.type = type;
        this.comp = comp;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public Component getComp() {
        return comp;
    }
}
