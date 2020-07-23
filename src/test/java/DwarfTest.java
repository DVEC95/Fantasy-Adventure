import items.players.weapons.Axe;
import org.junit.Before;
import org.junit.Test;
import player.fighters.Dwarf;

import static org.junit.Assert.assertEquals;

public class DwarfTest {

    Dwarf dwarf;
    Axe axe;

    @Before
    public void before(){
        axe = new Axe(25);
        dwarf = new Dwarf(100, axe);
    }

    @Test
    public void hasAttributes(){
        assertEquals(100, dwarf.getHealth());
        assertEquals(axe, dwarf.getEquippedItem());
        assertEquals(0, dwarf.getInventory().size());
        assertEquals(0, dwarf.getTreasures().size());
    }


}
