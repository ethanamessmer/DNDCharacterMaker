


public class characterRace {
    private final String race;
    private final int[] mods = new int[6];
    private int moveSpeed;

    public characterRace(String race) {
        this.race = race;
    }


    public void setRace() {
        switch (race) {
            case "Human", "human" -> {
                setMods(1, 1, 1, 1, 1, 1);
                this.moveSpeed = 30;
            }
            case "Elf", "elf" -> {
                setMods(0, 2, 0, 1, 0, 0);
                this.moveSpeed = 30;
            }
            case "Dwarf", "dwarf" -> {
                setMods(0, 0, 2, 0, 1, 0);
                this.moveSpeed = 20;
            }
            case "Tiefling", "tiefling" -> {
                setMods(0, 0, 0, 1, 0, 2);
                this.moveSpeed = 30;
            }
            case "Halfling", "halfling" -> {
                setMods(0, 2, 0, 0, 0, 1);
                this.moveSpeed = 20;
            }
            case "Dragonborn", "dragonborn" -> {
                setMods(2, 0, 0, 0, 0, 1);
                this.moveSpeed = 30;
            }
            case "Gnome", "gnome" -> {
                setMods(0, 1, 0, 2, 0, 0);
                this.moveSpeed = 20;
            }
            case "Half-Orc", "half-orc" -> {
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