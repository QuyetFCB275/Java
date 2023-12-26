package J04002;

class Rectange {
    private double width, height;
    private String color;
    Rectange() {
        this.height = 1;
        this.width = 1;
    }
    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double getWidth() {
        return width;
    }
    void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    void setColor(String color) {
        this.color = color;
    }
    public double findArea() {
        return width * height;
    }
    public double findPerimeter() {
        return 2 * (width + height);
    }
}
