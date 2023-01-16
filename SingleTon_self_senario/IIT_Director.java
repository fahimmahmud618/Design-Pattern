package SingleTon_self_senario;

public class IIT_Director {

    private IIT_Director() {

    }

    private static IIT_Director director;

    public static IIT_Director get_director()
    {
        if(director==null)
            return director=new IIT_Director();
        else
            return director;
    }

    public void show_name()
    {
        System.out.println("Dr. Mohammed Shafiul Alam Khan || Professor and Director");
    }
}
