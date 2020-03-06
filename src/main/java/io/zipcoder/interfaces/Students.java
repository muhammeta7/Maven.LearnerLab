package io.zipcoder.interfaces;

public final class Students extends People<Student> {

    private final static Students INSTANCE = new Students();

    private Students(){
        add(new Student(1, "Moe"));
        add(new Student(2, "Leila"));
        add(new Student(3, "Kevin"));
        add(new Student(4, "Han"));
    }

    public synchronized static Students getInstance(){
        return INSTANCE;
    }

    @Override
    public Student[] getArray() {
        return getPersonList().toArray(new Student[0]);
    }


}




