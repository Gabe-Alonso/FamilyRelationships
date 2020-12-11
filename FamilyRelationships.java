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

    public static void ancestors(){

    }

    public static void descendants(){
        
    }
}
