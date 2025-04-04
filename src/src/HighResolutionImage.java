public class HighResolutionImage implements Image {
    private String fileName;

    public HighResolutionImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading full image: " + fileName);
    }

    @Override
    public void displayThumbnail() {
        System.out.println("Showing thumbnail for: " + fileName);
    }

    @Override
    public void displayFullImage() {
        System.out.println("Displaying full-resolution image: " + fileName);
    }
}
