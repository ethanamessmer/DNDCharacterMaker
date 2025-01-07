//package Classes; 

public class BarbarianClass extends ClassGen {

    public BarbarianClass(int level) {
        super(level);
        setupAbilities(level);
    }

    private void setupAbilities(int level) {
        // Level 1
        if (level >= 1) {
            addAbility("Rage");
            addAbility("Unarmored Defense");
        }

        // Level 2
        if (level >= 2) {
            addAbility("Reckless Attack");
            addAbility("Danger Sense");
        }

        // Level 3
        if (level >= 3) {
            addAbility("Primal Path"); // You would need to choose a path and add relevant abilities
        }

        // Level 5
        if (level >= 5) {
            addAbility("Extra Attack");
            addAbility("Fast Movement");
        }

        // Add other levels and abilities as per DND 5e rules
    }

    private void addAbility(String ability) {
        // Implement this method to add the ability to the character
        System.out.println("Added ability: " + ability);
    }
}
