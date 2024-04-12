/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package virtualpet;
import java.util.*;
/**
 *
 * @author michael.roy-diclemen
 */
public class VirtualPet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Part 1: Getting Started with Java and Basic I/O ------------------------------------------------------------
        //Initializing things
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        
        //Splash screen ASCII art
        System.out.println("        __\n   (___()'`;\n   /,    /`\n   \\\\\"--\\\\");
        System.out.println("\nJayden Petopia");
        
        //Part 3 - Login ---------------------------------------------------------------------------------------------
        final String USERNAME = "snoopy";
        final String PASSWORD = "toto";
        /*
        //Getting user input
        System.out.print("\nEnter your username: ");
        String username = keyboard.nextLine();
        System.out.print("Enter your password: ");
        String password = keyboard.nextLine();
        
        //Determing if the inputted information is correct
        //OLD CODE
        
        if (username.equals(USERNAME)){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong username, exiting program");
            System.exit(0);
        }
        if (password.equals(PASSWORD)){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Wrong password, exiting program");
            System.exit(0);
        }
        */
        //NEW CODE - Part 5A --------------------------------------------------
        for (int i = 0;i<3;i++){
            //Getting user input
            System.out.print("\nEnter your username: ");
            String username = keyboard.nextLine();
            System.out.print("Enter your password: ");
            String password = keyboard.nextLine();
            
            //Determines if the user input is correct
            if (username.equals(USERNAME)){
                System.out.println("Correct!");
                i=3;
            }
            else{
                System.out.println("Wrong password, "+(2-i)+" tries left.");
            }
            if (i==2){
                System.out.println("Exiting program...");
                System.exit(0);
            }
        }
        
        //Part 2 - Decision Structures -------------------------------------------------------------------------
        System.out.println("\n1. Start\n2. Instructions\n3. Exit");
        System.out.print("\nChoose an option: ");
        String option = keyboard.nextLine();
        boolean optionPicked = false;
        
        //Reading the input of the user on the starting screen
        //OLD CODE
        /*
        switch(option){
            //If user chose the instructions option
            case "2":
            case "Instructions":
                System.out.println("Instructions have not been made, the program will now start.\n");
                break;
            //If user chose the exit option
            case "3":
            case "Exit":
                System.out.println("All right then!");
                System.exit(0);
            //If user chose the start option
            case "1":
            case "Start":
                System.out.println("Starting the program...\n");
            //If user cannot read
            default: System.out.print("Only people cursed with literacy are allowed to use this program."); System.exit(0);
        }
        */
        //NEW CODE - Part 5A ----------------------------------------------------------------
        while (optionPicked==false){
            switch(option){
                //If user chose the instructions option
                case "2":
                case "Instructions":
                    System.out.println("Instructions have not been made, the program will now start.\n");
                    optionPicked = true; break;
                //If user chose the exit option
                case "3":
                case "Exit":
                    System.out.println("All right then!");
                    System.exit(0);
                //If user chose the start option
                case "1":
                case "Start":
                    System.out.println("Starting the program...\n");
                    optionPicked = true; break;
                //If user cannot read
                default: System.out.print("Please enter a valid input,"); break;
            }
        }
        
        //Displaying the 3 possible pets
        System.out.println("        __\n   (___()'`;\n   /,    /`\n   \\\\\"--\\\\");
        System.out.println("    __\n___( o)>\n\\ <_  )\n `---'");
        System.out.println("               __\n    .,-;-;-,. /'_\\\n  _/_/_/_|_\\_\\) /\n'-<_><_><_><_>=/\\\n  `/_/====/_/-'\\_\\\n   \"\"     \"\"    \"\"");
        
        //Starting the program, have the user choose which pet
        System.out.println("1. Dog\n2. Duck\n3. Turtle");
        String petChosen = "N";
        
        //Only moves forward if user is satisfied with their pet
        while (petChosen.equals("N")){
            System.out.print("\nChoose a pet: ");
            String chosenPet = keyboard.nextLine();
            System.out.println("Are you sure you want to pick the "+chosenPet+"? (Y/N) ");
            petChosen = keyboard.nextLine();
            
            //If user does not put in proper input
            if (!(petChosen.equals("N")||petChosen.equals("Y"))){
                System.out.println("Please input either Y or N.");
                petChosen = "N";
            }
        }
        
        //Part 4 - Generating pet names -------------------------------------------------------------------------------------------
        //Giving the player the option to generate their own or a random name
        System.out.println("\n1. Enter your own pet name\n2. Generate a random pet name");
        System.out.print("\nChoose an option: ");
        int nameDecision = keyboard.nextInt();
        
        //Eats the enter input
        keyboard.nextLine();
        
        //Randomizing name length
        int nameLength = rand.nextInt(6)+4;
        
        //Intializing variables
        String petName = "";
        char randomCharacter = 'a';
        String randomLetter = "";
        boolean vowel = false;
        int randomNumber = 0;
        
        //User gets to input their own name
        if (nameDecision==1){
            System.out.print("Enter pet name: ");
            petName = keyboard.nextLine();
        }
        //Generates random name
        else if (nameDecision==2){
            
            //Generates capital letter
            randomCharacter = (char) (65+rand.nextInt(26));
            switch (randomCharacter){
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    vowel = true; break;
            }
            randomLetter = ""+randomCharacter;
            petName = petName+randomLetter;
            
            //Generates the rest of the letters, depending on if the previous letter was a vowel
            for(int i = 1;i<nameLength;i++){
                if (vowel==true){
                    while(vowel==true){
                        randomCharacter = (char) ('a'+rand.nextInt(26));
                        switch (randomCharacter){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                vowel = true;break;
                            default: vowel = false; break;
                        }
                    }
                }
                else{
                    while(vowel==false){
                        randomCharacter = (char) ('a'+rand.nextInt(26));
                        switch (randomCharacter){
                            case 'a':
                            case 'e':
                            case 'i':
                            case 'o':
                            case 'u':
                                vowel = true;break;
                            default: vowel = false; break;
                        }
                    }
                }
                randomLetter = ""+randomCharacter;
                
                //Determining if the next letter is the same as the last
                randomNumber = rand.nextInt(10);
                //Includes the i not being equal to 1 so that there are not 2 capital letters
                if ((randomNumber==0)&&(i!=1)){
                    randomLetter = petName.substring(i);
                }
                
                petName = petName+randomLetter;
            }
        }
        //If user cannot read
        else{
            System.out.println("Invalid input, exiting program.");
            System.exit(0);
        }
        System.out.println("Your pet, named "+petName+", has been born!");
        
        //Generating random stats for our pet
        final int MAXSTAT = 15;
        final int MINSTAT = 5;
        int health = MINSTAT + (rand.nextInt(MAXSTAT-MINSTAT));
        int food = MINSTAT + (rand.nextInt(MAXSTAT-MINSTAT));
        int energy = MINSTAT + (rand.nextInt(MAXSTAT-MINSTAT));
        
        //Displaying the stats
        System.out.println("\nHealth: "+health);
        System.out.println("Food: "+food);
        System.out.println("Energy: "+energy);
        
        //Part 5B (Minigames) -----------------------------------------------------------------------------------------------
        
        //Choosing a game
        boolean hasGameBeenChosen = false;
        System.out.println("\n1. Hangman\n2. Matching Game");
        System.out.print("\nChoose a minigame to play (1/2): ");
        
        //Intializing variables for this section
        int gameChosen = 0;
        int wallet = 0;
        
        while(hasGameBeenChosen==false){
            gameChosen = keyboard.nextInt();
            if (gameChosen==1||gameChosen==2){
                hasGameBeenChosen = true;
            }
            else{
                System.out.println("Please input either 1 or 2 to choose a game.");
            }
        }
        //First game - Hangman 
        if (gameChosen ==1){
            
            //Because we haven't learned arrays, it's very bulky to hold multiple words.  I'll just have this one word as the "word of the day"
            String wordOfTheDay = "retaliate";
            boolean wordGuessed = false;
            int mistakesLeft = 6;
            String guess = "";
            String userGuesses = "";
            
            //Determinin the length of the word of the day, making it so that it has that many blanks
            String discoveredLetters = "";
            for (int i=1; i<wordOfTheDay.length();i++){
                discoveredLetters = discoveredLetters + "_";
            }
            
            //Starts the game loop
            while (wordGuessed==false){
                System.out.print("Guess a letter or try to guess the entire word: ");
                guess = keyboard.next();
                //If user guessed a letter
                if (guess.length()==1){
                    //Making sure that the user did not guess the same word twice
                    for (int j = 0;)
                        for (int i=0;i<wordOfTheDay.length()-1;i++){
                            //Replacing the blanks on the discovered word with the actual letters
                            if(guess.equals(wordOfTheDay.substring(i,i+1))){
                                //Covering cases
                                if (i==0){
                                    discoveredLetters = guess+discoveredLetters.substring(1);
                                }
                                else if (i==wordOfTheDay.length()-1){
                                    discoveredLetters = discoveredLetters.substring(0,i)+guess;
                                }
                            }
                        }
                }
                
            }
        }
        
        
        
        
        
        keyboard.close();
    }  
}
