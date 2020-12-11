import java.util.*;
import java.io.*;
public class FamilyRelationships {

    public static void main(String[] args){
        //tj
        try {
            Scanner input = new Scanner(new File("tudor.dat"));
            FamilyInfo parser = new FamilyInfo();
            parser.read(input);
            //The familyinfo object now has a field that is an arraylist of all Person objects
            //TODO: implement user experience, call ancestors or descendants
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //tyler
        /*
        System.out.println("Where is the input file?");
        String inputFile = input.nextLine();
        System.out.println("Person's name ('quit' to end)?");
        String personName = input.nextLine();
        */
        String inputFile = "tudor.dat";
        String personName = "Henry VII";
    }

    //yash
    public static void ancestors(Person person, int level){
        Person mother = person.getMother();
        Person father = person.getFather();
    }

    //gabe
    public static void descendants(Person p, int level){
        if(!(p.getMother().getName().equals("unknown"))){
            for(int i = 0; i <= level; i++){
                System.out.print("\t");
            }
            System.out.println(p.getMother().getName());
            descendants(p.getMother(), level + 1);
        }
    }
}
