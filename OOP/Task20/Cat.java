public class Cat {
    private String name;
    private int satiety;
    private int thirsty;

    public Cat(String name, int initialSatiety) {
        this.name = name;
        this.satiety = initialSatiety;
        this.thirsty = 0;
    }

    public int getSatiety() {
        return satiety;
    }

    public int getThirsty() {
        return thirsty;
    }

    // public void feed(Food food) {
    //     satiety += food.getSatietyLevel();
    //     System.out.println(name + " fed " + food.getName() + ". Satiety level is: " + satiety);
    // }
     public void feed(Food food) {
        if (thirsty > 50) {
            System.out.println(name + " want to drink but can't eat.");
        } else {
            satiety += food.getSatietyLevel();
            thirsty += food.getThirstLevel();
            System.out.println(name + " fed " + food.getName() + ". Satiety level: " + satiety + ". Thirst level: " + thirsty);
        }
    }
}