/**
 * Фильтр нужен рыбкам
 */
public class AquariumFilter implements AquariumItem {
    private static AquariumFilter instance;
    private final double priceOfFilter = 250;
    private final String nameOfFilter = "membrane filter";

    private AquariumFilter() {

    }

    public static AquariumFilter getInstance() {
        if (instance == null){
            instance = new AquariumFilter();
        }
        return instance;
    }

    @Override
    public double getPrice() {
        return priceOfFilter;
    }

    @Override
    public String getName() {
        return nameOfFilter;
    }
}
