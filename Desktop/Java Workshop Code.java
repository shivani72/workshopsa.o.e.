import java.io.*;

/*
    This AlphaOmegaEpsilon class's objects are people that belong to this engineering sorority throughout the USA.
    This class aims to define each member's unique identity
*/
class AlphaOmegaEpsilon
{
    //variables: (non-static and static) define attributes of each object
    //non-static variables, aka instance variables, are each unique to each object
    
    private String major;
    private boolean isAnOfficer;
    private String chapter; //Each university has a different chapter, e.g. UIUC chapter name is theta
    private int yearInSchool;
    private String big;
    private int sisterHours;
    private boolean missedChapter;
    
    //static variables are common to all objects
    //for example, numberActive in A.O.E is not unique to each instance/object of 
    //this class
    private static int numberActive = 50;
    private static int numberOfficers = 15;

    //every class has a main method
    public static void main (String[] args) throws java.lang.Exception
    {
        //constructing an object/instance of the class
        AlphaOmegaEpsilon shivani  = new AlphaOmegaEpsilon();
        
        
        shivani.big = "Morgan";
        shivani.isAnOfficer = true;
        shivani.yearInSchool = 2;
        
        System.out.println("Shivani is in year " + shivani.yearInSchool);
        
        //showing the difference between println and print
        System.out.print("Hey, ");
        
        //calling a method
        shivani.setSisterHours(true);
    }
    
    //METHODS: perform actions
    
    //type of method: a getter - tell some other class, e.g. tri delts, the number active in a.o.e.
    public int getNumberActive() {
        return numberActive;
        
    }
    
    //type of method: a setter
    public void setSisterHours(boolean missedCh)
    {
        //put in the value passed into this method into our variable that was declared above
        missedChapter = missedCh;
        
        //if statement
        if (missedChapter) {
            sisterHours++;
            System.out.print("Shivani has " + sisterHours + " sister hour(s)");
        }
           
        
            
    }
    
    
    
    
}

