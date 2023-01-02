public abstract class PrintMode {
    private double tonerSavingLevel;
    private int number_of_pages;
    private int page_size;
    private boolean orientation_landscape = true;
    private double color_intensity;
    private double cost_per_page;

    public double getTonerSavingLevel() {
        return tonerSavingLevel;
    }

    public void setTonerSavingLevel(double tonerSavingLevel) {
        this.tonerSavingLevel = tonerSavingLevel;
    }

    public int getNumber_of_pages() {
        return number_of_pages;
    }

    public void setNumber_of_pages(int number_of_pages) {
        this.number_of_pages = number_of_pages;
    }

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

    public void saveToner() {

    }

    public void savePage() {

    }
    public void boost() {

    }

}
