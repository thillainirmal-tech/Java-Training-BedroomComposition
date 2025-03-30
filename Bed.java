public class Bed {

    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int sheets, int quilt) {
        this.style = style;
        this.pillows = Math.max(0, pillows);  // Ensure non-negative values
        this.height = Math.max(0, height);
        this.sheets = Math.max(0, sheets);
        this.quilt = Math.max(0, quilt);
    }

    public void make() {
        System.out.println("Bed -> Making the bed.");
    }

    public String getStyle() {
        return style;
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    @Override
    public String toString() {
        return String.format(
                "Bed [Style: %s, Pillows: %d, Height: %d, Sheets: %d, Quilt: %d]",
                style, pillows, height, sheets, quilt
        );
    }
}
