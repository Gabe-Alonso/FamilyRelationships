import java.util.*;
//tyler coded this class 
public class Person {

    //instance variables 
    private String personName;
    private Person mother;
    private Person father;
    private ArrayList<Person> kids;

    //constructs a person with the name given
    public Person(String name){
        personName = name;
        kids = new ArrayList<Person>();
    }
    //sets the person's mother to the Person inputted
	public void setMother(Person motherIn) {
        mother = motherIn;
	}
    //Adds child inputted to arraylist of children 
	public void addKid(Person person) {
        kids.add(person);
	}
    //sets the person's father to the Person inputted
	public void setFather(Person fatherIn) {
        father = fatherIn;
    }
    //returns name of given person 
    public String getName() {
        return personName;
    }
    //returns mother of given person 
    public Person getMother(){
        return mother;
    }
    //returns father of given person 
    public Person getFather(){
        return father;
    }

    //returns arraylist of children 
    public ArrayList<Person> getKids(){
        return kids;
    }
}
