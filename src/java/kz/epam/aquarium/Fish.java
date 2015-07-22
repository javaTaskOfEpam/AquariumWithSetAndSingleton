/**
 * Класс описывающий Рыбку
 */
public class Fish extends AquariumPet implements AquariumItem {

    protected Fish(String nameOfPet, double priceOfPet) {
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
