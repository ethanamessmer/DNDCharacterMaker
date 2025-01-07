
//import java.lang.Package.Classes;


public class characterClass {
    private String className;
    
    //Chooses
    public characterClass(String className, int level, boolean multiclass){
        this.className = className;
        switch (this.className) {
            case "Barbarian" -> {
                BarbarianClass barb = new BarbarianClass(level);
                System.out.println("Good choice! Barbarians are mighty warriors who are powered by primal forces of the multiverse that manifest as a Rage.");
            }
        }
        switch (this.className) {
            case "Bard" -> {
                BardClass bard = new BardClass(level);
                System.out.println("Good choice! Bards are expert at inspiring others, soothing hurts, disheartening foes, and creating illusions.");
            }
        }
        switch (this.className) {
            case "Cleric" -> {
                ClericClass cleric = new ClericClass(level);
                System.out.println("Good choice! Clerics can reach out to the divine magic of the Outer Planes and channel it to bolster people and battle foes.");
            }
        }
        switch (this.className) {
            case "Druid" -> {
                DruidClass cleric = new DruidClass(level);
                System.out.println("Good choice! Druids call on the forces of nature, harnessing magic to heal, transform into animals, and wield elemental destruction.");
            }
        }
        switch (this.className) {
            case "Fighter" -> {
                FighterClass fighter = new FighterClass(level);
                System.out.println("Good choice! Fighters all share an unparalleled prowess with weapons and armor, and are well acquainted with death, both meting it out and defying it.");
            }
        }
        switch (this.className) {
            case "Monk" -> {
                MonkClass monk = new MonkClass(level);
                System.out.println("Good choice! Monks focus their internal reservoirs of power to create extraordinary, even supernatural, effects.");
            }
        }
        switch (this.className) {
            case "Paladin" -> {
                PaladinClass paladin = new PaladinClass(level);
                System.out.println("Good choice! Paladins live on the front lines of the cosmic struggle, united by their oaths against the forces of annihilation.");
            }
        }
        switch (this.className) {
            case "Ranger" -> {
                RangerClass ranger = new RangerClass(level);
                System.out.println("Good choice! Rangers are honed with deadly focus and harness primal powers to protect the world from the ravages of monsters and tyrants.");
            }
        }
        switch (this.className) {
            case "Rogue" -> {
                RogueClass rogue = new RogueClass(level);
                System.out.println("Good choice! Rogues have a knack for finding the solution to just about any problem, prioritizing subtle strikes over brute strength.");
            }
        }
        switch (this.className) {
            case "Sorcerer" -> {
                SorcererClass sorcerer = new SorcererClass(level);
                System.out.println("Good choice! Sorcerers harness and channel the raw, roiling power of innate magic that is stamped into their very being.");
            }
        }
        switch (this.className) {
            case "Warlock" -> {
                WarlockClass warlock = new WarlockClass(level);
                System.out.println("Good choice! Warlocks quest for knowledge that lies hidden in the fabric of the multiverse, piecing together arcane secrets to bolster their own power.");
            }
        }
        switch (this.className) {
            case "Wizard" -> {
                WizardClass wizard = new WizardClass(level);
                System.out.println("Good choice! Wizards cast spells of explosive fire, arcing lightning, subtle deception, and spectacular transformations.");
            }
        }

    }


}