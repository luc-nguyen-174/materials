import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Meat extends Material implements Discount {
    private double weight;

    @Override
    public double getAmount() {
        return cost * weight;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusDays(5);
    }

    public Meat() {
    }

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }


    @Override
    public String toString() {
        return "Meat{" +
                "weight=" + weight +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost +
                '}';
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
