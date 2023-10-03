abstract class SpaceObject {

}

abstract class Planet extends SpaceObject {

}

class Mars extends Planet {

}

class Moon extends SpaceObject {

}

class PlanetTester {
    String test(SpaceObject object) {

        if (object instanceof Mars) {
            return "planet";
        } else {
            return "not planet";
        }

    }
}
