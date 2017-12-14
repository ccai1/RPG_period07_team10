public abstract class Protagonist extends Character {

    protected String name;
    protected String role;

    public Protagonist() {
	hp = 125;
	strength = (int)(Math.random() * 45 + 20);
	defense = 40;
	attackrating = 0.4;
    }

    public Protagonist(String nameIn) {
	this();
	name = nameIn;
    }

    public Protagonist(String nameIn, int hpIn, int strIn, int defIn, int attackIn) {
	name = nameIn;
	hp = hpIn;
	strength = strIn;
	defense = defIn;
	attackrating = attackIn;
    }

    public String getName() {
	return name;
    }

    public void specialize() {
	defense -= 3;
	attackrating += 3;
    }

    public void normalize() {
	defense = 40;
	attackrating = 0.4; 
    }

    public abstract String toString();

	/* Error: Protagonist is not abstract and does not 
	   override abstract method toString() in Protagonist.
	*/

	/*
	return
	    "Name: " + name + System.lineSeparator() +
	    "hp: " + hp + System.lineSeparator() +
	    "strength: " + strength + System.lineSeparator() +
	    "defense: " + defense + System.lineSeparator() +
	    "attack: " + attackrating;						 
	*/
                public String stats() {
        return name + System.lineSeparator() 
               + role + System.lineSeparator()
               + hp + System.lineSeparator()
               + strength;
    }
    
}
