package practice.oop.inheritance.lesson9.task;

public abstract class Human {

    private String gender;

    public Human(String gender) {
        this.gender = gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public abstract void makeMoneyOnJob();

}
