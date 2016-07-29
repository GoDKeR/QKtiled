package qktiled;

/**
 * <code>Layer</code>
 */
public class Layer {

    /**
     * The name of the layer.
     */
    private String layerName;

    /**
     * The size of the layer.
     */
    private int layerWidth, layerHeight;

    /**
     * The data grid.
     */
    private Data layerData;

    /**
     * Layer matrix with the map gid's
     */
    private int[][] tileCoordinates;

    public Layer(String layerName, int layerWidth, int layerHeight, Data layerData) {
        this.layerName = layerName;
        this.layerWidth = layerWidth;
        this.layerHeight = layerHeight;
        this.layerData = layerData;

        tileCoordinates = new int[layerWidth][layerHeight];

        /**
         * Fill the layer coords with the gid
         */
        for (int x = 0; x < layerWidth; x++) {
            for (int y = 0; y < layerHeight; y++) {
                tileCoordinates[x][y] = Integer.parseInt(layerData.getGrid()[(x + (y * layerWidth))]);
            }
        }
    }

    public int[][] getTileCoordinates() {
        return tileCoordinates;
    }

    public void setTileCoordinates(int[][] tileCoordinates) {
        this.tileCoordinates = tileCoordinates;
    }

    public String getLayerName() {
        return layerName;
    }

    public void setLayerName(String layerName) {
        this.layerName = layerName;
    }

    public int getLayerWidth() {
        return layerWidth;
    }

    public void setLayerWidth(int layerWidth) {
        this.layerWidth = layerWidth;
    }

    public int getLayerHeight() {
        return layerHeight;
    }

    public void setLayerHeight(int layerHeight) {
        this.layerHeight = layerHeight;
    }

    public Data getLayerData() {
        return layerData;
    }

    public void setLayerData(Data layerData) {
        this.layerData = layerData;
    }
}
