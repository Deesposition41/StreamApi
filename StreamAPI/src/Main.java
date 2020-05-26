import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        String s = "";
        ArrayList<String> list = new ArrayList<>();
        list.add("Andrey");
        list.add("Maks");
        list.add("Dzhamil");
        list.add("Adelya");
        list.add("Ramil");
        list.add("Ilnar");
        list.add("Vika");
        list.add("Lesha");
        for (int i = 0; i < list.size(); i++) {
            s += list.get(i) + " ";
        }
        System.out.println(s);
    }
}
