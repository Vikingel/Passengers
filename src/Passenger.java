public class Passenger {
    String name;
    int age;
    int weight;

    public Passenger(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight=weight;
    }
    //private Passenger seat[];

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age=" + age +", "+weight+
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getWeight() {
        return weight;
    }
}
