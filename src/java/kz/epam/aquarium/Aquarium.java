import java.util.HashSet;
import java.util.Set;

/**
 * Класс описывающий аквариум
 */
public class Aquarium {
    private Set<AquariumItem> aquariumItems;

    public Aquarium() {
        this.aquariumItems = new HashSet<>();
    }

    private String getAquariumContent() {
        StringBuilder resultAquariumContent = new StringBuilder("[ ");
        for (AquariumItem aquariumItem : aquariumItems)
            resultAquariumContent.append(aquariumItem.getClass().getSimpleName())
                    .append(":").append(aquariumItem.getName()).append(":")
                    .append(aquariumItem.getPrice()).append("; ");
        resultAquariumContent.append("]");
        return resultAquariumContent.toString();
    }

    private double getTotalPrice() {
        double result = 0;
        for (AquariumItem aquariumItem : aquariumItems)
            result += aquariumItem.getPrice();
        return result;
    }

    public void addItemToAquarium(AquariumItem aquariumItem) {
        aquariumItems.add(aquariumItem);
        if (aquariumItem.getClass().equals(Reptile.class)) {
            aquariumItems.add(AquariumLamp.getInstance());
        }
        if (aquariumItem.getClass().equals(Fish.class)) {
            aquariumItems.add(AquariumFilter.getInstance());
        }
    }

    @Override
    public String toString() {
        return getAquariumContent() + "\n" + "Total price of aquarium is: " +getTotalPrice();
    }

}
