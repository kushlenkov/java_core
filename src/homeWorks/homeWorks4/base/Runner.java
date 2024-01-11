package homeWorks.homeWorks4.base;

public class Runner {
    public static void main(String[] args) throws FlyException {
        Duck duck1 = new Duck(false);
        Duck duck2 = new Duck(true);
        Jet jet1 = new Jet(100);
        Jet jet2 = new Jet(0);
        Flyable[] flyables = {duck1, duck2, jet1, jet2};

        for (Flyable flyable : flyables) {
            try {
                flyable.canFly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
