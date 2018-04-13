package entities;

public class Grid {
    int[][] currentArray;
    int[][] nextArray;

    int x;
    int y;

    public Grid(int x, int y) {
        currentArray = initializeArray(x,y);
        nextArray = initializeArray(x,y);
    }

    private int[][] initializeArray(int x, int y) {
        int array[][] = new int[x][];
        for(int i = 0; i < x; i++) {
            array[i] = new int[y];
        }
        return array;
    }

    public int[][] getCurrentArray() {
        return currentArray;
    }

    public void setCurrentArray(int[][] currentArray) {
        this.currentArray = currentArray;
    }

    public void iterate() {
        for(int i = 1; i < currentArray.length - 1; i++)
        {
            for(int j = 1; j < currentArray.length - 1; j++)
            {
                int countNeighbors = currentArray[i-1][j-1] +
                        currentArray[i][j-1] +
                        currentArray[i+1][j-1] +
                        currentArray[i-1][j] +
                        currentArray[i+1][j] +
                        currentArray[i+1][j-1] +
                        currentArray[i+1][j] +
                        currentArray[i+1][j+1];
                if(countNeighbors < 2)
                {
                    nextArray[i][j] = 0;
                }
                else if(countNeighbors == 2)
                {
                    nextArray[i][j] = currentArray[i][j];
                }
                else if(countNeighbors == 3)
                {
                    nextArray[i][j] = 1;
                }
                else if(countNeighbors > 3)
                {
                    nextArray[i][j] = 0;
                }
            }
        }
        currentArray = nextArray;
    }
}