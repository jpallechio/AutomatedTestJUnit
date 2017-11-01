import junit.framework.TestCase;

public class GameMasterTest extends TestCase {
    GameMaster master;

    public void setUp(){
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
    }

    public void testPlayerInit(){
        master.setNumberOfPlayers(6);
        assertEquals(6, master.getNumberOfPlayers());
    }

    public void testSingleton() {
        GameMaster instance1 = GameMaster.instance();
        assertNotNull(instance1);
        GameMaster instance2 = GameMaster.instance();
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }


    public void testMovePlayerSimple(){
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0, 2);
        assertEquals("Blue 2", player.getPosition().getName());
        master.movePlayer(0,3);
        assertEquals("Green 2", player.getPosition().getName());
    }

    public void testGetCellIndex(){
        GameBoard gameBoard = new SimpleGameBoard();
        Cell blue2 = gameBoard.getCell(2);
        int index = gameBoard.getCellIndex(blue2);
        assertEquals(2, index);
        Cell notExist = new Cell();
        index = gameBoard.getCellIndex(notExist);
        assertEquals(-1, index);
    }

    public void testMovePlayerCycle(){
        master = GameMaster.instance();
        master.setGameBoard(new SimpleGameBoard());
        master.setNumberOfPlayers(1);
        Player player = master.getPlayer(0);
        master.movePlayer(0,2);
        master.movePlayer(0,5);
        assertEquals("Blue 1", player.getPosition().getName());
    }
}
