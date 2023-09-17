class interf{
    public static void main(String[] args){
        Player p = new Player();
        p.attack();
        p.defend();
        p.castSpell("Fire ball");
        p.useWeapon();
    }
}

interface Charactor{
    void attack();
    void defend();
}

interface Mage{
    void castSpell(String Spell);
}

interface Warrior{
    void useWeapon();
}

class Player implements Charactor , Mage , Warrior{
    
    Player(){

    }   

    public void attack(){
        System.out.println("The player attacks the enemy.");
    }

    public void defend(){
        System.out.println("The player defends against the enemy's attack.");
    }

    public void castSpell(String Spell){
        System.out.println("The player casts " + Spell );
    }

    public void useWeapon(){
        System.out.println("The player use a weapon to attack.");
    }
}  
