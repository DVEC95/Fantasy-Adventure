package player;

import enemies.Enemy;
import items.interfaces.IUse;
import items.treasures.Treasure;

import java.util.ArrayList;

public abstract class Player {

    private ArrayList<Treasure> treasures;
    private int health;
    private IUse equippedItem;
    private ArrayList<IUse> inventory;

    public Player(int health, IUse equippedItem) {
        this.health = health;
        this.equippedItem = equippedItem;
        this.inventory = new ArrayList<IUse>();
        this.treasures = new ArrayList<Treasure>();
    }

    public int getHealth() {
        return health;
    }

    public IUse getEquippedItem() {
        return equippedItem;
    }

    public ArrayList<IUse> getInventory() {
        return inventory;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setEquippedItem(IUse equippedItem) {
        this.equippedItem = equippedItem;
    }

    public void useItem(Enemy enemy){
        equippedItem.use(enemy);
    }

    public void takeDamage(int damage){
        this.health = this.health - damage;
    }

    public void takeTreasure(Treasure treasure) {
        this.treasures.add(treasure);
    }
}
