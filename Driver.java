package Lab2;

public class Driver {

    public static void main(String[] args) {
        Province BC = new Province("British Columbia", "Victoria", 13);
        System.out.println(BC.getDetails());
        Province Al = new Province("Alberta", "Edmonton", 4);
        System.out.println(Al.getDetails());
        Province QU = new Province("Quebec", "Montreal", 8);
        System.out.println(QU.getDetails());
    }
}

