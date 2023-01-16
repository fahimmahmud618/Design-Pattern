package SingleTon_self_senario;

public class IIT {
    public static void main(String[] args) {
        IIT_Director iitDirector = IIT_Director.get_director();

        iitDirector.show_name();
    }
}
