package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Map<ShopDepartment, ArrayList<Good>> listGoods = new HashMap<>();
        ShopDepartment departmentGrocery = new ShopDepartment("Department Grocery");
        Good semolina = new Good("Semolina");
        ArrayList<Good> goods = new ArrayList<>();
        goods.add(semolina);
        goods.add(new Good("Rice"));
        listGoods.put(departmentGrocery, goods);
        ArrayList<Good> goodArrayList = listGoods.get(departmentGrocery);
        out.println(goodArrayList);




    }
}
