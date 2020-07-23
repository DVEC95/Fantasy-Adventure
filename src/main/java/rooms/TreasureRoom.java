package rooms;

import items.treasures.Treasure;
import player.Player;

public class TreasureRoom extends Room implements IEnter{

    private Treasure treasure;

    public TreasureRoom(Treasure treasure) {
        this.treasure = treasure;
    }

    public Treasure getTreasure() {
        return treasure;
    }

    public void enter(Player player) {
        player.takeTreasure(this.treasure);
        this.roomCompleted();
    }

}
