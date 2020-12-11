

//tylern't

import java.util.*;
//tyler 

public class Person {
    private String personName;
    private Person mother;
    private Person father;
    private ArrayList<Person> kids;


    public Person(String name){
        personName = name;
        kids = new ArrayList<Person>();
    }
	public void setMother(Person motherIn) {
        mother = motherIn;
	}

	public void addKid(Person person) {
        kids.add(person);
	}

	public void setFather(Person fatherIn) {
        father = fatherIn;
	}
    

}
