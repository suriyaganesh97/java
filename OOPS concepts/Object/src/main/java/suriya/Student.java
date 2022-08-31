package suriya;

public class Student {


    public Student(String name, int id, int mathsMark, int physicsMark, int chemistryMark) {
        this.name = name;
        this.id = id;
        this.mathsMark = mathsMark;
        this.physicsMark = physicsMark;
        this.chemistryMark = chemistryMark;
    }

    private int mathsMark;
    private int physicsMark;
    private int chemistryMark;
    private String name;
    private int id;

    public int getMathsMark() {
        return mathsMark;
    }

    public void setMathsMark(int mathsMark) {
        this.mathsMark = mathsMark;
    }

    public int getPhysicsMark() {
        return physicsMark;
    }

    public void setPhysicsMark(int physicsMark) {
        this.physicsMark = physicsMark;
    }

    public int getChemistryMark() {
        return chemistryMark;
    }

    public void setChemistryMark(int chemistryMark) {
        this.chemistryMark = chemistryMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
