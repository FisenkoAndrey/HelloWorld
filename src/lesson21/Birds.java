package lesson21;

public class Birds {
    private String name;
    private Wings wings;

    public void walk(){
        System.out.println("Ho-ho-ho");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wings getWings() {
        return wings;
    }

    public void setWings(Wings wings) {
        this.wings = wings;
    }
}
