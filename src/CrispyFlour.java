import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class CrispyFlour extends Material implements Discount{

    private int quantity;
    @Override
    public double getAmount() {
        return quantity * cost;
    }

    @Override
    public LocalDate getExpiryDate() {
        return manufacturingDate.plusYears(1);
    }

    public CrispyFlour() {
    }

    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CrispyFlour{" +
                "quantity=" + quantity +
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
