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
## SOLID PRINCIPLES


### Resources
- https://sourcemaking.com/design_patterns
- https://refactoring.guru/design-patterns/what-is-pattern
- https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/