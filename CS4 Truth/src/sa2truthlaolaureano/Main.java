package sa2truthlaolaureano;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //create new instances of tutee
        Tutee s1 = new Tutee("Matthew", 300);
        Tutee s2 = new Tutee("John", 2000, "English", 78);
        
        //create new instances of tutor
        Tutor t1 = new Tutor("Aaron", 500, "Math");
        Tutor t2 = new Tutor("Danica", 200, "Math");
        Tutor t3 = new Tutor("Gerson", 600, "English");

        //create arraylist of tutee and tutor and adds all of the instances
        ArrayList<Tutee> tuteeList = new ArrayList<Tutee>();
        ArrayList<Tutor> tutorList = new ArrayList<Tutor>();
        tuteeList.add(s1);
        tuteeList.add(s2);
        tutorList.add(t1);
        tutorList.add(t2);
        tutorList.add(t3);

        //initialize variables
        Scanner scanner = new Scanner(System.in);
        boolean gradesHigherThan80 = false;
        int loopCounter = 0;
        Tutee tuteeChosen = s1;
        Tutor tutorChosen = t1;

        do {
            //asks the user to select a tutee and loops through the tuteelist to see if the tutee's name matches
            System.out.println("Which tutee will be selected? (give name): ");
            String tuteeUserChosen = scanner.nextLine();
            
            //goes through the list of tutees and compares them against the users input, if it matches the loop breaks, otherwise it will print a message
            boolean tuteeFound = false;
            for (Tutee t : tuteeList) {
                if (t.getName().equals(tuteeUserChosen)){
                    tuteeChosen = t; 
                    tuteeFound = true;
                    break;
                } else {
                    tuteeFound = false;
                }
            } 
            if (!tuteeFound){
                System.out.printf("No tutee named %s is listed. %n", tuteeUserChosen);
            }

            //asks the user to select a tutor and loops through the tutorlist to see if the tutor's name matches
            System.out.println("Which tutor will be selected? (give name): ");
            String tutorUserChosen = scanner.nextLine();
            
            //goes through the list of tutors and compares them against the users input, if it matches the loop breaks, otherwise it will print a message
            boolean tutorFound = false;
            for (Tutor t : tutorList) {
                if (t.getName().equals(tutorUserChosen)){
                    tutorFound = true;
                    tutorChosen = t;
                    break;
                } else{
                    tutorFound = false;
                }
            }
            if (!tutorFound){
                 System.out.printf("No tutor named %s is listed. %n", tutorUserChosen);
            }

            //checks if both tutee and tutor are valid inputs, if so the tutee consults with the tutor
            if (tuteeFound && tutorFound){
                tuteeChosen.consult(tutorChosen);
                
                // checks all the tutees to see if their grades are higher than 80, and if so sets gradesHigher to true
                for (Tutee t : tuteeList){
                    if (t.getGrade() > 80){
                        gradesHigherThan80 = true;
                    } else{
                        gradesHigherThan80 = false;
                    }
                }
            }

            //after the entire loop is finished, adds one to the loop counter
            loopCounter++;
        } while (gradesHigherThan80 == false || loopCounter < 5); // the loop ends after 5 runs, or if all the tutees have grades higher than 80

        //prints the total number of consultations done 
        System.out.printf("Total number of consultations: %d %n", Tutee.getTotalTutorialSessions());
    }
}
