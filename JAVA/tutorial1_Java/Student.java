package tutorial1_Java;

    // - Overloading Methods & Object Comparisions
public class Student implements Comparable<Student>{

    private String name;

    /**
     * @param name
     */
    public Student (String name) {
        this.name = name;
    }

    public boolean equals(Student other) {
        if (this.name == other.name) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    public String toString() {
        //return "Student(" + this.name + ")";
        return this.name;

    }

    
}
