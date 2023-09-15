public class Player {
    private String name ;
    private int health = 100; //if we dont want to change our initialization through unauthrised user put it private//
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name.toUpperCase();
        if (health >0 && health<=100){
            this.health = health;
        }else{
            System.out.println("Invalid Health, putting health = 100");
        }
        this.weapon = weapon.toUpperCase();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public String getWeapon() {
        return weapon;
    }
}
