public class Lamp {

    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style, boolean battery, int globRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = Math.max(0, globRating);  // Validation
    }

    public void turnOn() {
        System.out.println("Lamp -> Turning on.");
    }

    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobRating() {
        return globRating;
    }

    @Override
    public String toString() {
        return String.format(
                "Lamp [Style: %s, Battery: %b, Glob Rating: %d]",
                style, battery, globRating
        );
    }
}
