
public class Animal{
    public int age;
    public String gender;

    public void mate(){
        System.out.println("This is method mate()");
    }
    public void isMammel(){
        System.out.println("This is method isMammel()");
    }

    public static void main(String [] args){
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.mate();
        myAnimal.isMammel();
        myFish.mate();
        myFish.isMammel();
        myZebra.mate();
        myZebra.isMammel();
        myZebra.run();
    }

}

class Fish extends Animal{
    @SuppressWarnings("unused")
    private int sizeInFeet = 21;
    @SuppressWarnings("unused")
    private void canEat(){
        System.out.println("This is private method canEat()");
    }

}

class Zebra extends Animal{
public boolean isWild;
public void run() {
    System.out.println("This is method run()");

}



}