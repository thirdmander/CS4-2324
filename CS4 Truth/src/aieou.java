import java.util.Scanner;

public class aieou {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userInput = scan.nextLine();
        userInput = userInput.trim();
        userInput = userInput.toLowerCase();

        //split the user input into two words using a string array
        String[] words = userInput.split(" ");
        String firstWord = words[0];
        String secondWord = words[1];

        //convert to char array to access individual letters
        char[] firstWordC = firstWord.toCharArray();
        char[] secondWordC = secondWord.toCharArray();

        //counts if a pair of corresponding characters aren't equivalent
        int notEquivalentLetters = 0;
        boolean equivalent = false;

        //check if the two words have the same length
        if (firstWord.length() == secondWord.length()) {
            //iterate through each letter in the first word and compare to equivalent letter in the second word
            for (int i = 0; i < firstWord.length(); i++) {
                //if the letters are not the same, check first to see if its an i, e, o, or u
                if (firstWordC[i] != (secondWordC[i])) {
                    //if the letter is an i or e, check if the corresponding letter is also an i or e, if so don't add to total not equivalent letters
                    if (firstWordC[i] == 'i' || firstWordC[i] == 'e'){
                        if(secondWordC[i] == 'i' || secondWordC[i] == 'e'){
                            notEquivalentLetters += 0;
                        } else{
                            notEquivalentLetters++;
                        }

                    //if the letter is an o or u, check if the corresponding letter is also an o or u, if so don't add to total not equivalent letters
                    } else if (firstWordC[i] == 'o' || firstWordC[i] == 'u'){
                        if(secondWordC[i] == 'o' || secondWordC[i] == 'u'){
                            notEquivalentLetters += 0;
                        } else{
                            notEquivalentLetters++;
                        }
                    } else {
                        notEquivalentLetters++;
                    }
                }  else {
                    notEquivalentLetters += 0;
                }
            }
        } else {
            notEquivalentLetters++;
        }

        //if there is at least one pair of not equivalent letters, the words are not equivalent
        if (notEquivalentLetters > 0) {
            equivalent = false;
        } else {
            equivalent = true;
        }

        
        //prints yis or nuu
        if(equivalent){
            System.out.print("yis");
        } else {
            System.out.print("nuu");
        }
    }   
}
