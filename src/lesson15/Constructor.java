package lesson15;

public class Constructor {
    public void foo(){

        Flower flower = new Flower();
        flower.name = "Ромашка";
        flower.color = "Белая";

        Flower flower1 = new Flower("Роза", "Красный");

        System.out.println(flower.name + " " + flower.color);
        System.out.println(flower1.name + flower1.color);
                    }
}
