package lesson21;

public class Ostrich extends Birds{
    public void hideHead(){
        System.out.println("I scared");
    }

    @Override
    public void walk() {
        System.out.println("Eee Baby");
    }
}

