package shop;

public class Good {

    private String title;
    public Good(String shopsGood) {
        this.title = shopsGood;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

   @Override
    public String toString(){
        return "Good{" +
                "title='" + title + '\'' +
                '}';

   }
}
