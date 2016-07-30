package qktiled.object;

/**
 * <code>TileObjectType</code> contains the type of an object.
 */
public class TileObjectType {
    private String objectType;

    public TileObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }
}
