package ir.almasapps.javasimplelistview.Model;

public class App {
    private String name;
    private String type;
    private String ceo;
    private String company;
    private int image;
    private String color;

    public App() {
    }

    public App(String name, String type, String ceo, String company, int image, String color) {
        this.name = name;
        this.type = type;
        this.ceo = ceo;
        this.company = company;
        this.image = image;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
