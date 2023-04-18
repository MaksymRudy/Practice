package shop;

public class ShopDepartment {

    private String name;
    public ShopDepartment(String departmentName) {
        this.name = departmentName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ShopDepartment{" +
                "name='" + name + '\'' +
                '}';
    }
}
