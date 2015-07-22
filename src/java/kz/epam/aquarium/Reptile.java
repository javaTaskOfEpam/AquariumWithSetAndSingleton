/**
 * Класс описывающий Рептилию
 */
public class Reptile extends AquariumPet implements AquariumItem {

    protected Reptile(String nameOfPet, double priceOfPet) {
        super(nameOfPet, priceOfPet);
    }

    @Override
    public double getPrice() {
        return this.getPriceOfPet();
    }

    @Override
    public String getName() {
        return this.getNameOfPet();
    }
}
