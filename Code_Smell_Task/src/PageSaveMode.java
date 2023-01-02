public class PageSaveMode extends PrintMode{
    @Override
    public void savePage() {
        super.savePage();
    }

    public void renderPreview()
    {

    }

    public int reduceNumberOfPage()
    {
        return getNumber_of_pages();
    }
}
