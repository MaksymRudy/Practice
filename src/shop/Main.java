package shop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Map<ShopDepartment, ArrayList<Good>> shopDepartmentToGoods = new HashMap<>();

        ShopDepartment departmentGrocery = new ShopDepartment("Department Grocery");

        ArrayList<Good> groceryGoods = new ArrayList<>();

        Good semolina = new Good("Semolina");
        groceryGoods.add(semolina);
        groceryGoods.add(new Good("Rice"));
        shopDepartmentToGoods.put(departmentGrocery, groceryGoods);

        ArrayList<Good> groceriesGoods = shopDepartmentToGoods.get(departmentGrocery);
        out.println(groceriesGoods);



        ShopDepartment departmentAuto = new ShopDepartment("Auto Good");

        ArrayList<Good> autoGoods = new ArrayList<>();

        Good tire = new Good("Tire");
        autoGoods.add(tire);
        autoGoods.add(new Good("Oil"));
        shopDepartmentToGoods.put(departmentAuto, autoGoods);

        ArrayList<Good> autosGoods = shopDepartmentToGoods.get(departmentAuto);
        out.println(autosGoods);


        tire.setTitle("tire2");
        out.println(shopDepartmentToGoods);







    }
}
