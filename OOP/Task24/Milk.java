import java.time.LocalDate;

public class Milk extends Product{

    public Milk(){
        super("Milk", 60, 2);
    }

    @Override
    public boolean isFresh() {
        if (isInIcebox()) {
            return getProducedDate().isBefore(LocalDate.now().minusDays(getExpirationDate()));
        } else {
            return getProducedDate().isBefore(LocalDate.now().minusDays((getExpirationDate() / getTemperature())));
        }
    }
}


