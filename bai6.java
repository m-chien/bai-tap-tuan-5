import java.util.ArrayList;
import java.util.List;

public class bai6 {
    public static void main(String[] args) {
        List<Integer> so = new ArrayList<>();
        so.add(1);
        so.add(2);
        System.out.println(so);
        so.add(1,3);
        System.out.println(so);
        so.remove(2);
        System.out.println(so);
    }
}
