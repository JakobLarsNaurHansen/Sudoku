package Sudoku.model;

public class Space {
    public final int x;
    public final int y;

    public Space(int x, int y){
        this.x = x;
        this.y = y;

    }
    public String toString(int x, int y){
        return "Space{" +
                "x=" + x +
                ", y=" + y +
                "}";
    }

}
