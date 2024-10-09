import java.util.HashMap;

public class hashMapDemoMain {
    public static void main(String[] args) {
        HashMap<String ,String> sozluk = new HashMap<String, String>();
        sozluk.put("Book", "Kitap");
        sozluk.put("Table", "Masa");
        sozluk.put("Computer", "Bilgisayar");
        System.out.println(sozluk.size());

        for (String item : sozluk.keySet()) {
            System.out.println("Eleman..: " + item + " Değer..: " + sozluk.get(item));
        }

        sozluk.remove("table");
        sozluk.clear();
        System.out.println(sozluk.get("table"));
    }
}