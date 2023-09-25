
import java.util.*;

public class SaveStarShip {
    public int calculateDistance(int distance) {
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }

    public String[] getPlanets(String galaxy) {
        if (Objects.equals(galaxy, "DangerBanger")) {
            return new String[]{"Fobius", "Demius"};
        } else if (Objects.equals(galaxy, "Milkyway")) {
            return new String[]{"Earth", "Mars", "Jupiter"};
        } else if (Objects.equals(galaxy, "Miaru")) {
            return new String[]{"Maux", "Reux", "Piax"};
        } else {
            return new String[]{};
        }

    }

    public String choosePlanet(long distanceToEarth) {
        if (distanceToEarth < 45677) {
            return "Earth";
        } else {
            return "Pern";
        }
    }

    public int calculateFuelPrice(String fuel, int count) {
        if (fuel.equals("STAR100")) {
            return 70 * count;
        } else if (fuel.equals("STAR500")) {
            return 120 * count;
        } else if (fuel.equals("STAR1000")) {
            return 200 * count;
        } else {
            return 50 * count;
        }
    }

    public int roundSpeed(int speed) {
        int remainder = speed % 10;
        if (remainder < 5) {
            return speed - remainder;
        } else {
            return speed + (10 - remainder);
        }
    }

    public int calculateNeededFuel(int distance) {
        if (distance <= 20) {
            return 1000;
        } else {
            return 1000 + ((distance - 20) * 5);
        }
    }

    public void calculateMaxPower() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter power of engine 1: ");
        float power1 = scanner.nextFloat();

        System.out.print("Enter power of engine 2: ");
        float power2 = scanner.nextFloat();

        System.out.print("Enter power of engine 3: ");
        float power3 = scanner.nextFloat();

        scanner.close();

        float maxPower = Math.max(power1, Math.max(power2, power3));

        float coefficient;
        if (maxPower < 10) {
            coefficient = 0.7f;
        } else if (maxPower <= 100) {
            coefficient = 1.2f;
        } else {
            coefficient = 2.1f;
        }

        float result = maxPower * coefficient;

        System.out.println("Max power: " + result);

    }

    public String getMyPrizes(int ticket) {
        String prizes = "";
        if (ticket % 10 == 0) {
            prizes += "crystall";
        }
        if (ticket % 10 == 7) {
            prizes += "chip";
        }
        if (ticket > 200) {
            prizes += "coin";
        }


        return prizes.trim();
    }

    public boolean isHangarOk(int side1, int side2, int price) {

        int area = side1 * side2;
        int maxSide = Math.max(side1, side2);
        int minSide = Math.min(side1, side2);
        int maxPricePerSquareMeter = 1000;

        return area >= 1500 && maxSide <= 2 * minSide && price <= maxPricePerSquareMeter * area;
    }



    //Test output
    public static void main(String[] args) {
        SaveStarShip ship = new SaveStarShip();

        //Should be 10
        System.out.println(ship.calculateDistance(-10));

        //Should be [Fobius, Demius]
        System.out.println(Arrays.toString(ship.getPlanets("DangerBanger")));

        ship.calculateMaxPower();
        System.out.println(ship.isHangarOk(30, 60 , 300000));
    }
}