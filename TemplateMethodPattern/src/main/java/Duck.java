public class Duck implements Comparable<Duck>{
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    @Override
    public int compareTo(Duck o) {
        return this.weight - o.weight;
    }

    @Override
    public String toString() {
        return "name: " + name + ", weight: " + weight;
    }

}
