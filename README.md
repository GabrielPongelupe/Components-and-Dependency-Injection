# Components and Dependency Injection

## About the Project
This project is a simple challenge developed for the **Java Spring Professional** course. It demonstrates the concepts of **components** and **dependency injection** using **Spring Boot**.

## Challenge Description
The goal of the challenge is to create a system that calculates the total value of an order, considering a discount percentage and shipping cost. The total value is calculated by applying the discount to the base price of the order and adding the shipping fee.

### **Shipping Cost Rules**
| Order Base Value | Shipping Cost |
|-----------------|--------------|
| Below R$100.00 | R$20.00 |
| R$100.00 to R$199.99 | R$12.00 |
| R$200.00 or more | Free |

### **Example Inputs and Outputs**
#### Example 1:
**Input:**
```
Order ID: 1034
Base Value: 150.00
Discount: 20.0%
```
**Output:**
```
Order ID: 1034
Total Value: R$132.00
```

#### Example 2:
**Input:**
```
Order ID: 2282
Base Value: 800.00
Discount: 10.0%
```
**Output:**
```
Order ID: 2282
Total Value: R$720.00
```

### **Project Structure**
The solution follows a component-based structure:
- **OrderService**: Responsible for order operations.
- **ShippingService**: Responsible for shipping fee calculations.

Each service is implemented as a **Spring Component (@Service)** and the output is displayed in the terminal logs.

## Summary of Course Topics
The course covers key concepts of **components** and **dependency injection**, including:

### **1. Components in a System**
- Systems are composed of **components**.
- Components should be:
  - **Cohesive** (clear and single responsibility).
  - **Decoupled** (independent from each other).
- Benefits:
  - **Flexibility**.
  - **Easier maintenance and replacement**.
  - **Reusability**.

### **2. Dependency Injection (DI)**
- If component A depends on component B, A should not control B directly.
- Instead, **B should be injected into A**.
- DI can be implemented through:
  - **Constructor Injection**.
  - **Setter Injection**.
  - **Dependency Injection Container (Frameworks like Spring)**.

### **3. Using Spring for DI**
- Spring provides built-in dependency injection management.
- To use DI in Spring:
  1. **Register components** with annotations like `@Service`.
  2. **Indicate dependencies** using `@Autowired`.
- The framework then manages:
  - Component instantiation.
  - Dependency resolution.
  - Component lifecycle and scope.

## Technologies Used
- **Java 21**
- **Spring Boot**
- **Maven**

## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-repository
   ```
3. Build and run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Check the console output for results.

## License
This project is for educational purposes only.
