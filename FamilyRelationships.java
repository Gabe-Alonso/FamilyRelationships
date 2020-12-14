import java.util.*;


import java.io.*;
public class FamilyRelationships {

    public static void main(String[] args){

        //tyler
        Scanner in = new Scanner(System.in);
        System.out.println("Where is the input file?");
        String inputFile = in.nextLine();

        String personName = "";
        while(true){
            System.out.println("Person's name ('quit' to end)?");
            personName = in.nextLine();
            if(personName.equalsIgnoreCase("quit")){
                break;
            }

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
            if(myPerson != null){
                System.out.println("Ancestors:");
                ancestors(myPerson);
                System.out.println("Descendants:");
                //descendants(myPerson);
            }
        }
    }

    //yash
    public static void descendants(Person person, int level){
        //Person mother = person.getMother();
        //Person father = person.getFather();
    }

    //gabe
    //Prints out the desired first person's name and begins the recursive process
    public static void ancestors(Person p){
        System.out.println("\t" + p.getName());
        ancestors(p, 1);
    }

    //Prints out all of the desired person's ancestors
    //Inhererits a mother/father and level of tabs
    public static void ancestors(Person p, int level){
        //Recursively goes through every mother and prints them with proper spacing

        //Makes sure the mother exists
        if(p.getMother() != null && !(p.getMother().getName().equals("unknown"))){
            //Spaces out the person's name
            for(int i = 0; i <= level; i++){
                System.out.print("\t");
            }
            //Print's the mother's name
            System.out.println(p.getMother().getName());
            //Recurisively sends through this mother's mother into the ancestors method with
            //an increment on level
            ancestors(p.getMother(), level + 1);
        }

        //Recursively goes through every father and prints them with proper spacing

        //Makes sure the father exists
        if(p.getFather() != null && !(p.getFather().getName().equals("unknown"))){
            //Spaces out the person's name
            for(int i = 0; i <= level; i++){
                System.out.print("\t");
            }
            //Print's the father's name
            System.out.println(p.getFather().getName());
            //Recurisively sends through this father's father into the ancestors method with
            //an increment on level
            ancestors(p.getFather(), level + 1);
        }
    }
}
