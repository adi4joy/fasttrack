package ro.fasttrackit.curs7;

public class Main {
    public static void main(String[] args) {
        Lamp myLamp = new Lamp();
        System.out.println(myLamp.isLightOn());
        myLamp.turnOn();
        System.out.println(myLamp.isLightOn());

        Therm thermostat = new Therm(22);
//        System.out.println(thermostat.getCrtTemp());
//        System.out.println(thermostat.getTargetTemp());
//        System.out.println(thermostat.isHeatOn());
        System.out.println(thermostat);

        thermostat.setTargetTemp(27);
//        System.out.println(thermostat.getCrtTemp());
//        System.out.println(thermostat.getTargetTemp());
//        System.out.println(thermostat.isHeatOn());
        System.out.println(thermostat);

        Therm therm2 = new Therm(30);
        System.out.println(therm2);
        therm2.setTargetTemp(10);
        System.out.println(therm2);
        System.out.println(thermostat);

        Door myDoor = new Door();
        System.out.println(myDoor.isClosed());
    }
}
