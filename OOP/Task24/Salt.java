import java.time.LocalDate;

public class Salt extends Product{
    public Salt() {
        super("Salt", 0, 0);
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
