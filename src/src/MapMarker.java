public class MapMarker {
    private int x, y;
    private String name;
    private MarkerStyle style;

    public MapMarker(int x, int y, String name, MarkerStyle style) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.style = style;
    }

    public void render() {
        style.draw(name, x, y);
    }
}
