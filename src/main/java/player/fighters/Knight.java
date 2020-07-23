package player.fighters;

import items.interfaces.IUse;
import player.Player;

public class Knight extends Player {

    public Knight(int health, IUse equippedItem) {
        super(health, equippedItem);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

}
