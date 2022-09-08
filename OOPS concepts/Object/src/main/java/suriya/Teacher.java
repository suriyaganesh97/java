package suriya;

public class Teacher {
    private int id;
    private String teacherName;
    private String teacherQualification;
    public Teacher(int id, String teacherName, String teacherQualification) {
        this.id = id;
        this.teacherName = teacherName;
        this.teacherQualification = teacherQualification;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getTeacherQualification() {
        return teacherQualification;
    }
    public void setTeacherQualification(String teacherQualification) {
        this.teacherQualification = teacherQualification;
    }
    

}
