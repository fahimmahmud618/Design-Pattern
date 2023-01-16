package Factory_self_senario;

public class Teat {
    public static void main(String[] args) {
        ClassFactory classFactory = new ClassFactory();

        Class _class = classFactory.ClassFactoryMethod("1styear");
        _class.show_class();
    }
}
