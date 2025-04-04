public class MarkerStyle {
    private String icon;
    private String color;

    public MarkerStyle(String icon, String color) {
        this.icon = icon;
        this.color = color;
    }

    public void draw(String name, int x, int y) {
        System.out.println("Drawing " + name + " at (" + x + "," + y + ") using icon: " + icon + ", color: " + color);
    }
}
