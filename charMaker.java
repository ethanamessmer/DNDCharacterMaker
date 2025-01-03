import java.util.Scanner;

class charMaker {
    public static void main(String[] args) {
        System.out.println("Hello there! Welcome to the very basic DND character creator!");
        System.out.println("Made by Ethan Messmer");

        //CharName
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter character name:");
        String charName = scnr.nextLine();
        System.out.println("Welcome " + charName);

        //CharClass
        System.out.println("Choose your class (Start with capital letter)");
        String charClass = scnr.nextLine();
        System.out.println("How many " + charClass + "are you? (1-20)");
        int classOneLevel = scnr.nextInt();
        
    }


    

}