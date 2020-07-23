package items.players.weapons;

import enemies.Enemy;
import items.interfaces.IUse;

public class Axe extends Weapon implements IUse {

    public Axe(int attackPower) {
        super(attackPower);
    }

    public void use(Enemy enemy) {
        enemy.takeDamage(getAttackPower());
    }

}
