package production;

public class Tool {

    public int weight;
    public String name;

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
                "weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
