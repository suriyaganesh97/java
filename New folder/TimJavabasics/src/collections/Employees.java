package collections;

class Employee{
    private String name;
    private String gender;
    private int id;
    public Employee() {
    }
    public Employee(String name, String gender, int id) {
        this.name = name;
        this.gender = gender;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
}

