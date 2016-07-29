package qktiled;

/**
 * <code>Data</code> of the {@Link Layer}
 */
public class Data {

    /**
     * The encode used by Tiled
     */
    private String encoding;

    /**
     * The grid with the gid's of the map
     */
    private String[] grid;

    public Data(String encoding, String[] grid) {
        this.encoding = encoding;
        this.grid = grid;

    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String[] getGrid() {
        return grid;
    }

    public void setGrid(String[] grid) {
        this.grid = grid;
    }
}
