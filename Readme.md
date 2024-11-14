## Java Design Pattern
___
In software engineering, a design pattern is a general repeatable solution to a commonly occurring problem in software design. A design pattern isn't a finished design that can be transformed directly into code. It is a description or template for how to solve a problem that can be used in many different situations.
___

### Uses of Design Patterns
Design patterns can speed up the development process by providing tested, proven development paradigms. Effective software design requires considering issues that may not become visible until later in the implementation. Reusing design patterns helps to prevent subtle issues that can cause major problems and improves code readability for coders and architects familiar with the patterns.

Often, people only understand how to apply certain software design techniques to certain problems. These techniques are difficult to apply to a broader range of problems. Design patterns provide general solutions, documented in a format that doesn't require specifics tied to a particular problem.

In addition, patterns allow developers to communicate using well-known, well understood names for software interactions. Common design patterns can be improved over time, making them more robust than ad-hoc designs.
___

### Types
- Creational design patterns
- Structural design patterns
- Behavioral design patterns
___

### Principles and Strategies of Design
**`Aggregation:`** implies a relationship where the child can exist independently of the parent.
  - `Example`: Class (**parent**) and Student (**child**). Delete the Class and the Students still exist.

**`Composition:`** implies a relationship where the child cannot exist independent of the parent. 
  - `Example`: House (**parent**) and Room (**child**). Rooms don't exist separate to a House.

**`Aggregation VS Composition:`** Aggregation and composition are two fundamental concepts in object-oriented programming that describe the relationships between objects. Aggregation is a "has-a" relationship where one object (the container) owns or contains multiple instances of another object (the contained object), but the contained object can exist independently outside of the container. In contrast, composition is a "part-of" relationship where one object (the container) owns or contains multiple instances of another object (the contained object), and the contained object cannot exist independently outside of the container. In other words, aggregation implies a loose coupling between objects, whereas composition implies a strong coupling, where the contained object is an integral part of the container and loses its identity outside of it.

**`Design smell: `**: In computer programming, a design smell is a structure in a design that indicates a violation of fundamental design principles, and which can negatively impact the project's quality.
  - **`Rigidity:`** A design is rigid if a single change causes a cascade of subsequent changes in dependent modules. The more modules must be changed, the more rigid the design. Rigidity makes it expensive to change software because even a simple change can cause a lot of unexpected changes.

  - **`Fragility`**: Fragility is the tendency of a program to break in many places even when a single change is made. When developers try to fix those problems, the new problems occur and the modules are getting worse and worse the more they are being fixed. A design is fragile when changing code in one place can break code in other places that might not be related to the changed code at all. Fragility makes it risky to change software because even a simple change can break code in the places that seem irrelevant to the changed code. It also makes the software less reliable, because the broken code due to the changes irrelevant to it might not be detected during development and thus can escape to the production environment.

  - **`Immobility`**: Software is immobile when none of its parts can be used in other systems because the risk and effort involved with separating those parts from the original system are too great. A design is immobile when it is difficult to extract code in one part of the system to make it reuseable by other parts. The extraction is hard because the code to be extracted gets so entangled with other code that it cannot be extracted without affecting or including the other code. Immobility causes code duplication because it hinders code reuse.

  - **`Software viscosity`**: Viscosity refers to the ease at which a developer can add design-preserving code to a system. If it is easy to add new code to the program while maintaining the design, then the program has low viscosity and that's the right thing. A design is viscous when not-good solutions are more convenient than good ones. For example, given a problem and two possible solutions, one follows good practices and one does not. If the design makes it convenient to implement the latter, then the design is said to be viscous. Because viscosity makes it easier to do the wrong things than to do the right things, it makes way for bad practices and thus progressively degrades the software quality.

  - **`Needless Complexity`**: Code base is needlessly complex when it contains code that is not useful. Just to take one such case is developers try to anticipate future requirements and changes and put into the code parts that do not have to be there at the moment and probably never used in the future. Needless complexity is when a design is more complicated than it has to be. In other words, the system consists of redundant parts that do not contribute any value to the system functionality. Most of the time, those parts are the consequences of over-designing the solution to a problem at hand. For example, given a problem and two solutions, one is simple and one uses a sophisticated design pattern, if the latter is chosen simply because design patterns are known to be good practices or because of some unknown future requirements, then needless complexity has been introduced into the system. Needless complexity makes code more complicated, less comprehensible, and less maintainable.

  - **`Needless repetition`**: Same code appears in different locations, every time with slight change. This makes system hard to understand and maintain and it is sign that developers are missing abstraction. Needless repetition is when similar code or code in slightly different forms appear at different places. This is usually a consequence of immobility or simply of developer laziness. Needless repetition makes code less maintainable, because if one piece of code is found as buggy, all the similar pieces of code must be checked and fixed. This task can easily go out of hand in large systems.
    
  - **`Opacity`**:  It is a tendency of software code to be difficult to understand. Codebase that evolves over time tends to become more and more opaque with age. Opacity hinders code maintainability because unreadable code takes more time to comprehend and sometimes can even be misunderstood.

