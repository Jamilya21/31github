import java.time.LocalDate;

public class Stew extends Product{
    public Stew() {
        super("Stew", 180, 0);
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
