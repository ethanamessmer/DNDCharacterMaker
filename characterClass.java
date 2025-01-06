
//import java.lang.Package.Classes;


public class characterClass {
    private String className;
    
    
    public characterClass(String className, int level, boolean multiclass){
        this.className = className;
        switch (this.className) {
            case "Barbarian" -> {
                BarbarianClass barb = new BarbarianClass(level);
                System.out.println("Good choice! Barbarians are mighty warriors who are powered by primal forces of the multiverse that manifest as a Rage.");
            }
        }

    }


}