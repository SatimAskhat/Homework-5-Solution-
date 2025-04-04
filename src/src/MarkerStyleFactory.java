import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static Map<String, MarkerStyle> styles = new HashMap<>();
    private static int styleCount = 0;

    public static MarkerStyle getStyle(String icon, String color) {
        String key = icon + "_" + color;
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color));
            styleCount++;
        }
        return styles.get(key);
    }

    public static int getStyleCount() {
        return styleCount;
    }
}
