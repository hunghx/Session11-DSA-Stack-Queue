public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "|Student{ ID :"+id+",Name :"+ name+"}|";
    }

    @Override
    public int compareTo(Student o) {
        return o.id-this.id;
    }
}
