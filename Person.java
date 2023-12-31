package Basic_Projects;

public class Person {
    private String name;
    private int age;
    private double weight;
    private boolean retiree;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isRetiree() {
        return retiree;
    }

    public void setRetiree(boolean retiree) {
        this.retiree = retiree;
    }

    public Person(String name, int age, double weight, boolean retiree) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.retiree = retiree;
    }
}
