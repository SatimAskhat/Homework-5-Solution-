public class ImageProxy implements Image {
    private String fileName;
    private HighResolutionImage realImage;

    public ImageProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Showing cached thumbnail for: " + fileName);
    }

    @Override
    public void displayFullImage() {
        if (realImage == null) {
            realImage = new HighResolutionImage(fileName);
        }
        realImage.displayFullImage();
    }
}
