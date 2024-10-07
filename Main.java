import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal>animals = new ArrayList<Animal>();
        Duck duck = new Duck(true,true,"Vit");
        Pig pig = new Pig(true,false,"Lon");
        Fish fish = new Fish(false,true,"Ca");
        animals.add(duck);
        animals.add(pig);
        animals.add(fish);
        Animal animal =new Animal();
        animal.in(animals);
    }
}
