package testgroup.database.model;

public class Worker {
    private int id;
    private String name;
    private String surname;
    private String gender; //пол
    private int age;
    private String dept; //отдел в котором работает(работал)
    private boolean works; //works or not

    public Worker (int id, String name, String surname, String gender, int age, String dept, boolean works){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.dept = dept;
        this.works = works;
    }
//getters &setters
    public Worker (){}

    public void setId(int id){
    this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getSurname(){
        return surname;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        if(age > 18) {
            this.age = age;
        }else {System.out.println("Возраст должен быть больше 18 лет");}
    }

    public int getAge(){
        return age;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public String getDept(){
        return dept;
    }

    public void setWorks(boolean works){
        this.works = works;
    }

    public boolean getWorks(){
        return works;
    }

}
