package Sudoku.model;

public class Board {
    public int height;
    public int width;
    public Space[][] spaces;
    public Board(int height, int width){
        this.height = height;
        this.width = width;
        this.spaces = new Space[width][height];

    }
    public void setSpace(int x, int y, Space space){
        spaces[x][y] = space;
    }

    public Space getSpace(int x, int y){
        return null;
    }
}
