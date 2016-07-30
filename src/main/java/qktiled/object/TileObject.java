package qktiled.object;

/**
 * <code>TileObject</code>
 */
public class TileObject {
    private int objId;

    private boolean hFlipped, vFlipped;

    private int gID;

    private int mapX, mapY;

    private int objWidth, objHeight;

    private boolean objVisible;

    private TileObjectType objType;

    public TileObject(int objId,
                      int gID, int mapX,
                      int mapY, int objWidth,
                      int objHeight,
                      boolean objVisible,
                      TileObjectType objType) {
        this.objId = objId;
        //this.hFlipped = hFlipped;
        //this.vFlipped = vFlipped;
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

    public int getgID() {
        return gID;
    }

    public void setgID(int gID) {
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
