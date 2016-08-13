package qktiled;

import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.list.mutable.FastList;
import qktiled.object.ObjectGroup;

/**
 * <code>Map</code> main structure.
 */
public class Map {

    /**
     * The map size (in tiles)
     */
    private int mapWidth, mapHeight;

    /**
     * The tiles size (in pixels)
     */
    private int tileWidth, tileHeight;

    //todo
    private int nextObjectId;

    private String version;

    /**
     * Lists
     */
    private MutableList<TileSet> tileSets;

    private MutableList<Layer> mapLayers;

    private MutableList<ObjectGroup> mapObjectsGroups;

    public Map() {
        tileSets = new FastList<>();
        mapLayers = new FastList<>();
        mapObjectsGroups = new FastList<>();
    }

    public Map(int mapWidth, int mapHeight,
               int tileWidth, int tileHeight,
               MutableList<TileSet> tileSets, MutableList<Layer> mapLayers, MutableList<ObjectGroup> mapObjectsGroups) {
        this.mapWidth = mapWidth;
        this.mapHeight = mapHeight;
        this.tileWidth = tileWidth;
        this.tileHeight = tileHeight;
        this.tileSets = tileSets;
        this.mapLayers = mapLayers;
        this.mapObjectsGroups = mapObjectsGroups;
    }

    public  MutableList<ObjectGroup> getMapObjectsGroups(){ return mapObjectsGroups; }

    public void addObjectGroup(ObjectGroup og) {
        this.mapObjectsGroups.add(og);
    }

    public MutableList<Layer> getMapLayers() {
        return mapLayers;
    }

    public void addLayer(Layer l) {
        mapLayers.add(l);

    }

    public void setMapLayers(MutableList<Layer> mapLayers) {
        this.mapLayers = mapLayers;
    }

    public int getMapWidth() {
        return mapWidth;
    }

    public void setMapWidth(int mapWidth) {
        this.mapWidth = mapWidth;
    }

    public int getMapHeight() {
        return mapHeight;
    }

    public void setMapHeight(int mapHeight) {
        this.mapHeight = mapHeight;
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

    public int getNextObjectId() {
        return nextObjectId;
    }

    public void setNextObjectId(int nextObjectId) {
        this.nextObjectId = nextObjectId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public MutableList<TileSet> getTileSets() {
        return tileSets;
    }

    public void addTileSet(TileSet ts) {
        tileSets.add(ts);
    }

    public void setTileSets(MutableList<TileSet> tileSets) {
        this.tileSets = tileSets;
    }

    /**
     * <p>Gives the TileSet corresponding to the gid</p>
     *
     * @param gid
     * @return A TileSet if contains the given gid, <code>null</code> otherwise
     */
    public TileSet getImageByGID(int gid) {

        for (TileSet ts : tileSets) {
            if (gid >= ts.getFirstGid() && gid <= ts.getLastGid())
                return ts;
        }
        return null;
    }
}
