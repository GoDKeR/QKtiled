package qktiled;

/**
 * <code>Data</code> of the {@Link Layer}
 */
public class Data {
    /**
     * The grid with the gid's of the map
     */
    private int[] grid;

    public Data(int[] grid) {
        this.grid = grid;
    }

    public int[] getGrid() {
        return grid;
    }

    public void setGrid(int[] grid) {
        this.grid = grid;
    }
}
