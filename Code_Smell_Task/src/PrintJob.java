import java.util.HashMap;
import java.util.Queue;

public class PrintJob {
    String Document;
    HashMap<Object,PrintMode> printRequest = new HashMap<>();
    HashMap<String,Integer> prioritySettingClassIntegerHashMap = new HashMap<>();

    public HashMap<Object, PrintMode> pullJob() {
        return printRequest;
    }

}
