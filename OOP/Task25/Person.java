import java.util.Calendar;

public class Person {
    private String name;
    private String sureName;
    private int ageBirth;
    private int yearStartJob;

    public Person(String name, String sureName, int ageBirth, int yearStartJob) {
        this.name = name;
        this.sureName = sureName;
        this.ageBirth = ageBirth;
        this.yearStartJob = yearStartJob;
    }

    public int calculateWorkExperience() {
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return Math.max(0, Math.min(currentYear - yearStartJob, currentYear - ageBirth - 18));
    }

}
