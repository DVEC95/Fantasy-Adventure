import enemies.Orc;
import enemies.Troll;
import items.players.weapons.Axe;
import items.treasures.Gem;
import items.treasures.Gold;
import org.junit.Before;
import org.junit.Test;
import player.fighters.Dwarf;
import rooms.EnemyRoom;
import rooms.IEnter;
import rooms.TreasureRoom;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QuestTest {

    private Orc orc;
    private Troll troll;
    private Gem gem;
    private Gold gold;
    private Axe axe;
    private Dwarf dwarf;
    private EnemyRoom enemyRoom;
    private TreasureRoom treasureRoom;
    private Quest quest;
    private ArrayList<IEnter> rooms;


    @Before
    public void before(){
        orc = new Orc(100, 10);
        troll = new Troll(300, 50);
        gem = new Gem(50);
        gold = new Gold(100);

        axe = new Axe(50);
        dwarf = new Dwarf(200, axe);

        enemyRoom = new EnemyRoom(orc);
        treasureRoom = new TreasureRoom(gem);

        rooms = new ArrayList<IEnter>();

        rooms.add(enemyRoom);
        rooms.add(treasureRoom);

        quest = new Quest(dwarf, rooms);
    }

    @Test
    public void canQuest(){
        quest.startQuest();
        assertEquals(180, dwarf.getHealth());
        assertEquals(1, dwarf.getTreasures().size());
        assertTrue(enemyRoom.isCompleted());
        assertTrue(treasureRoom.isCompleted());
        assertTrue(quest.isCompleted());
    }




}
