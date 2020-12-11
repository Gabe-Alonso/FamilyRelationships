import java.util.*;
import java.io.*;
public class FamilyRelationships {

    public static void main(String[] args){
        try {
            Scanner input = new Scanner(new File("tudor.dat"));
            FamilyInfo parser = new FamilyInfo();
            parser.read(input);
            //The familyinfo object now has a field that is an arraylist of all Person objects
            //TODO: implement user experience, call ancestors or descendants
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }

        /*
        System.out.println("Where is the input file?");
        String inputFile = input.nextLine();
        System.out.println("Person's name ('quit' to end)?");
        String personName = input.nextLine();
        */
        String inputFile = "tudor.dat";
        String personName = "Henry VII";
    }

    public static void ancestors(Person person, int level){
        Person mother = person.getMother();
        Person father = person.getFather();
    }

    public static void descendants(){
        
    }
}
