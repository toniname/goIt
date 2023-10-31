

/*Допиши метод setName() так, щоб:
якщо передати порожній рядок (включаючи рядок з одних пробілів та символів, що не читаються), то полю name не буде присвоєно цей порожній рядок;
якщо передати рядок завдовжки більше 100 символів, то полю name аналогічно не буде присвоєно цей занадто довгий рядок.*/
public class SpaceShip {
    private String name;
    private String serialNumber;

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        String sN = "SN";

        if (serialNumber.toUpperCase().contains(sN) && serialNumber.length() == 8){
            this.serialNumber = serialNumber;
        }
    }
    public void setName(String name) {
        if (name.isBlank()) {
            return;
        }
        if (name.length() > 100) {
            return;
        }
        this.name = name;
    }

    public void printInfo(){
        System.out.println("Name is" + getName() +", serial number is " + getSerialNumber());
    }

    //Test output
    public static void main(String[] args) {
        SpaceShip ship = new SpaceShip();
        ship.setName("Walker");
        System.out.println(ship.getName()); //Should be Walker

        ship.setName("");
        System.out.println(ship.getName()); //Should be Walker, empty value ignored

        ship.setName("Voyager ".repeat(100));
        System.out.println(ship.getName()); //Should be Walker, too long value ignored
    }
}