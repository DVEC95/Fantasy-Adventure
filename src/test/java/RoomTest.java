import enemies.Orc;
import enemies.Troll;
import items.players.weapons.Axe;
import items.treasures.Gem;
import items.treasures.Gold;
import org.junit.Before;
import org.junit.Test;
import player.fighters.Dwarf;
import rooms.EnemyRoom;
import rooms.Room;
import rooms.TreasureRoom;

import static org.junit.Assert.*;

public class RoomTest {

    private EnemyRoom enemyRoom;
    private TreasureRoom treasureRoom;
    private Orc orc;
    private Troll troll;
    private Gem gem;
    private Gold gold;
    private Dwarf dwarf;
    private Axe axe;

    @Before
    public void before(){
        orc = new Orc(100, 10);
        troll = new Troll(300, 50);
        gem = new Gem(50);
        gold = new Gold(100);

        axe = new Axe(50);
        dwarf = new Dwarf(100, axe);

        enemyRoom = new EnemyRoom(orc);
        treasureRoom = new TreasureRoom(gem);
    }

    @Test
    public void hasEnemyAndTreasure(){
        assertEquals(orc, enemyRoom.getEnemy());
        assertEquals(gem, treasureRoom.getTreasure());
    }

    @Test
    public void isNotCompleted(){
        assertFalse(enemyRoom.isCompleted());
        assertFalse(treasureRoom.isCompleted());
    }

    @Test
    public void canSetCompleted(){
        enemyRoom.roomCompleted();
        assertTrue(enemyRoom.isCompleted());
    }




}
