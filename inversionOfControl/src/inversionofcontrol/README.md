#### Inversion of Control (IoC) Styles

Here we will cover the 3 standard class dependency styles
1. Inheritance
2. Injection
3. Composition

The goal of course is to understand that traditional Inheritance has its place
but should be used in a limited capacity since there are other less firm forms
of coupling that can be employed.

The Two most comparable items are traditional **Inheritence** and **Composition**.
Both are explicit as to the definition of extended dependencies. The difference
is that **Composition** allows your to bypass the single inheritence nature of
Java. What this means is that any class can only extend a single base class. To 
inherit from more than one base class ( **Don't do it** ) is to create a dependency
chain like so:

```Java
public class BaseClass{}
public class IntermediateBaseClass extends BaseClass{}
public class ChildClass extends IntermediateBaseClass{}
```

- `BaseClass`
  - `IntermediateBaseClass`
    - `ChildClass`

The `ChildClass` here can now inherit from `BaseClass` and `IntermediateBaseClass`.
The risk is that putting so much abstraction in one place invites over 
generalization. Classes should do one job in a way that can be shared but never 
to be overused. **Composition** on the other hand levels this tree and makes it 
so that a _public_ api from those base classes can be used by our _ComposedClass_.

```Java
public class ChildClass{
  private BaseClass             baseClass             = null;
  private IntermediateBaseClass intermediateBaseClass = null; 

  public ChildClass() {
    this.baseClass = new BaseClass():
    this.intermediateBaseClass = new IntermediateBaseClass();
  }
}
```

In composition the code is a little heavier but nothing is inviting the generalization 
of these classes. They a set of tools that our **ChildClass** depends on if we need 
something similar but different in function to another class we can build a variant 
of our dependencies or do single inheritance with a sub variant later.

In short just because you can chain inheritance you should never. All inheritance 
trees in Java should only have a height of one unless it cannot be avoided. Java 
tries to enforce this rule by allowing for only single inheritance.
