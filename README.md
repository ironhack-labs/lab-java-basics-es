![logo_ironhack_blue 7](https://user-images.githubusercontent.com/23629340/40541063-a07a0a8a-601a-11e8-91b5-2f13e4e6b441.png)

# LAB | Conceptos Básicos de Java

## **Instrucciones**

1. Haz un **fork** de este repositorio.  
2. Clona tu **fork** en tu máquina local.  
3. Resuelve los desafíos.  

## Entregables  

- Una vez completado, agrega tu solución a **git**.  
- Luego, haz **commit** en git y **push** a tu repositorio en GitHub.  
- Crea un **pull request** y pega el enlace del pull request en el campo de entrega en el **Portal del Estudiante**.

## Tareas

1. Escribe un método en Java para obtener la diferencia entre el valor más grande y el más pequeño en un array de enteros.  La longitud del array debe ser **1 o mayor**.  Utiliza bucles y condicionales para desarrollar el algoritmo.
2. Escribe un método en Java para encontrar el elemento más pequeño y el segundo más pequeño de un array dado e imprimirlo en la consola. Utiliza **bucles y condicionales** para desarrollar el algoritmo.
3. Crea una **clase `Employee`** para representar a un empleado de una empresa.  
   Agrega todas las **propiedades y comportamientos relevantes**, pero debes incluir obligatoriamente una **propiedad `salary`**.  
   No olvides añadir sus **getters y setters**.
4. Crea una **clase `Intern`** que **herede** de `Employee`.  
   Todos los **Interns** tienen un **límite de salario de 20000** (constante).  
   Debes **validar** si un **Intern** es creado (o su salario es actualizado) con un salario mayor al límite permitido.  
   El **valor máximo está predefinido**.
5. Escribe un programa que cree 10 empleados y muestre todas sus propiedades.

---

## Solution

### Project structure

```
src/
└── com/ironhack/
    ├── Main.java                  Entry point: runs every task and prints the results
    ├── arrays/
    │   └── ArrayUtils.java        Tasks 1 and 2 (array algorithms)
    └── employees/
        ├── Employee.java          Task 3 (properties, behaviours, getters and setters)
        └── Intern.java            Task 4 (salary capped at 20000)
```

### Where each task lives

| Task | Description | Implementation |
| ---- | ----------- | -------------- |
| 1 | Difference between the largest and the smallest value of an array | `ArrayUtils.differenceBetweenLargestAndSmallest(int[])` |
| 2 | Smallest and second smallest elements printed in the console | `ArrayUtils.printSmallestAndSecondSmallest(int[])` |
| 3 | `Employee` class with a `salary` property, getters and setters | `Employee` |
| 4 | `Intern` extending `Employee` with a salary limit of `20000` | `Intern` |
| 5 | Program that creates 10 employees and prints all their properties | `Main.runTaskFive()` |

### Design notes

- **No shortcuts in the algorithms.** Tasks 1 and 2 are solved with a single `for` loop and
  conditionals, as the lab asks, instead of `Arrays.sort` or the Stream API. Both run in O(n)
  time with O(1) extra memory.
- **Second smallest means second smallest *distinct* value.** For `[4, 1, 1, 9]` the program
  reports `1` and `4`. When every element is equal there is no second distinct value and the
  program says so rather than printing a misleading number.
- **One place for the salary rules.** `Employee` exposes a protected `validateSalary(double)`
  hook that is called from both the constructor and `setSalary`. `Intern` overrides it to add
  the `MAX_SALARY = 20000` limit, which covers the two cases the lab requires with a single
  override: an intern *created* above the limit and an intern *updated* above the limit. Raises
  are validated through the same path, so `raiseSalary` can never push an intern over the cap.
- **Fail fast on invalid data.** Ids must be positive, text fields cannot be blank and salaries
  cannot be negative. Invalid input throws `IllegalArgumentException` with a descriptive
  message, and the object keeps its previous valid state.

### How to run it

From the root of the repository, with a JDK installed:

```bash
javac -d out $(find src -name "*.java")
java -cp out com.ironhack.Main
```

On Windows PowerShell:

```powershell
javac -d out (Get-ChildItem -Recurse -Filter *.java src | ForEach-Object FullName)
java -cp out com.ironhack.Main
```
