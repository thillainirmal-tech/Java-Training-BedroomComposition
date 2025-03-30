public class Ceiling {

    private int height;
    private int paintedColor;

    public Ceiling(int height, int paintedColor) {
        this.height = (height < 0) ? 0 : height;  // Validation
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    @Override
    public String toString() {
        return "Ceiling [Height: " + height + ", Color: " + paintedColor + "]";
    }
}
