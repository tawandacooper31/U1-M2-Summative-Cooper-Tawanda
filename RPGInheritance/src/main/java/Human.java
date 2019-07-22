public class Human {
    protected String name;
    protected double health = 100.0;
    protected long experience = 0;
    protected int attackPower = 1;

    public Human(String name) {
        this.name = name;

    }




    public long addAttackPower(long attackPower) {
        this.attackPower += attackPower;
        return attackPower;
    }

    public double heal(double additionalHealth) {
        health += additionalHealth;
        return health;
    }

    public void attack(Human opponent) {
        opponent.decreaseHealth(attackPower);
    }

    private void decreaseHealth(int attackPower) {
        health -= attackPower;
    }

    public void jump() {
        System.out.println("Jumped up");
    }
            }