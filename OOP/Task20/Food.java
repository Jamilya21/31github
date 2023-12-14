public class Food {
    private String name;
    private int satietyLevel;

    public Food(String name, int satietyLevel) {
        this.name = name;
        this.satietyLevel = satietyLevel;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public String getName() {
        return name;
    }
}