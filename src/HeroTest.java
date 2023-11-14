class HeroTest {
    public static void main(String[] args) {
        Hero hero = new Hero();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}

class Hero {
    private String name;
    private int hp;

    public Hero(String name, int hp) {
        this.name = name;
        if (hp >= 0 && hp <= 200) {
            this.hp = hp;
        } else if (hp < 0) {
            this.hp = 0;
        } else {
            this.hp = 200;
        }
    }

    public Hero() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}