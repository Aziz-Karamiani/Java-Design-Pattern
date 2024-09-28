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
`Aggregation:` implies a relationship where the child can exist independently of the parent.
  - `Example`: Class (**parent**) and Student (**child**). Delete the Class and the Students still exist.

`Composition:` implies a relationship where the child cannot exist independent of the parent. 
  - `Example`: House (**parent**) and Room (**child**). Rooms don't exist separate to a House.

`Aggregation VS Composition:` Aggregation implies a relationship where the child can exist independently of the parent. Example: Class (parent) and Student (child). Delete the Class and the Students still exist. Composition implies a relationship where the child cannot exist independent of the parent.

`Programming to an interface:`




### Resources
- https://sourcemaking.com/design_patterns
- https://refactoring.guru/design-patterns/what-is-pattern
- https://www.visual-paradigm.com/guide/uml-unified-modeling-language/uml-aggregation-vs-composition/