package tutorial1_Java;

    // - Creating classes

//Methods and attributes
public class Dog {

        // - What does STATIC mean
    protected static int count = 0;

    protected String name; //protected --> only have access in this package
    protected int age;

    /**
     * @param name
     * @param age
     */
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        Dog.count += 1;
        Dog.display();
        this.display2();
        add2();
    }

        // - What does STATIC mean
    public static void display() {
        System.out.println("I am a dog!");
    }

    public void display2() {
        System.out.println("I am a dog!");
    }

    public void speak() {
        System.out.println("I am " + this.name + " and i am " + this.age + " years old");

    }

    public int getAge() {
        return this.age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    private int add2(){
        return this.age + 2;
    }

}

