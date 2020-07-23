package rooms;

import enemies.Enemy;
import player.Player;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EnemyRoom extends Room implements IEnter{

    private Enemy enemy;

    public EnemyRoom(Enemy enemy) {
        this.enemy = enemy;
    }

    public Enemy getEnemy() {
        return enemy;
    }

    public void enter(Player player) {
        while (player.getHealth() > 0 && enemy.getHealth() > 0){
            player.useItem(enemy);
            enemy.attack(player);
        }
        this.roomCompleted();
    }

}
