package qktiled;

/**
 * <code>TileSet</code> contains the info of map TileSets.
 */
public class TileSet {

    /**
     * First and last gid
     */
    int firstGid, lastGid;

    String name;

    TileSetImage image;

    int tileWidth, tileHeight, tileCount;

    int columns;

    int tileAmountWidth;

    public TileSet(int firstGid, String name, TileSetImage image, int tileWidth, int tileHeight, int tileCount, int columns) {
        this.firstGid = firstGid;
        this.name = name;
        this.image = image;
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.tileCount = tileCount;
        this.columns = columns;
        this.tileAmountWidth = (int) Math.floor(image.getImageWidth() / tileWidth);
        this.lastGid = tileAmountWidth * (int) Math.floor(image.getImageHeight() / tileHeight) + firstGid;
    }

    public int getTileAmountWidth() {
        return tileAmountWidth;
    }

    public void setTileAmountWidth(int tileAmountWidth) {
        this.tileAmountWidth = tileAmountWidth;
    }

    public int getLastGid() {
        return lastGid;
    }

    public void setLastGid(int lastGid) {
        this.lastGid = lastGid;
    }

    public int getFirstGid() {
        return firstGid;
    }

    public void setFirstGid(int firstGid) {
        this.firstGid = firstGid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TileSetImage getImage() {
        return image;
    }

    public void setImage(TileSetImage image) {
        this.image = image;
    }

    public int getTileWidth() {
        return tileWidth;
    }

    public void setTileWidth(int tileWidth) {
        this.tileWidth = tileWidth;
    }

    public int getTileHeight() {
        return tileHeight;
    }

    public void setTileHeight(int tileHeight) {
        this.tileHeight = tileHeight;
    }

    public int getTileCount() {
        return tileCount;
    }

    public void setTileCount(int tileCount) {
        this.tileCount = tileCount;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
