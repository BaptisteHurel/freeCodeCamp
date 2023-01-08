package tutorial1_Java;

        // - Inner Classes
public class OuterClass {
    public void inner() {
        class InnerClass{
            public void display(){
                System.out.println("Inner Class");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
    }
}
