public class Bedroom {

    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private Lamp lamp;

    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public void makeBed() {
        System.out.println("Bedroom -> Making bed...");
        bed.make();
    }

    @Override
    public String toString() {
        return String.format(
                "Bedroom [Name: %s, %s, %s, %s, %s, %s, %s, %s]",
                name, wall1, wall2, wall3, wall4, ceiling, bed, lamp
        );
    }

    public static void main(String[] args) {

        // ✅ Creating walls
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("West");

        // ✅ Creating ceiling
        Ceiling ceiling = new Ceiling(12, 1);

        // ✅ Creating bed
        Bed bed = new Bed("Modern", 4, 20, 2, 1);

        // ✅ Creating lamp
        Lamp lamp = new Lamp("Classic", true, 75);

        // ✅ Creating bedroom
        Bedroom bedroom = new Bedroom("Master Bedroom", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        // ✅ Display bedroom details
        System.out.println("\n== Bedroom Details ==");
        System.out.println(bedroom);

        // ✅ Making the bed
        System.out.println("\n== Making the Bed ==");
        bedroom.makeBed();

        // ✅ Turning on the lamp
        System.out.println("\n== Turning on the Lamp ==");
        bedroom.getLamp().turnOn();
    }
}
