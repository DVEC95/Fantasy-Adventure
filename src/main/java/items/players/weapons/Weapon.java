package items.players.weapons;

import items.interfaces.IUse;

public abstract class Weapon implements IUse {

    private int attackPower;

    public Weapon(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getAttackPower() {
        return attackPower;
    }

}
