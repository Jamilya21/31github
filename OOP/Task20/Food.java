public class Food {
    private String name;
    private int satietyLevel;
    private int thirstyLevel;

    public Food(String name, int satietyLevel, int thirstyLevel) {
        this.name = name;
        this.satietyLevel = satietyLevel;
        this.thirstyLevel = thirstyLevel;
    }

    public int getSatietyLevel() {
        return satietyLevel;
    }

    public String getName() {
        return name;
    }

    public int getThirstLevel(){
        return thirstyLevel;
    }
}