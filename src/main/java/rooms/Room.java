package rooms;

import enemies.Enemy;
import items.treasures.Treasure;

public abstract class Room {

    private boolean isCompleted;

    public Room() {
        this.isCompleted = false;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void roomCompleted(){
        this.isCompleted = true;
    }

}
