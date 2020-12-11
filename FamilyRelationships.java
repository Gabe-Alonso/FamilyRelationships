import java.util.*;


import java.io.*;
public class FamilyRelationships {

    public static void main(String[] args){

        //tyler
        /*
        System.out.println("Where is the input file?");
        String inputFile = input.nextLine();
        System.out.println("Person's name ('quit' to end)?");
        String personName = input.nextLine();
        */
        String inputFile = "tudor.dat";
        String personName = "James VI & I";



        //tj
        FamilyInfo parser = new FamilyInfo();
        try(Scanner input = new Scanner(new File(inputFile))) {
            parser.read(input);
            //The familyinfo object now has a field that is an arraylist of all Person objects
            //TODO: implement user experience, call ancestors or descendants
        } catch (Exception e) {
            e.printStackTrace();
        } 

        Person myPerson = parser.getPerson(personName);
        System.out.println("Ancestors:");
        ancestors(myPerson, 0);
        System.out.println("Descendants:");
        descendants(myPerson, 0);
        
    }

    //yash
    public static void descendants(Person person, int level){
        //Person mother = person.getMother();
        //Person father = person.getFather();
    }

    //gabe
    public static void ancestors(Person p, int level){
        if(p.getMother() != null && !(p.getMother().getName().equals("unknown"))){
            for(int i = 0; i <= level; i++){
                System.out.print("\t");
            }
            System.out.println(p.getMother().getName());
            ancestors(p.getMother(), level + 1);
        }
        if(p.getFather() != null && !(p.getFather().getName().equals("unknown"))){
            for(int i = 0; i <= level; i++){
                System.out.print("\t");
            }
            System.out.println(p.getFather().getName());
            ancestors(p.getFather(), level + 1);
        }
    }
}
