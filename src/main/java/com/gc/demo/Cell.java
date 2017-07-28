package com.gc.demo;

public class Cell {

    public static boolean liveOrDie(boolean isLive, int liveNeighbors) {
        if(isLive && (liveNeighbors > 3 || liveNeighbors < 2)) return false;
        if(!isLive && (liveNeighbors == 3)) return true;
        return isLive;
    }

    public static boolean[][] advanceGeneration(boolean[][] grid) {
        // a new clean boolean grid to keep track of our next generation
        boolean[][] ice = new boolean[grid.length][grid[0].length];
        // int outside of loop in order to keep track of neighboring live cell count.
        int neighbors = 0;
        for (int i = 0; i < ice.length; i++) {
            for(int j = 0; j < ice[i].length; j++) {

                //four checks around the grid. First checks if on border, and if not, proceeds in that direction and fishes out boolean of adjacent cell.
                if(i != 0 && grid[i-1][j]) neighbors++;
                if((i != grid.length -1) && grid[i+1][j]) neighbors++;
                if(j != 0 && grid[i][j-1]) neighbors++;
                if((j != grid[i].length - 1) && grid[i][j+1]) neighbors++;

                ice[i][j] = liveOrDie(grid[i][j], neighbors);
                neighbors = 0;
            }
        }
        return ice;
    }

}
