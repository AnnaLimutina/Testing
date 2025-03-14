package kata;

public class Kata {
    public static String position(char alphabet)
    {
        return "Position of alphabet: " + (int)alphabet;
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        Fighter first = fighter1, second = fighter2;
        if (firstAttacker.equals(fighter2.name)) {
            first = fighter2;
            second = fighter1;
        }

        do {
            second.health -= first.damagePerAttack;
            if (second.health > 0) {
                System.out.printf("%s attacs %s; %s now has %d health.%n", first.name, second.name, second.name, second.health);
            } else {
                System.out.printf("%s attacks %s: %s now has %d health and is dead. %s wins.%n", first.name, second.name, second.name, second.health, first.name);
            }
            first.health -= second.damagePerAttack;
            if (first.health > 0) {
                System.out.printf("%s attacs %s; %s now has %d health.%n", second.name, first.name, first.name, first.health);
            } else {
                System.out.printf("%s attacks %s: %s now has %d health and is dead. %s wins.%n", second.name, first.name, first.name, first.health, second.name);
            }
        } while (first.health > 0 && second.health > 0);
return "";
    }
}
