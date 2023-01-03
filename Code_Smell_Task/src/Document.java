public class Document {
    private int page_size;
    private boolean orientation_landscape = true;
    private double color_intensity;
    private double cost_per_page;

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public boolean isOrientation_landscape() {
        return orientation_landscape;
    }

    public void setOrientation_landscape(boolean orientation_landscape) {
        this.orientation_landscape = orientation_landscape;
    }

    public double getColor_intensity() {
        return color_intensity;
    }

    public void setColor_intensity(double color_intensity) {
        this.color_intensity = color_intensity;
    }

    public double getCost_per_page() {
        return cost_per_page;
    }

    public void setCost_per_page(double cost_per_page) {
        this.cost_per_page = cost_per_page;
    }
}
