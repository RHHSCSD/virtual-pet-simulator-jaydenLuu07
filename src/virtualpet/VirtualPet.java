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
            System.out.print("Are you sure you want to pick the "+chosenPet+"? (Y/N) ");
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
            randomCharacter = (char) ('A'+rand.nextInt(26));
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
            for(int i = 1;i<=nameLength;i++){
                //Determining if the next letter is the same as the last
                randomNumber = rand.nextInt(10);
                //Includes the i not being equal to 1 so that there are not 2 capital letters
                if ((randomNumber==0)&&(i!=1)){
                    randomLetter = petName.substring(i);
                }
                else if (vowel==true){
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
            
            //Because we haven't learned arrays or files, it's very bulky to hold multiple words.  I'll just have this one word as the "word of the day"
            String wordOfTheDay = "retaliate";
            
            //Initializing variables for this section
            boolean wordGuessed = false;
            String guess = "";
            String userGuesses = " ";
            boolean repeatedGuess = false;
            boolean correctGuess = false;
            
            //Number of guesses
            int mistakesLeft = 6;
            
            //Determinin the length of the word of the day, making it so that it has that many blanks
            String discoveredLetters = "";
            for (int i=1; i<=wordOfTheDay.length();i++){
                discoveredLetters = discoveredLetters + "_";
            }
            
            //Introduces the game
            System.out.println("Welcome to hangman!  The goal of the game is to guess the mystery word with as few mistakes as possible.");
            
            //Starts the game loop
            while (wordGuessed==false){
                System.out.print("\nGuess a letter or try to guess the entire word: ");
                guess = keyboard.next();
                //Resets boolean variables
                repeatedGuess=false;
                correctGuess = false;
                
                //If user guessed a letter
                if (guess.length()==1){
                    //Making sure that the user did not guess the same letter twice
                    for (int j = 0;j<userGuesses.length();j++){
                        if (guess.equals(userGuesses.substring(j,j+1))){ 
                            repeatedGuess = true;
                        }
                    }
                    if (repeatedGuess==false){
                        //Adds user's guess 
                        userGuesses = userGuesses+guess;
                        
                        for (int i=0;i<wordOfTheDay.length();i++){
                            //Replacing the blanks on the discovered word with the actual letters
                            if(guess.equals(wordOfTheDay.substring(i,i+1))){
                                //Covering cases
                                if (i==0){
                                    discoveredLetters = guess+discoveredLetters.substring(1);
                                }
                                else if (i==(wordOfTheDay.length()-1)){
                                    discoveredLetters = discoveredLetters.substring(0,i)+guess;
                                }
                                else{
                                    discoveredLetters = discoveredLetters.substring(0,i)+guess+discoveredLetters.substring(i+1,wordOfTheDay.length());
                                }
                                correctGuess = true;
                            }   
                        }
                        //What happens if the user does not guess a letter in the word
                        if (correctGuess==false){
                            System.out.println("That letter is not in the word.");
                            mistakesLeft--;
                            System.out.println("Mistakes left: "+mistakesLeft);
                        }
                        //Prints out what the user has guessed so far
                        System.out.println(discoveredLetters);
                    }
                    //Prints out repeated guess message
                    else{
                        System.out.println("You've already guessed that letter.");
                    }
                    //Keeps track and prints out user guesses
                    System.out.println("Your guesse(s) are"+userGuesses);
                }
                //What happens if the user tries the guess the entire word
                else{
                    if (guess.equals(wordOfTheDay)){
                        System.out.println("Correct!  The word was "+wordOfTheDay);
                        wordGuessed = true;
                    }
                    else{
                        System.out.println("Sorry, the word is not "+guess);
                        mistakesLeft--;
                        System.out.println("Mistakes left: "+mistakesLeft);
                    }
                }
                //If user has ran out of mistakes
                if (mistakesLeft==0){
                    System.out.println("You have ran out of mistakes.  The word was "+wordOfTheDay);
                    wordGuessed = true;
                }
                
            }
            //Giving the user their prize money
            wallet = wallet+(mistakesLeft*3);
            
        }
        //Second Game chosen - Number Guessing Game (I gave up making the matching game, besides I think that hangman is similar enough in complexity and I'm tired and I have 3 tests to study and I'm rambling for too long)
        else if(gameChosen==2){
            //Generating the mystery number
            int mysteryNumber = rand.nextInt(100)+1;
            
            //Initializing variables
            boolean numberGuessed = false;
            int guess = 0;
            int totalGuesses = 0;
            
            //Explaing the game
            System.out.println("Welcome to the number guessing game!  Choose a number between 1 - 100 and I will tell you whether your guess is higher or lower than the mystery number!");
            
            //Gameplay loop
            while(numberGuessed == false){
                System.out.print("\nChoose a number: ");
                guess = keyboard.nextInt();
                
                //If user guesses the number
                if (guess==mysteryNumber){
                    numberGuessed=true;
                    System.out.println("Congratulations!  The number was indeed "+mysteryNumber);
                }
                //If the user guesses higher
                else if(guess>mysteryNumber){
                    System.out.println("Your guess is higher than the mystery number");
                    totalGuesses++;
                }
                //If the user guesses lower
                else if(guess<mysteryNumber){
                    System.out.println("Your guess is lower than the mystery number");
                    totalGuesses++;
                }
                //Tells the user how many guesses they have
                System.out.println("Your total guesses amount to "+totalGuesses);
            }
            //Giving the user their prize money
            if(totalGuesses<=15){
                wallet = wallet+15-totalGuesses;
            }
        }
        
        keyboard.close();
    }  
}
