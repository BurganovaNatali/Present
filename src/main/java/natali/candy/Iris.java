package natali.candy;

public class Iris extends Candy {

    private static final int SUGAR = 8;

    public static final String TASTE = "Медовый вкус";


    public Iris(String name, int weight) {
        super(name, weight, SUGAR * weight);
    }

    public String taste() {
        return TASTE;
    }

}
