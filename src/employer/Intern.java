//Tarea 4.
package employer;

public class Intern extends Employer {

    //Atributos
    private final int MAXSALARY = 20000;

    //constructor
    public Intern(String name, int age, double salary, int experience, String job, int ID){
    super(name, age, salary, experience, job, ID);

        if(salary > MAXSALARY){
            throw new IllegalArgumentException("El salario no puede ser mayor que " + MAXSALARY);
       }
    }

    public int getMAXSALARY() {
        return MAXSALARY;
    }

    //MEtodo para actualizar el salario con validación.
    //Sobreescribimos el metodo setsalary
    @Override
    public void setSalary(double salary){
        if(salary > MAXSALARY){
           getMAXSALARY();
            //throw new IllegalArgumentException("El salario no puede ser mayor que " + MAXSALARY);
        }else {
            //Si el valor de salario de un intern no supera el maximo, se puede actualizar, simepre que no supere el MAXSalary
            super.setSalary(salary);
        }
    }
}
