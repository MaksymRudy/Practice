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
        groceryGoods.add(new Good("Buckwheat"));
        shopDepartmentToGoods.put(departmentGrocery, groceryGoods);

        ArrayList<Good> groceriesGoods = shopDepartmentToGoods.get(departmentGrocery);
        out.println(groceriesGoods);



        ShopDepartment departmentAuto = new ShopDepartment("Department Auto");

        ArrayList<Good> autoGoods = new ArrayList<>();

        Good tire = new Good("Tire");
        autoGoods.add(tire);
        autoGoods.add(new Good("Oil"));
        autoGoods.add(new Good("Antifreeze"));
        shopDepartmentToGoods.put(departmentAuto, autoGoods);

        ArrayList<Good> autosGoods = shopDepartmentToGoods.get(departmentAuto);
        out.println(autosGoods);


        ShopDepartment departmentSport = new ShopDepartment("Department Sport");

        ArrayList<Good> sportGoods = new ArrayList<>();

        Good sneakers = new Good("Sneakers");
        sportGoods.add(sneakers);
        sportGoods.add(new Good("T-shirt"));
        sportGoods.add(new Good("Trousers"));
        shopDepartmentToGoods.put(departmentSport, sportGoods);
        out.println(sportGoods);

        tire.setTitle("tire2");
        out.println(shopDepartmentToGoods);






    }
}
