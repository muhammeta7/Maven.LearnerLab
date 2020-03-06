package io.zipcoder.interfaces;

public enum Educator implements Teacher{

    DOLIO("Dolio", 1),
    FROILAN("Froilan", 2),
    NOBLES("Nobles", 3),
    ROBERTO("Roberto", 4),
    KRIS("Kris", 5);



    final Instructor instructor;
    double timeWorked = 0;

    Educator(String name, long id){
        instructor = new Instructor(id, name);
        instructor.setName(name);
        Instructors.getInstance().add(instructor);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        instructor.teach(learner, numberOfHours);
        timeWorked += numberOfHours;
    }

    @Override
    public void lecture(Learner[] learner, double numberOfHours) {
        instructor.lecture(learner, numberOfHours);
        timeWorked += numberOfHours;
    }
}


