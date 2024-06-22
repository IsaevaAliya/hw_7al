public abstract class Hero implements HavingSuperAbillity {
    public int health ;
    public int damage;
    String superPower;

    public Hero(int health, int damage, String superPower) {
        this.health = health;
        this.damage = damage;
        this.superPower = superPower;
    }
}