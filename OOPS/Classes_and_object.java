class Dog {

    String name;

    void bark() {
        System.out.println(name + " BARK!!!");
    }
}



public class Classes_and_object {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();   //If value of the name of the dog is passed

        Dog dog_name = new Dog();
        dog_name.name = "Cherry";
        dog_name.bark();
    }
}
