import java.time.LocalDate;

public class Fish extends Product{
    public Fish() {
        super("Fish", 20, 6);
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
