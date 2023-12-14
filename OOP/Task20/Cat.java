public class Cat {
    private String name;
    private int satiety;

    public Cat(String name) {
        this.name = name;
        this.satiety = 0;
    }

    public int getSatiety() {
        return satiety;
    }

    public void feed(Food food) {
        satiety += food.getSatietyLevel();
        System.out.println(name + " fed " + food.getName() + ". Satiety level is: " + satiety);
    }
}