import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CustomStringList list = new CustomStringList(new String[]{"Red", "Yellow", "Black"});
        System.out.println(list);
        System.out.println(list.check("Black"));
        System.out.println(list.check(new String[]{"Red", "Red", "Black"}));
    }
}