package Factory_self_senario;

public class ClassFactory {
    Class ClassFactoryMethod(String className)
    {
        if(className.equalsIgnoreCase("1styear"))
            return new Year_1();
        else if(className.equalsIgnoreCase("2ndyear"))
            return new Year_2();
        else if(className.equalsIgnoreCase("3rdyear"))
            return new Year_3();
        else if(className.equalsIgnoreCase("4thyear"))
            return new Year_4();
        return null;
    }
}
