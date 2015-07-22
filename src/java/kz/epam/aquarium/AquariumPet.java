/**
 * Описывает абстрактное аквариумное животное
 * от которого будут наследоваться конкретные
 * экземляры животных
 */
public abstract class AquariumPet {
    private String nameOfPet;
    private double priceOfPet;

    protected AquariumPet(String nameOfPet, double priceOfPet) {
        this.nameOfPet = nameOfPet;
        this.priceOfPet = priceOfPet;
    }

    protected String getNameOfPet() {
        return this.nameOfPet;
    }

    protected double getPriceOfPet() {
        return this.priceOfPet;
    }
}
