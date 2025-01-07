import java.util.Scanner;
//import C:\Users\EMessy\OneDrive\Desktop\Github\DND\DNDCharacterMaker\Classes;
enum Stats { STR, DEX, CON, INT, WIS, CHA };

class charMaker {
    public static void main(String[] args) {
        System.out.println("Hello there! Welcome to version 1.0 of the basic DND character creator!");
        System.out.println("Made by Ethan Messmer");

        //CharName
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter character name or RANDOM for random generation of character(Will be available in version 1.1):");
        String charName = scnr.nextLine();
        System.out.println("Welcome " + charName);

        //CharClass (Right now cannot multiclass but may add later.)
        System.out.println("Choose your class (Start with capital letter)");
        String charClassName = scnr.nextLine();
        System.out.println("How many " + charClassName + "are you? (1-20)");
        int classOneLevel = scnr.nextInt();
        System.out.println("Making class specific stats. . .");
        characterClass charClass = new characterClass(charClassName, classOneLevel, false);
        
        

        //CharRace
        System.out.println("Please select your race");
        System.out.println("The options are Human, Elf, Dwarf, Tiefling, Halfling, Dragonborn, Gnome, or Half-Orc");
        characterRace charRace = new characterRace(scnr.nextLine());


        //Stats
        System.out.println("Rolling stats. . . ");  


    }


    

}