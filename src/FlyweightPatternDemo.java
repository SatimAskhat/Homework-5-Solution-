import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FlyweightPatternDemo {
    private static final String[] types = {"Hospital", "Gas Station", "Restaurant"};
    private static final String[] icons = {"H", "G", "R"};
    private static final String[] colors = {"Red", "Blue", "Green"};

    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 1000; i++) {
            int typeIndex = rand.nextInt(types.length);
            MarkerStyle style = MarkerStyleFactory.getStyle(icons[typeIndex], colors[typeIndex]);
            MapMarker marker = new MapMarker(rand.nextInt(1000), rand.nextInt(1000), types[typeIndex], style);
            markers.add(marker);
        }

        markers.get(0).render(); 

        System.out.println("Total markers: " + markers.size());
        System.out.println("Unique styles: " + MarkerStyleFactory.getStyleCount());
    }
}

