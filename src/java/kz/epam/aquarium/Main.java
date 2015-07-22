import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Точка входа в программу
 */
public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static final double DEFAULT_PRICE = 100;

    private static String getName(String className) {
        System.out.println("Type name of " + className);
        return sc.next();

    }

    private static double getPrice(String className) {
        System.out.println("Type price of " + className);
        double result;
        try {
            result = sc.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("its not a price, price is set by default - " + DEFAULT_PRICE);
            result = DEFAULT_PRICE;
            sc.next();
        }
        return result;
    }

    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();
        try {
            do {
                System.out.println("Choose the item for add to aquarium: 1 - Fish, 2 - Reptile (fish by default)");
                if ("2".equals(sc.next())) {
                    aquarium.addItemToAquarium(new Reptile(getName(Reptile.class.getSimpleName()), getPrice(Reptile.class.getSimpleName())));
                } else {
                    aquarium.addItemToAquarium(new Fish(getName(Fish.class.getSimpleName()), getPrice(Fish.class.getSimpleName())));
                }
                System.out.println(aquarium.toString());
                System.out.println("Type QUIT to quit or something else if you want to continue");
            } while (!"quit".equals(sc.next().toLowerCase()));
        } finally {
            sc.close();
        }
    }

}
