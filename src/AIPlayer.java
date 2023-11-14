class AIPlayer {
    private int hp;
    public void setHp(int hp) {
            if (hp > 100 || hp < 0){
                throw new IllegalArgumentException("Invalid value");
        } this.hp = hp;
    }
}
class AIPlayerTest {
    public static void main(String[] args) {
        AIPlayer player = new AIPlayer();

        //Ok value
        try {
            player.setHp(50);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }

        //Invalid value
        try {
            player.setHp(-1);
            System.out.println("Ok value");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid value");
        }
    }
}