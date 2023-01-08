package tutorial1_Java;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeSet;
import java.util.TreeMap;



public class Main {


    /**
     * @param args
     */
    public static void main(String[] args) {

        //System.out.println("Hello World");

        // - Variables & Data Types
        /* 
        int hello_world = 5; // entier
        double num2 = 5.2; // decimal
        boolean b = true; // true or false
        char c = 'o'; // 1 letter or caracter
        String str = "Baptiste"; // chain of caracters
        //System.out.println(num2);
        */

        // - Basic Operators
        /*
        int x = 5;
        double y = 7;
        double z = 57;
        double u = x / (double)y; // cast variable
        int m = 56 % 5;
        double d = Math.pow(x, y); // exposant
        //System.out.println(m);
        */

        // - Input and Scanners
        /*
        Scanner sc = new Scanner(System.in);
        String scanned  = sc.next();
        int scanned2  = sc.nextInt();
        double scanned3 = sc.nextDouble();
        int sc1 = Integer.parseInt(scanned);
        //System.out.println(sc1);
        sc.close();
        */

        // - Conditions and Booleans
        /*          
        // > < == >= <= !=
        int b1 = 6;
        int b2 = 7;
        int b3 = 10;
        boolean compare = (x < y && y > z ) || (z + 2 < 5 || x + 7 > y);
        //System.out.println(compare);
        */

        // - If Else - Else If
        /*
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();

        if (s.equals("baptiste")) 
        {
            System.out.println("You typed baptiste");
        }
        else if (s.equals("hello"))
        {
            System.out.println("Hi!");

        }
        else
        {
            System.out.println("Print");

        }
        sc.close();
        */

        // - Nested Statements
        /*
        System.out.print("Input your age: ");
        Scanner sc = new Scanner(System.in);
        String s  = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18) {
            System.out.print("Input your fav food");
            String food = sc.nextLine();

            if (food.equals("pizza")) {
                System.out.println("Mine too");
            }
            else {
                System.out.println("Not mine");

            }
        }
        else if (age >= 13 ) {
            System.out.println("You are a teenager ");

        }
        else {
            System.out.println("You are a teenager or an adult ");
        }
        */

        // - Arrays
        /*
        String[] newArr = new String[5];
        newArr[0] = "hello";
        newArr[1] = "hi";
        newArr[2] = "tim";
        newArr[3] = "bill";
        newArr[4] = "joe";
        int[] nums = {2, 3, 54, 6, 6};
        double[] nums2 = {2.0, 3.2};
        int x = nums[4];
        System.out.println(x);
         */

        // - For Loops
        /*
        int[] arr = {1,5,7,3,4,5};
        String[] names = new String[5];

        // 1
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5 ) {
                System.out.println("Found a 5! at index " + i);
            }
        }
        // 2 
        int count = 0;
        for (int element:arr){
                System.out.println(element + " " + count);
                count++;
        }

        // 3
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < names.length; i++) {
                System.out.print("Input: ");
                String input = sc.nextLine();
                names[i] = input;
        }
        for (String n:names) {
            System.out.println(n);
            if (n.equals("tim)")) {
                break;
            }
        }
         */

        // - While Loops
        /*
        Scanner sc = new Scanner(System.in);
        int x = 0;
        do{
            System.out.println("Type a number: ");
            x = sc.nextInt();
        } while (x <= 10);
            x += 1;
        */

        // - Sets and Lists
        /* 
        //Set<Integer> t = new HashSet<Integer>(); 
        Set<Integer> t = new TreeSet<Integer>(); // Liste triée
        //Set<Integer> t = new LinkedHashSet<Integer>();
        t.add(5);
        t.add(7);
        t.add(5);
        t.add(9);
        t.remove(9);
        //t.clear();
        //t.isEmpty();
        //t.size();
        boolean x = t.contains(5);
        System.out.println(x);

        ArrayList<Integer> u = new ArrayList<Integer>(); //Dynamic size
        u.add(1);
        u.add(2);
        u.add(0);
        u.get(0);
        u.set(1, 5);
        u.subList(1, 3);

        System.out.println(u.subList(1, 3));
        */      
        
        // - Maps and HashMaps
        /*
        Map m = new HashMap(); //TreeMap // LinkedHashMap
        m.put("baptiste", 5);
        m.put("joe", "x");
        m.put(11, 999);
        m.containsValue("x");
        m.containsKey(11);
        m.get(5);
        m.remove(' ');
        System.out.println(m);
         */

        // - Maps example
        /* 
        Map m = new HashMap();
        String str = "hello my name is baptiste and i am cool";

        for (char x:str.toCharArray()){
            if (m.containsKey(x)){
                int old = (int) m.get(x);
                m.put(x, old+1);
            }
            else {
                m.put(x, 1);
            }
        }
        //System.out.println(m);

        int[] x = {-99,5,6,3,2,1,7,8,0};
        Arrays.sort(x, 3, 6);
        for (int i:x){
            System.out.print(i + ",");
        }
        */

        // - Intro to object
        /* 
        Scanner sc = new Scanner(System.in);
        //sc.next();
        String h = "hello";
        h.length();      

        //baptiste("Baptisteee", 4);
        System.out.println(str("hi"));

    }

    public static void baptiste(String str, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(str);
        }
    }

    public static int  add2(int x) {
        return x + 2;
    }

    public static String str(String x) {
        return x + "!";
    }
    */

        // - Creating classes
        /* 
        Dog tim = new Dog("tim", 4);
        tim.speak();
        Dog bill = new Dog("bill", 7);
        bill.speak();        
        Dog bob = new Dog("bob", 11);
        bob.speak();
        //tim.setAge(10);
        //tim.speak();
        //System.out.println(x);
        */

        // - Inheritance 
        /*
        Cat tim = new Cat ("tim", 18, 100);
        Cat bob = new Cat("bob", 7);
        Cat joe = new Cat ("joe");
        //tim.speak();
        bob.speak();
        joe.speak();
         */

        // - What does STATIC mean
        /*
        Dog tom = new Dog("tom", 9);
        Dog bill = new Dog("bill", 10);
        Dog.count = 7;
        System.out.println(Dog.count);
        */


        // - Overloading Methods & Object Comparisions
        /*
        Student joe = new Student("Joe");
        Student bill = new Student("Bill");
        Student tim = new Student("Tim");
        System.out.println(joe.compareTo(tim) > 0);
        System.out.println(joe.compareTo(joe));
        System.out.println(bill.toString());
        */

        // - Inner Classes
        /*
        OuterClass out = new OuterClass();
        //OuterClass.InnerClass in = out.new InnerClass();
        //in.display();
        out.inner();

        System.out.println();
        */


        // - Interface
        /*
        Car tesla = new Car();
        tesla.speedUp(0);
        tesla.changeGear(2);
        tesla.display();
        int x = Vehicule.math(5);
        System.out.println(x);
        */

        // - Enums
        Level lvl = Level.LOW;
        //String en = lvl.toString();
        Level[] arr = Level.values();

        //System.out.println(lvl.getLvl());
        //System.out.println(Level.valueOf("LOW"));

        lvl.setLvl(5);
        System.out.println(lvl.getLvl());

        for (Level e : arr) {
            System.out.println(e);
        }
        if (lvl == Level.LOW) {
            System.out.println(lvl);
        } else if (lvl == Level.MEDIUM) {
            System.out.println(lvl);
        } else {
            System.out.println(lvl);
        }
    }
}