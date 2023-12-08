import java.util.Scanner;

public class bilang {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        userInput = userInput.trim();
        userInput = userInput.toLowerCase();

        if(userInput.length() > 60){
            System.out.print("Please enter a word shorter than 60 characters");
        }

        //convert to char array to access individual letters
        char[] userInputC = userInput.toCharArray();

        int equivalentLetters = 0;        
        int equivalentWords = 1;

        for(char c : userInputC){
            if(c == 'i' || c == 'e' || c == 'o' || c == 'u'){
                equivalentLetters ++;
            } else {
                equivalentLetters += 0;
            }
        }

        for(int i = 1; i <= equivalentLetters; i++){
            equivalentWords *= 2;
        }
        
        System.out.println(equivalentWords);
    }   
}
