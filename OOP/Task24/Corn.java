import java.time.LocalDate;

public class Corn extends Product{
    public Corn() {
        super("Corn", 150, 0);
    }

    @Override
    public boolean isFresh() {
        if (isInIcebox()) {
            return getProducedDate().isBefore(LocalDate.now().minusDays(getExpirationDate()));
        } else {
            return getProducedDate().isBefore(LocalDate.now().minusDays((getExpirationDate())));
        }
    }
}
