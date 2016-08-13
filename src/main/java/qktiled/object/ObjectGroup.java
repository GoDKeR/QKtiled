package qktiled.object;

import org.eclipse.collections.api.list.ImmutableList;
import org.eclipse.collections.api.list.MutableList;
import org.eclipse.collections.impl.list.mutable.FastList;

import java.util.stream.Collectors;

public class ObjectGroup {
    private MutableList<TileObject> mapObjects;
    private String name;

    public ObjectGroup(MutableList<TileObject> mapObjects, String name) {
        this.mapObjects = mapObjects;
    }

    public ObjectGroup(String name) {
        this.name = name;

        this.mapObjects = new FastList<TileObject>();
    }

    public void addObject(TileObject to){
        this.mapObjects.add(to);
    }

    public void addObject(ImmutableList<TileObject> list){
        for (TileObject to : list){
            this.mapObjects.add(to);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param x in pixels.
     * @param y in pixels.
     * @return A <code>TileObject</code> if found, <code>null</code> otherwise.
     */
    public TileObject getObjectAt(int x, int y){
        for (TileObject to : mapObjects){
            if ((to.getMapX() >= x) && (to.getMapY() >= y) &&
                    (to.getMapX() <= (x + to.getObjWidth())) && (to.getMapY() <= (y + to.getObjHeight())))
                return to;
        }
        return null;
    }

    /**
     *
     * @param objectType
     * @return
     */
    public ImmutableList<TileObject> getObjectsByType(String objectType){
        MutableList<TileObject> objList =
                mapObjects.stream().filter(to -> objectType.equalsIgnoreCase(to.getObjType().getObjectType())).collect(Collectors.toCollection(FastList::new));

        return objList.toImmutable();
    }

    public TileObject getObjectById(int objectID){
        for (TileObject to : mapObjects) {
            if (to.getObjId() == objectID)
                return to;
        }
        return null;
    }
}
