package lecture.lesson7;

public enum Country {
    RUSSIA(240),
    FRANCE(70),
    ITALY(80),
    SOUTH_KERA(60);

    private long countPeoples;

    Country(long countPeoples) {
        this.countPeoples = countPeoples;
    }

    public long getCountPeoples() {
        return countPeoples;
    }
}
