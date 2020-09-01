package Units;

public class Knight implements Warrior{
    private int health = 110;
    private int damage = 10;
    private String squadName;
    private String warriorName;
    private NameList name = new NameList();

    public Knight(String squadName) {
        this.squadName = squadName;
        warriorName = name.getRandomName();
    }

    @Override
    public int attack() {
        return damage;
    }

    @Override
    public void takeDamage(int damage) {
        this.health -= damage;
    }

    @Override
    public boolean isAlive() {
        if (this.health <= 0)
            return false;
        else return true;
    }

    @Override
    public void setSquadName(String name) {
        squadName = name;
    }

    @Override
    public String toString() {      //Переопределить метод toString() класса Object для бойца, чтобы он выводил его
        // имя, класс и принадлежность к отряду.
        return ("Рыцарь " + warriorName + "из отряда " + squadName + ".");
    }


    @Override                       //Переопределить метод clone(), создающий копию бойца.
    public Object clone() {
        return null;
    }
}