**`Programming to an interface:`** Programming to an interface means designing code based on abstractions (interfaces or abstract classes) rather than concrete implementations. In this approach, objects interact with each other through predefined interfaces or abstract methods, which define what an object should do, but not how it does it. This encourages loose coupling between components, allowing them to be interchangeable, more flexible, and easier to maintain. In Java, for example, the interface keyword is used to define a contract that classes must follow by implementing its methods. Alternatively, an abstract class can define both abstract methods (requiring implementation) and concrete methods (already implemented). Clients (objects) rely on the abstraction, not the concrete class, allowing developers to change the underlying implementation without modifying the client code. This is a core principle of object-oriented design, enabling polymorphism and promoting scalable, modular applications.

**`Composition Over Inheritance:`** Composition Over Inheritance is a design principle in object-oriented programming that suggests favoring object composition over class inheritance to achieve code reuse and flexibility. Inheritance creates a hierarchical relationship between classes, where a subclass inherits properties and behaviors from a superclass. However, this can lead to tight coupling, limited flexibility, and difficulty in maintaining code. Composition, on the other hand, allows an object to achieve behavior by containing other objects (with specific functionality), rather than inheriting from a parent class. By using interfaces or abstract classes, objects can implement or define specific behaviors without being tied to a rigid inheritance chain, allowing for more modular, adaptable, and maintainable code. Instead of inheriting behavior, objects "compose" their functionality by delegating tasks to other objects or implementing the desired interfaces.
### Benefits of Composition Over Inheritance

1. **Flexibility and Modularity**: Composition allows you to mix and match behaviors at runtime, making it easier to add or modify functionality without altering existing class hierarchies.

2. **Reduced Coupling**: By using composition, classes are not tightly bound to a parent class, avoiding the fragile base class problem. This reduces dependencies and makes the system easier to maintain.

3. **Reusability**: Behaviors encapsulated in components can be reused across multiple classes, leading to code reuse without forcing a rigid inheritance structure.

4. **Better Testability**: Composed objects can be independently tested, promoting unit testing, as smaller, focused objects are easier to isolate and test than large inheritance hierarchies.

5. **Simplified Hierarchy**: Composition avoids deep inheritance chains, which can become complex and hard to understand. It keeps the system simpler and easier to maintain.

6. **Encapsulation**: Composition encourages better encapsulation of individual components. Each class focuses on one task, leading to a more maintainable design.

7. **Runtime Flexibility**: With composition, behaviors can be swapped out or changed at runtime, unlike inheritance which is set at compile-time.

8. **Adapts to Change**: Systems using composition are more adaptable to change because components can evolve independently without impacting a whole class hierarchy.

9. **Avoids Inheritance Pitfalls**: Composition prevents issues like the diamond problem and brittle base class, common pitfalls in deep inheritance hierarchies.

10. **Promotes Interface Segregation**: Composition aligns well with the Interface Segregation Principle (ISP) by allowing objects to implement only the behavior they need, rather than inheriting unnecessary functionality.


**`Delegation Principles:`** Delegation in object-oriented programming refers to an approach where an object delegates responsibilities or tasks to another object, rather than handling them itself. This is often facilitated using interfaces or abstract classes. By using an interface, a class can specify certain methods that need to be implemented by another class, allowing delegation of behavior without tightly coupling the two classes. Similarly, an abstract class provides a template with some method implementations, while delegating other responsibilities to subclasses that must provide concrete implementations. This delegation allows for code reuse, separation of concerns, and flexibility in how objects interact, as the delegating object doesn't need to know the specifics of how the delegated task is performed, only that it adheres to the agreed-upon contract or interface.
### Benefits of the Delegation Principle

