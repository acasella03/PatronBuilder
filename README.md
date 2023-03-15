```mermaid
classDiagram
    App "1" *-- "1..*" BuilderPizza : association
    class App{
        +main()
    }
    class BuilderPizza{
    +buil()
    }
    BuilderPizza "1" *-- "1" Pizzas : association
    class Pizzas{+Pizzas()}