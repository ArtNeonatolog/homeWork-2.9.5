import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapNew {
    private final Map<Integer, String> map = new LinkedHashMap<>();

    public MapNew () {
        for (int i = 0; i < 10; i++) {
            map.put(i, String.valueOf(i));
        }
    }

    public void printMap () {
        for (Map.Entry<Integer, String> map1 : map.entrySet()) {
            System.out.println("Ключ: " + map1.getKey() + ". Значение: " + map1.getValue());
        }
    }

    @Override
    public String toString() {
        return
                "Рандомный мэп " + map;
    }
}
