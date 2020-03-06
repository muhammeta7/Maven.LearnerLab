package io.zipcoder.interfaces;

public final class Instructors extends People<Instructor> {

    private final static Instructors INSTANCE = new Instructors();

    private Instructors(){
        add(new Instructor(1, "Roberto"));
        add(new Instructor(2, "Nobles"));
        add(new Instructor(3, "Dolio"));
        add(new Instructor(4, "Froilan"));
    }

    public static Instructors getInstance(){
        return INSTANCE;
    }

    @Override
    public Instructor[] getArray() {
        return getPersonList().toArray(new Instructor[0]);
    }

}
