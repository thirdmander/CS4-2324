public class App {
    public static void main(String[] args) throws Exception {
        String nameOne = "Emmanuel Arizabal";
        String nameTwo = "Abram Sillano";
        String nameThree = "Dave Laforteza";
        
        int numOfMsgsOne =  120;
        int numOfMsgsTwo =  32;
        int numOfMsgsThree = 65;

        boolean hasJowaOne = true;
        boolean hasJowaTwo = false;
        boolean hasJowaThree = false;

        int combinedMsgs = numOfMsgsOne + numOfMsgsTwo + numOfMsgsThree;
        boolean moreMsgs = numOfMsgsThree > numOfMsgsOne;
        boolean relationshipStatus = hasJowaOne && hasJowaTwo && hasJowaThree;

        System.out.println("Roommate 1" + "\n" + "Name: " + nameOne);
        System.out.println("Number of 'Miss ko na siya' Messages: " + numOfMsgsOne);
        System.out.println("Has a Significant Other: " + hasJowaOne + "\n");

        System.out.println("Roommate 2" + "\n" + "Name: " + nameTwo);
        System.out.println("Number of 'Miss ko na siya' Messages: " + numOfMsgsTwo);
        System.out.println("Has a Significant Other: " + hasJowaTwo + "\n");

        System.out.println("Roommate 3" + "\n" + "Name: " + nameThree);
        System.out.println("Number of 'Miss ko na siya' Messages: " + numOfMsgsThree);
        System.out.println("Has a Significant Other: " + hasJowaThree + "\n");

        System.out.println("The combined number of 'Miss ko na siya' messages for all three: " + combinedMsgs); //operation: sum
        System.out.println("Does Dave have more 'Miss ko na siya' messages than Emman?: " + moreMsgs); // operation: comparison
        System.out.println("Do all three roommates have a significant other?: " + relationshipStatus); // operation: logical
    }
}
