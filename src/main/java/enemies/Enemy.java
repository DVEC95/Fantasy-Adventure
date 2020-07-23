package enemies;

import player.Player;

public abstract class Enemy {

    private int health;
    private int attack;

    public Enemy(int health, int attack) {
        this.health = health;
        this.attack = attack;
    }

    public void attack(Player player) {
        player.takeDamage(this.attack);
    }

    public int getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int attackPower) {
        this.health -= attackPower;
    }

}
