package natali.candy;

public class Caramel extends Candy{


    private static final int SUGAR = 7;

    private static final String TASTE = "Яблочный вкус";

    public Caramel(String name, int weight) {
        super(name, weight, SUGAR * weight);
    }

    public String taste() {
        return TASTE;
    }


}
