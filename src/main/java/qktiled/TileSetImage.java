package qktiled;

/**
 * <code>TileSetImage</code> contains the info of the image used in {@Link TileSet}.
 */
public class TileSetImage {
    private int imageWidth, imageHeight;

    private String imageSource;

    public TileSetImage(String imageSource, int imageWidth, int imageHeight) {
        this.imageSource = getAbsoluteFilename(imageSource);

        this.imageWidth = imageWidth;
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public String getImageSource() {
        return imageSource;
    }

    public void setImageSource(String imageSource) {
        this.imageSource = imageSource;
    }

    private String getAbsoluteFilename(String name) {
        final int index = name.lastIndexOf('/');

        return (index <= 0 || index == name.length() - 1 ? name : name.substring(index + 1));
    }

}
