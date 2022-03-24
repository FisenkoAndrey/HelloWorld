package lesson14;

public class MyArrays {
    int [] array = new int[3];
    Candy [] box = new Candy[5];

    public void foo(){
Candy candy = new Candy();
box[0] = candy;
System.out.println(candy);
System.out.println(box[0]);
    }
}
