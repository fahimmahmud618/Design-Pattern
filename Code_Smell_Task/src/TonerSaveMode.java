public class TonerSaveMode extends PrintMode{
    String tonerSavingLevel;

    @Override
    public void printModeAlgo() {
        super.printModeAlgo();
    }

    public void changeColorIntensity()
    {
        ColorIntensity colorIntensity;

        if(tonerSavingLevel=="high")
            colorIntensity = new HighColorIntensity(tonerSavingLevel);
        else if(tonerSavingLevel=="medium")
            colorIntensity = new MediumColorIntensity(tonerSavingLevel);
        else
            colorIntensity = new LowColorIntensity(tonerSavingLevel);

        colorIntensity.reduceColorIntensity_basedOnTonerSavingLevel();
    }



}
