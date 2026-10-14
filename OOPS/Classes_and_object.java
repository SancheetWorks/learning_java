class Dog {

    String name;
    // String name = "Cherry";

    void bark() {
        System.out.println(name + " BARK!!!");
    }
}



public class Classes_and_object {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.bark();   //If value of the name of the dog is given inside the method, else shows null

        Dog dog_name = new Dog();
        dog_name.name = "Cherry";
        dog_name.bark();
    }
}
