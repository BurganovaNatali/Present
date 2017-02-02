package natali.candy;

public abstract class Candy  {

    private String name;
    private int weight;
    private int sugar;

    public Candy(String name, int weight, int sugar) {
        this.name = name;
        this.weight = weight;
        this.sugar = sugar;
    }

    public abstract String taste();  //вкус

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", sugar=" + sugar +
                '}';
    }
}
