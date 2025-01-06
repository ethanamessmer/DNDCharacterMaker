
import java.util.Arrays;




public class characterRace {
    private final String race;
    private final int[] mods = new int[6];
    private int moveSpeed;

    public characterRace(String race) {
        this.race = race;
        setRace();
        System.out.println("Your race is " + this.race + ", and your stat modifiers are " + Arrays.toString(this.mods));
    }


    private void setRace() {
        switch (this.race) {
            case "Human" -> {
                setMods(1, 1, 1, 1, 1, 1);
                this.moveSpeed = 30;
            }
            case "Elf" -> {
                setMods(0, 2, 0, 1, 0, 0);
                this.moveSpeed = 30;
            }
            case "Dwarf" -> {
                setMods(0, 0, 2, 0, 1, 0);
                this.moveSpeed = 20;
            }
            case "Tiefling" -> {
                setMods(0, 0, 0, 1, 0, 2);
                this.moveSpeed = 30;
            }
            case "Halfling" -> {
                setMods(0, 2, 0, 0, 0, 1);
                this.moveSpeed = 20;
            }
            case "Dragonborn" -> {
                setMods(2, 0, 0, 0, 0, 1);
                this.moveSpeed = 30;
            }
            case "Gnome" -> {
                setMods(0, 1, 0, 2, 0, 0);
                this.moveSpeed = 20;
            }
            case "Half-Orc" -> {
                setMods(2, 0, 1, 0, 0, 0);
                this.moveSpeed = 30;
            }
        }
    }

    public void setMods(int str, int dex, int con, int intel, int wis, int cha) {
        this.mods[0] = str;
        this.mods[1] = dex;
        this.mods[2] = con;
        this.mods[3] = intel;
        this.mods[4] = wis;
        this.mods[5] = cha;
    }

    public int[] getMods(){
        return this.mods;
    }

    
}