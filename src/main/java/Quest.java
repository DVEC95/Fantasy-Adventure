import player.Player;
import rooms.IEnter;
import rooms.Room;

import java.util.ArrayList;
import java.util.Collections;

public class Quest {

    private Player player;
    private ArrayList<IEnter> rooms;
    private boolean isCompleted;

    public Quest(Player player, ArrayList<IEnter> rooms) {
        this.player = player;
        this.rooms = rooms;
        this.isCompleted = false;
    }

    public Player getPlayer() {
        return player;
    }

    public ArrayList<IEnter> getRooms() {
        return rooms;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public IEnter getRandomRoom(){
//        Collections.shuffle(this.rooms);
        return rooms.remove(0);
    }

    public void enterRoom(){
        IEnter room = getRandomRoom();
            room.enter(player);
            System.out.println("Room completed.");
    }

    public void startQuest(){
        while (this.rooms.size() > 0){
            enterRoom();
        }
        System.out.println("Quest completed!");
        this.isCompleted = true;
    }

}
