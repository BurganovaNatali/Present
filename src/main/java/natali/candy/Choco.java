package natali.candy;

public class Choco extends Candy {

    private static final String TASTE = "Шоколадный вкус";
    private static final int SUGAR = 9;

    public Choco(String name, int weight) {
        super(name, weight, weight * SUGAR);
    }

    public String taste() {
        return TASTE;
    }



}
