package io.zipcoder.interfaces;

import com.sun.org.glassfish.gmbal.InheritedAttribute;

import java.util.ArrayList;
import java.util.List;

public abstract class People<E extends Person> {

    private List<E> personList = new ArrayList<>();

    public void add(E person){
        personList.add(person);
    }

    public E findById(long id){

        for(E person : personList){
            if(person.getId() == id){
                return person;
            }
        }
        return null;

    }

    public void remove(Person person){
        personList.remove(person);
    }

    public void remove(long id){
        personList.remove(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract E[] getArray();

    public List<E> getPersonList(){
        return personList;
    }

}
