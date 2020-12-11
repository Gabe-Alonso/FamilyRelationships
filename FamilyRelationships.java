import java.util.*;

import org.graalvm.compiler.phases.common.ConditionalEliminationUtil.InputFilter;

public class FamilyRelationships {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("This program will show you all of the ancestors and descendant of a person");

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
