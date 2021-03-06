import java.util.*;


import java.io.*;
public class FamilyRelationships {

    //TJ and Tyler contributed to main 
    public static void main(String[] args){

        //interaction with user asking for file name
        Scanner in = new Scanner(System.in);
        System.out.print("Where is the input file? ");
        String inputFile = in.nextLine();

        String personName = "";
        while(true){
            //loops through different people inputted until the user types "quit" 
            System.out.print("Person's name ('quit' to end)? ");
            personName = in.nextLine();
            if(personName.equalsIgnoreCase("quit")){
                break;
            }

            //tj
            //creates a Scanner object to read the input file and passes it to the FamilyInfo info class to 
            //parse into Person objects.
            FamilyInfo parser = new FamilyInfo();
            try(Scanner input = new Scanner(new File(inputFile))) {
                parser.read(input);
                //The familyinfo object now has a field that is an arraylist of all Person objects
            } catch (Exception e) {
                e.printStackTrace();
            } 
            //Call ancestor and descendant methods to output ancestors and descendants.
            Person myPerson = parser.getPerson(personName);
            if(myPerson != null){
                //prints ancestors and descendants 
                System.out.println("Ancestors:");
                ancestors(myPerson);
                System.out.println("Descendants:");
                descendants(myPerson, 1);
            }
        }
    }
    
    //TJ and Yash contributed to descendants 
    public static void descendants(Person p, int level){
        for (int j = 0; j < level; j++) {
            System.out.print("\t");
        }
        System.out.println(p.getName());
        ArrayList<Person> kids =  new ArrayList<Person>();
        kids = p.getKids();
        for (int i = 0; i < p.getKids().size(); i++) {
            descendants(p.getKids().get(i), level + 1);
        }
        
    }

    //Gabe coded both ancestors methods 
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
            //Recurisively sends through this person's mother into the ancestors method with
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
            //Recurisively sends through this person's father into the ancestors method with
            //an increment on level
            ancestors(p.getFather(), level + 1);
        }
    }
}
