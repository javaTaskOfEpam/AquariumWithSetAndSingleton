/**
 * Лампа нужна рептилиям
 */
public class AquariumLamp implements AquariumItem {
    private static AquariumLamp instance;
    private final double priceOfLamp = 200;
    private final String nameOfLamp = "Yellow lamp";

    private AquariumLamp() {

    }

    public static AquariumLamp getInstance() {
        if (instance == null){
            instance = new AquariumLamp();
        }
        return instance;
    }
    @Override
    public double getPrice() {
        return priceOfLamp;
    }

    @Override
    public String getName() {
        return nameOfLamp;
    }
}
