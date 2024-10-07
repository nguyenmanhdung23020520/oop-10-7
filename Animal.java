import java.util.List;

public class Animal {
    private boolean CanWalk;
    private boolean CanSwim;
    private String AnimalType;
    public Animal() {
        this.CanWalk = false;
        this.CanSwim = false;
        this.AnimalType = "";
    }
    public Animal(boolean canWalk, boolean canSwim, String animalType) {
        CanWalk = canWalk;
        CanSwim = canSwim;
        AnimalType = animalType;
    }

    public boolean isCanWalk() {
        return CanWalk;
    }

    public void setCanWalk(boolean canWalk) {
        CanWalk = canWalk;
    }

    public boolean isCanSwim() {
        return CanSwim;
    }

    public void setCanSwim(boolean canSwim) {
        CanSwim = canSwim;
    }

    public String getAnimalType() {
        return AnimalType;
    }

    public void setAnimalType(String animalType) {
        AnimalType = animalType;
    }

    public void in(List<Animal>animals){
        System.out.println("di bo");
        for(Animal animal : animals){
            if(animal.isCanWalk()==true){
                System.out.println(animal.getAnimalType());
            }
        }
        System.out.println("boi");
        for (Animal animal : animals) {
            if(animal.isCanSwim()==true){
                System.out.println(animal.getAnimalType());
            }
        }
    }
}