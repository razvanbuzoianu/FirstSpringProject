package production;

public class Tool {

    private int weight;
    private String name;

    public Tool(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "weight = " + weight +
                ", name = '" + name + '\'' +
                '}';
    }
}