- **Flexibility and Extensibility**: Delegation allows for easy extension and modification of behavior without modifying existing code. New classes can implement the delegated responsibilities, adhering to the interface or abstract class.

- **Decoupling**: Delegation reduces tight coupling between classes, promoting a more modular design. The delegating class only relies on the interface or abstract class, not the implementation details of the delegate.

- **Code Reusability**: Common functionality can be implemented once and reused by multiple classes, reducing code duplication. This promotes the DRY (Don’t Repeat Yourself) principle.

- **Separation of Concerns**: Responsibilities are divided between objects, making each class focus on a single task or aspect, which enhances clarity and maintainability.

- **Testability**: Since delegation makes use of interfaces or abstract classes, it's easier to mock or substitute classes in unit tests, improving test coverage and reliability.

- **Single Responsibility Principle (SRP) Compliance**: Delegation encourages compliance with the SRP by allowing objects to focus on their primary responsibilities while delegating unrelated or secondary tasks to other classes.

- **Easier Maintenance**: By isolating changes to the delegated class, it becomes easier to maintain and evolve the system over time without affecting other parts of the application.

- **Dynamic Behavior**: Delegation enables dynamic changes to behavior at runtime, especially when combined with design patterns like the Strategy pattern, allowing behavior to change without altering the client code.

___
### SOLID Principles

1. **S - Single Responsibility Principle (SRP)**
    - **Definition**: A class should have only one reason to change, meaning it should have only one responsibility or job.
    - **Benefit**: This keeps classes focused and makes them easier to understand, test, and maintain. It also helps reduce the risk of side effects from changes.

2. **O - Open/Closed Principle (OCP)**
    - **Definition**: Software entities (like classes, modules, functions) should be open for extension but closed for modification.
    - **Benefit**: You can add new functionality without altering existing code, minimizing the risk of introducing bugs and preserving existing behavior.

3. **L - Liskov Substitution Principle (LSP)**
    - **Definition**: Subtypes should be substitutable for their base types without altering the correctness of the program.
    - **Benefit**: Ensures that derived classes can seamlessly replace base classes, making the system more predictable and preventing unintended consequences.

4. **I - Interface Segregation Principle (ISP)**
    - **Definition**: Clients should not be forced to depend on interfaces they do not use. Interfaces should be specific to the clients’ needs.
    - **Benefit**: This reduces the "fat interface" problem, allowing clients to only interact with the relevant parts, leading to more modular and decoupled systems.

5. **D - Dependency Inversion Principle (DIP)**
    - **Definition**: High-level modules should not depend on low-level modules. Both should depend on abstractions (e.g., interfaces). Also, abstractions should not depend on details; details should depend on abstractions.
    - **Benefit**: This reduces the coupling between components, making systems more modular and easier to change. It also fosters flexibility and promotes loose coupling by inverting the dependencies.

### Summary
- **SRP** ensures classes have a single responsibility.
- **OCP** allows the system to grow without altering existing code.
- **LSP** guarantees that objects of derived classes can replace objects of their base class.
- **ISP** promotes smaller, more focused interfaces.
- **DIP** encourages depending on abstractions rather than concrete implementations.

These principles together form a foundation for designing robust, maintainable, and scalable software architectures.
___
## Design Pattern
- Creational Patterns
- Structural Patterns
- Behavioral Patterns

___
## Creational Patterns
- **Factory Method** : The Factory Method is a creational design pattern that provides an interface for creating objects, but allows subclasses to alter the type of objects that will be created. The key idea is that instead of calling a constructor directly to create objects, the object creation logic is moved into a separate method, often called create() or factoryMethod().

   This pattern promotes loose coupling by decoupling the client code from the specific classes that it instantiates. The client code interacts with an abstract or base class, and the responsibility of deciding which concrete class to instantiate is deferred to subclasses.
### Key Characteristics
1. **Encapsulation of Object Creation**: The client doesn't need to know which specific class to instantiate, just that it will receive an object of a certain type.
2. **Subclassing for Customization**: Subclasses can override the factory method to change the class of objects that are created.
3. **Promotes Flexibility**: Provides flexibility to introduce new types of products without changing the client code.

