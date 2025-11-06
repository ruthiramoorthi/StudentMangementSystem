public class Student {
    private int id;
    private String name;
    private int age;
    private String grade;

    public Student(int id, String name, int age, String grade) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public Student( String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public int getId() { return id; }
    public String getName(){ return name; }
    public String getGrade(){ return grade; }
    public int getAge() { return age ;}

}
