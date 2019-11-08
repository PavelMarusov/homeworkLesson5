public class MagicDoor {
    Hero h1 = new Hero(250, 50, "Physical");
    Hero h2 = new Hero(250, 50, "Magical");
    Hero h3 = new Hero(250, 50, "Kinetic");

    public Hero[] getHero() {
        Hero[] get = {h1, h2, h3};
        System.out.println(h1.heroHealth + " " + h1.heroDamage + " " + h1.heroAttackType);
        System.out.println(h2.heroHealth + " " + h2.heroDamage + " " + h3.heroAttackType);
        System.out.println(h3.heroHealth + " " + h3.heroDamage + " " + h3.heroAttackType);

        return get;


    }


}