### Structure of Factory Method Pattern
1. **Creator**: This is typically an abstract class or interface that declares the factory method. It may also provide a default implementation but typically leaves the object creation to be implemented by subclasses.
2. **Concrete Creator**: This subclass implements the factory method to return an instance of a specific concrete product.
3. **Product**: This is the interface or abstract class that all products created by the factory must adhere to.
4. **Concrete Products**: These are the concrete implementations of the `Product` interface. Each corresponds to a type of object the factory method creates.
### How It Works
- The **client** interacts with the **Creator** class (which defines the factory method), but the actual object that gets instantiated is determined by the **Concrete Creator** that overrides the factory method.
- The factory method's return type is usually the abstract type or interface (`Product` in this case), meaning the client code doesn’t need to know about the concrete class being instantiated (`ConcreteProductA` or `ConcreteProductB`).

### Benefits of Factory Method
- **Decoupling**: The client doesn’t need to know the specific class to create, making the system more flexible and maintainable.
- **Single Responsibility Principle**: The responsibility for creating objects is moved to a single class, following SRP.
- **Open/Closed Principle**: It’s easy to introduce new product types by adding new concrete creator classes without modifying the existing code.

### Drawbacks of Factory Method
- **Complexity**: While flexible, the pattern can lead to increased complexity, especially if there are many different subclasses and factory methods.
- **Subclassing**: Sometimes, creating subclasses just to override the factory method can introduce unnecessary overhead if the product creation logic isn’t very complex.
___

- **Abstract Factory Method** : The Abstract Factory Method is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes. Essentially, it allows for the creation of objects based on a predefined "family" or "theme," enabling the program to be flexible in terms of the specific types of objects it instantiates.
### Key Concepts of the Abstract Factory Pattern
1. **Families of Related Objects**:  
   The Abstract Factory pattern is useful when you need to create families of related objects that belong together. For example, in a user interface (UI) application, you might have different "themes" (like light theme and dark theme) where each theme includes related components (e.g., buttons, text fields, backgrounds). These components are styled differently but serve similar purposes within each theme.
2. **Interface-Driven Creation**:  
   Instead of using specific classes to create objects, the pattern relies on interfaces or abstract classes. This allows for a more flexible system where objects can be created based on a family or type rather than specific concrete implementations. It promotes loose coupling by hiding the details of object creation and encourages dependency inversion.
3. **Consistency Among Products**:  
   When working with Abstract Factory, you ensure that the created objects are consistent with each other. For instance, if you choose to use the "dark theme" factory, all the UI components created through this factory (buttons, scroll bars, etc.) will belong to the dark theme. This is particularly helpful in applications where consistency among UI elements or related objects is important.
4. **Easy to Swap Product Families**:  
   A major advantage of this pattern is that it provides an easy way to switch from one family of products to another. By selecting a different factory, you can produce objects from a different family without changing the code that uses these objects. For example, switching from a Windows style to a Mac style UI can be done by changing the factory that produces the UI components.
5. **Client Code Independence**:  
   Client code (the part of your application that uses these objects) does not need to know the specific classes of the objects it’s using. It only relies on the abstract factory and the interfaces it provides, which reduces dependencies on specific implementations. This makes the client code more robust and adaptable to changes.

### Structure of the Abstract Factory Pattern
- **Abstract Factory**: An interface with methods for creating each type of product in a family (e.g., `createButton`, `createCheckbox` for a UI family).
- **Concrete Factories**: Implementations of the abstract factory that create specific families of products (e.g., `DarkThemeFactory`, `LightThemeFactory`). Each concrete factory produces a set of related products.
- **Abstract Product**: An interface or abstract class that defines the types of products that will be created (e.g., `Button`, `Checkbox`).
- **Concrete Products**: Specific implementations of the abstract products created by the concrete factories (e.g., `DarkButton`, `LightButton`, `DarkCheckbox`, `LightCheckbox`).
- **Client**: The part of the application that uses the factories and products. It interacts with factories only through their abstract interfaces and doesn’t need to know the exact class of products it’s working with.

### Example
Imagine a graphic design application that has two themes: "Classic" and "Modern." Each theme needs to supply its own set of UI components:

