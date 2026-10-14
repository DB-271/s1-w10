public class Student{
    private String club;
    private String name;

    public Student(String name, String club){
        this.name = name;
        this.club = club;
    }

    public String getClub(){
        return club;
    }
    public String getName(){
        return name;
    }
    
    public boolean isSameClub(Student Stud){
        return this.getClub().equals(getClub());
    }
}