//Tarea 3
package employer;

public class Employer {
    //Tarea 3.

    //Atributos
    private String name;
    private int age;
    private double salary;
    private int experience;
    private String job;
    private final int ID;

    //Constructor
    public Employer(String name, int age, double salary, int experience, String job,  int ID){
        this.name = name;
        this.age = age;
        this.salary =salary;
        this.experience = experience;
        this.job = job;
        this.ID = ID;
    }
    //getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getSalary(){
        return salary;
    }

    public int getExperience(){
        System.out.println("Con " + experience + " años de experiencia.");
        return experience;
    }

    public String getJob(){
        System.out.println("Departamento de " + job);
        return job;
    }

    public int getId(){
        return ID;
    }




    //setter
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

}
