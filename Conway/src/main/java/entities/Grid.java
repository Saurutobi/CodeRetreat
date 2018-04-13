package entities;

public class Grid {
    boolean[][] currentArray;
    boolean[][] nextArray;

    int x;
    int y;

    public Grid(int x, int y) {
        currentArray = initializeArray(x,y);
        nextArray = initializeArray(x,y);
    }

    private boolean[][] initializeArray(int x, int y) {
        boolean array[][] = new boolean[x][];
        for(int i = 0; i < x; i++) {
            array[i] = new boolean[y];
        }
        return array;
    }

    public boolean[][] getCurrentArray() {
        return currentArray;
    }

    public void setCurrentArray(boolean[][] currentArray) {
        this.currentArray = currentArray;
    }

    public void iterate() {
        for
    }
}