import java.time.LocalDate;
import java.util.Random;

public abstract class Product {
    private String name;
    private int expirationDate;
    private LocalDate producedDate;
    private int temperature;
    private boolean isInIcebox;

    public Product(String name, int expirationDate, int temperature) {
        this.name = name;
        this.expirationDate = expirationDate;
        this.temperature = temperature;
        this.producedDate = LocalDate.now().minusDays(new Random().nextInt(200) + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDate getProducedDate() {
        return producedDate;
    }

    public void setProducedDate(LocalDate producedDate) {
        this.producedDate = producedDate;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public boolean isInIcebox() {
        return isInIcebox;
    }

    public int setInIcebox(boolean inIcebox) {
        isInIcebox = inIcebox;
        return 0;
    }

    public abstract boolean isFresh();

}

