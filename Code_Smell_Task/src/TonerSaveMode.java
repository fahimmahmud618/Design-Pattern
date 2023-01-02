public class TonerSaveMode extends PrintMode{
    String tonerSavingLevel;

    @Override
    public void saveToner() {
        if(getTonerSavingLevel()>10)
            reduceColorIntensity();
    }

    public void reduceColorIntensity()
    {
        setColor_intensity(getColor_intensity()-10);
    }

    public void reduceColorIntensity_basedOnTonerSavingLevel()
    {
        if(canColorIntensityReduced())
        {
            colorIntensityReduceAlgo1();
            colorIntensityReduceAlgo2();
        }
    }

    boolean canColorIntensityReduced()
    {
        if((tonerSavingLevel=="medium")||(tonerSavingLevel=="high"))
            return true;
        else
            return false;
    }

    public void colorIntensityReduceAlgo1()
    {

    }
    public void colorIntensityReduceAlgo2()
    {

    }

}
