public class Main {
    public static void main(String[] args) {
        String[] colors = {"Red", "Yellow", "Black"};
        CustomStringList customStringList = new CustomStringList(colors);

        for (String s : customStringList.list) {
            System.out.println(s);
        }
        System.out.println(customStringList.check("Black"));
    }
}
