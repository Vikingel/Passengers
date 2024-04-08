import java.util.ArrayList;

public class Bus {
    int seats;

    public Bus(int seats, ArrayList[] Passenger) {
        this.seats=seats;
        Passenger = new ArrayList[]{new ArrayList<>()};
    }
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                ", age=" + age +", "+weight+
                '}';
    }
}
