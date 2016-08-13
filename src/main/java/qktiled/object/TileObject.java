package qktiled.object;

/**
 * <code>TileObject</code>
 */
public class TileObject {

    /**
     * Bits on the far end of the 32-bit global tile ID are used for tile flags
     */
    private final static long FLIPPED_HORIZONTALLY_FLAG = 0x80000000;
    private final static long FLIPPED_VERTICALLY_FLAG   = 0x40000000;

    private int objId;

    private boolean hFlipped, vFlipped;

    private long gID;

    private int mapX, mapY;

    private int objWidth, objHeight;

    private boolean objVisible;

    private TileObjectType objType;

    public TileObject(int objId,
                      long gID, int mapX,
                      int mapY, int objWidth,
                      int objHeight,
                      boolean objVisible,
                      TileObjectType objType) {
        this.objId = objId;

        this.hFlipped = (gID & FLIPPED_HORIZONTALLY_FLAG) > 0;
        this.vFlipped = (gID & FLIPPED_VERTICALLY_FLAG) > 0;

        /**
         * Clear the flags
         */
        gID &= ~(FLIPPED_HORIZONTALLY_FLAG |
                FLIPPED_VERTICALLY_FLAG);

        this.gID = gID;
        this.mapX = mapX;
        this.mapY = mapY;
        this.objWidth = objWidth;
        this.objHeight = objHeight;
        this.objVisible = objVisible;
        this.objType = objType;
    }

    public int getObjId() {
        return objId;
    }

    public void setObjId(int objId) {
        this.objId = objId;
    }

    public boolean ishFlipped() {
        return hFlipped;
    }

    public void sethFlipped(boolean hFlipped) {
        this.hFlipped = hFlipped;
    }

    public boolean isvFlipped() {
        return vFlipped;
    }

    public void setvFlipped(boolean vFlipped) {
        this.vFlipped = vFlipped;
    }

    public long getgID() {
        return gID;
    }

    public void setgID(long gID) {
        this.gID = gID;
    }

    public int getMapX() {
        return mapX;
    }

    public void setMapX(int mapX) {
        this.mapX = mapX;
    }

    public int getMapY() {
        return mapY;
    }

    public void setMapY(int mapY) {
        this.mapY = mapY;
    }

    public int getObjWidth() {
        return objWidth;
    }

    public void setObjWidth(int objWidth) {
        this.objWidth = objWidth;
    }

    public int getObjHeight() {
        return objHeight;
    }

    public void setObjHeight(int objHeight) {
        this.objHeight = objHeight;
    }

    public boolean isObjVisible() {
        return objVisible;
    }

    public void setObjVisible(boolean objVisible) {
        this.objVisible = objVisible;
    }

    public TileObjectType getObjType() {
        return objType;
    }

    public void setObjType(TileObjectType objType) {
        this.objType = objType;
    }
}
