# 🏛 University Economic Department Simulator

For this task, you will develop a simple simulation of a university's Economic Department in Java. You will model the department's financial details such as budget and cash flow. This exercise is designed to enhance your understanding of designing Java classes and practicing encapsulation, constructors, getters and setters, printing, the main method, and variable shadowing.

### 💀 Deadline
This task should be completed before the lab session on **Friday, 30th October**.

### 👩‍🏫 Instructions
For instructions on how to complete and submit the task, please refer to the [assignments section of the course instructions](https://your-university-link.edu/assignments).

### 📝 Preparation
To complete this task, ensure you have read and understood the following materials:

- Java Classes and Objects: https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html
- Encapsulation in Java: https://docs.oracle.com/javase/tutorial/java/javaOO/encapsulation.html
- Java Constructors: https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html

### ✅ Learning Goals
This week's learning goals include:
* Designing Java classes
* Adding instance fields
* Adding a constructor method
* Creating *getters* and *setters*
* Printing to the terminal
* Using the `main` method
* Understanding scope and *variable shadowing*

### 🚨 Troubleshooting Guide
If you encounter any issues, try these steps:

1. Review the [posted issues](https://your-university-link.edu/help/issues) for potential solutions or similar problems faced by peers.
2. Create a [new issue](https://your-university-link.edu/help/issues/new) with a descriptive title, such as "Task 3: Issue with constructor".
3. Visit the weekly lab session for assistance from a TA.

Feel free to discuss approaches with classmates, but remember **do not share solutions**.

### 🏛 Assignment

Imagine you are tasked with developing a financial model for your university's Economics Department. This model will store and manage the department's budget and cash flow details. Your task is to implement this model in Java using the following exercises:

#### Exercise 3.0 -- Fields
In the `src` folder, create a new class called `EconomicsDepartment.java`. Define these instance fields to store financial information:

- `String departmentName`
- `double annualBudget`
- `double cashFlow`
- `boolean inDeficit`

Verify your fields work correctly with the Example 1 provided, and use it to test your class.

<details>
  <summary> 🛠 Example 1 </summary>

  ```java
  public class EconomicsDepartment {
    // Define your fields here

    public static void main(String[] args) {
      EconomicsDepartment econDept = new EconomicsDepartment();

      econDept.departmentName = "University Economics Department";
      econDept.annualBudget = 5_000_000.00;
      econDept.cashFlow = 500_000.00;

      System.out.println("Department: " + econDept.departmentName);
      System.out.println("Annual Budget: $" + econDept.annualBudget);
      System.out.println("Cash Flow: $" + econDept.cashFlow);
    }
  }
  ```
</details>

#### Exercise 3.1 -- Getters and Setters
Implement encapsulation by changing the field access modifiers to `private`. Add *getters* and *setters* for these fields. Use the provided Example 2 to test your changes.

<details>
  <summary> 🛠 Example 2 </summary>

  ```java
  public class EconomicsDepartment {
    // Private fields and their getters and setters

    public static void main(String[] args) {
      EconomicsDepartment econDept = new EconomicsDepartment();

      econDept.setDepartmentName("University Economics Department");
      econDept.setAnnualBudget(5_000_000.00);
      econDept.setCashFlow(500_000.00);

      System.out.println("Department: " + econDept.getDepartmentName());
      System.out.println("Annual Budget: $" + econDept.getAnnualBudget());
      System.out.println("Cash Flow: $" + econDept.getCashFlow());
      System.out.println("In Deficit: " + econDept.isInDeficit());
    }
  }
  ```
</details>

> **Note:** The convention for boolean getters typically uses `is` instead of `get` (e.g., `isInDeficit()`).

#### Exercise 3.2 -- Constructor
Instead of setting each field explicitly, use a constructor to initialize the department's data. Follow the constructor examples in the provided material and refactor the main method accordingly.

#### Exercise 3.3 -- `printFinancialStatus()`
Create a method `printFinancialStatus()` which outputs the department's current financial status. Use Example 3 to understand what the output should look like.

<details>
  <summary> 🛠 Example 3 </summary>

  ```java
  public static void main(String[] args) {
    EconomicsDepartment econDept = new EconomicsDepartment("University Economics Department", 5_000_000.00, 500_000.00);

    econDept.printFinancialStatus();
  }
  ```

  Output:
  ```
  > FINANCIAL STATUS
  > Department: University Economics Department
  > Annual Budget: $5000000.0
  > Cash Flow: $500000.0
  > In Deficit: false
  ```
</details>

#### Exercise 3.4 -- Simulate Changes in Finances
Implement a method `updateFinances(double changeInCashFlow)` that updates the `cashFlow` and prints if the department goes into deficit (i.e., when `cashFlow` becomes negative).

<details>
  <summary> 🛠 Example 4 </summary>

  ```java
  public static void main(String[] args) {
    EconomicsDepartment econDept = new EconomicsDepartment("University Economics Department", 5_000_000.00, 500_000.00);

    econDept.updateFinances(-600_000.00); // This should trigger a deficit warning
  }
  ```

  Output:
  ```
  > Cash flow updated. Current balance: $-100000.0
  > Warning: The department is now in deficit!
  ```
</details>

#### Exercise 3.5 -- Variable Shadowing
Develop an understanding of variable shadowing with the example below. Reflect on how variable shadowing occurs and how to avoid it.

```Java
public class University {
    private double totalBudget = 10_000_000.00; // I want this printed!

    public void displayBudget() {
        double totalBudget = 5_000_000.00;
        System.out.println("Total Budget: " + totalBudget); // This prints the wrong budget :(
    }

    public static void main(String[] args) {
        new University().displayBudget();
    }
}
```

> **Assistant's Note:** Consider how modifying the use of the `this` keyword can solve issues related to shadowing.

### 🐞 Bugs and errors?
If you find any inconsistencies or errors in this task, please open a [New Issue](https://your-university-link.edu/help/issues/new) titled "Task 3 Error: *summary of problem here*". Students who find bugs will be thanked in the acknowledgments!