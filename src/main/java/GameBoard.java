import java.util.ArrayList;

public class GameBoard {

    public GameBoard(){
        addCell(new GoCell());
    }
    ArrayList cells = new ArrayList();

    public void addCell(Cell cell){
        cells.add(cell);
    }

    public int getCellNumber(){
        return cells.size();
    }

    public Cell getCell(int index){
        return (Cell)cells.get(index);
    }
}
