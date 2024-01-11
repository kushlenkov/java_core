package homeWorks.homeWorks4.advance;

public class Watch {
    boolean watchIsBroken;

    public Watch(boolean watchIsBroken) {
        this.watchIsBroken = watchIsBroken;
    }

    public void doTick() throws WatchBrokenError {
        if (watchIsBroken) {
            throw new WatchBrokenError("Ошибка: часы сломаны");
        }
        System.out.println("Часы тикают");
    }
}
