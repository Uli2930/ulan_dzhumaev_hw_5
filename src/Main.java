public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(250);
        boss.setDamage(50);
        boss.setTypeOfProtection("Щит");

        System.out.println("Health: " + boss.getHealth() +
                " Damage:" + boss.getDamage() +
                " Type of protection: " + boss.getTypeOfProtection());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() +
                    " Damage:" + hero.getDamage() +
                    " Super power: " + hero.getSuperPower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(150, 25, "Мощный удар");
        Hero hero2 = new Hero(135, 10);
        Hero hero3 = new Hero(127, 5, "Болтун");

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}