1. **Classic Theme**:
   - Button: An old-fashioned, rounded button with a retro color scheme.
   - Textbox: A textbox with a serif font and light border.

2. **Modern Theme**:
   - Button: A sleek, flat button with a vibrant, minimalist look.
   - Textbox: A textbox with sans-serif font and borderless style.

In this scenario, the Abstract Factory pattern would involve:

- An abstract factory (e.g., `UIFactory`) that defines methods like `createButton` and `createTextbox`.
- Concrete factories (`ClassicUIFactory` and `ModernUIFactory`) that implement the abstract factory to create Classic or Modern-themed components.
- Abstract products (`Button` and `Textbox`) to ensure all components follow a consistent structure.
- Concrete products (`ClassicButton`, `ClassicTextbox`, `ModernButton`, `ModernTextbox`) for the specific look and feel of each theme.

The **client** can then request a set of UI elements from one of these factories (Classic or Modern), depending on the theme the user selects. The factory returns components that match the requested theme, without the client knowing the details of each component's creation.

### Advantages of Abstract Factory Pattern

- **Consistency**: Helps in maintaining a consistent appearance or functionality across families of related objects.
- **Encapsulation of Object Creation**: Separates the details of instantiation, making the client code independent of the product classes.
- **Flexibility and Scalability**: Easy to add new families of products without altering existing code, as each family is represented by a new factory.

### When to Use the Abstract Factory Pattern

- When you need to work with families of related objects that should remain consistent.
- When creating an interface that will allow different themes or styles to be implemented.
- When you want to decouple the client code from specific classes of objects that it uses, relying on an interface instead.

The Abstract Factory pattern is particularly useful in complex systems where products must align closely within a family, and flexibility in the choice of families can enhance the system's adaptability to future changes.
___
- **Singleton** : The Singleton Design Pattern is a creational design pattern used to restrict the instantiation of a class to a single instance and provide global access to that instance. It is commonly used in situations where exactly one object is needed to coordinate actions across a system.
### Key Characteristics of Singleton Pattern
1. **Single Instance**: Ensures that only one instance of a class exists.
2. **Global Access**: Provides a global access point to that single instance.
3. **Lazy Initialization**: Often, the instance is created only when it is needed, which saves system resources.

### When to Use Singleton Pattern
The Singleton pattern is beneficial when:
- **A Single Resource**: A class manages a limited resource (e.g., connection pool, logging service, cache).
- **Global State Management**: The application needs a single instance to coordinate state or behavior across different parts.
- **Controlled Access**: A specific instance must control access to critical resources (e.g., file system, configurations, or database).

### Advantages of Singleton Pattern
- **Controlled Access**: Limits and centralizes access to the single instance.
- **Resource Optimization**: Helps in resource sharing across various parts of an application without creating multiple instances.
- **Consistent State**: Maintains a consistent state across the application by having a single access point.

### Disadvantages of Singleton Pattern
- **Global State Issues**: Global access to a single instance can introduce unintended dependencies, making the codebase hard to test or debug.
- **Concurrency Risks**: If not implemented carefully, a Singleton can cause threading issues in multi-threaded applications.
- **Difficulties in Testing**: Mocking a Singleton for unit testing can be challenging, as it can lead to tightly coupled code.

### Real-World Examples
- **Logger**: A logging utility that provides global logging functionality without creating multiple instances.
- **Database Connection**: A single point of access to a database, avoiding multiple connections and managing resources efficiently.
- **Configuration Manager**: A class that reads configuration files or environment variables and provides a unified configuration to the application.

### How the Singleton Pattern Works
1. **Private Constructor**: The constructor of the class is made private to prevent other classes from creating new instances.
2. **Static Instance Variable**: A static variable is used to store the single instance of the class.
3. **Public Static Method**: A public method (often called `getInstance`) provides access to the instance, creating it if it does not already exist.

This pattern ensures that each time the `getInstance` method is called, it returns the same instance, fulfilling the Singleton's requirements.

The Singleton Design Pattern can be implemented in various ways to address specific requirements like thread safety and lazy initialization, but all implementations adhere to the same core idea: ensuring a single instance across the application.
___
- .


### Resources
- https://sourcemaking.com/design_patterns
- https://refactoring.guru/design-patterns/what-is-pattern
- https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/