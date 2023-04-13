package shop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        Rice rice= new Rice();
        list.add(rice.toString());

        Buckwheat buckwheat = new Buckwheat();
        list.add(buckwheat.toString());

        Semolina semolina = new Semolina();
        list.add(semolina.toString());

        System.out.println(list.size());
        System.out.println(list.get(1));

//        list.remove(1);
//        list.clear();

        for (String l : list) {
            System.out.println(l);
        }



    }
}
