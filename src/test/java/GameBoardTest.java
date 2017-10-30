import junit.framework.TestCase;

public class GameBoardTest extends TestCase {
    public GameBoardTest(String name){
        super(name);
   }

    public void testAddCell(){
        GameBoard gameboard = new GameBoard();
        assertEquals(1, gameboard.getCellNumber());
        Cell cell = new Cell();
        gameboard.addCell(cell);
        assertEquals(2, gameboard.getCellNumber());
    }

    public void testFirstCell() {
        GameBoard gameBoard = new GameBoard();
        Cell firstCell = gameBoard.getCell(0);
        assertSame(GoCell.class, firstCell.getClass());
    }
}