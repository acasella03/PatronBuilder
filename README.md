```mermaid
classDiagram
    App "1" *-- "1..*" BuilderPizzas : association
    class App{
        +pizzaAmedida: Pizzas
        +pizzaDefault: Pizzas
        +main(String[] args)
    }
    class BuilderPizzas{
          -_pizza: Pizzas
          +buil( )
          +BuilderPizzas()
          +setTipoMasa(TipoMasa tipoMasa)
          +setSize(Size size)
          +setRelleno(boolean relleno)
          +setCebolla(boolean cebolla)
          +setSinGluten(boolean sinGluten)
          +setRecogida(TipoRecogida recogida)
    }
    BuilderPizzas "1" *-- "1" Pizzas : association
    class Pizzas{
            -tipoMasa: TipoMasa
            -size: Size
            -rellena: boolean
            -cebolla: boolean
            -sinGluten: boolean
            -recogida: TipoRecogida
            +Pizzas()
            +Pizzas(TipoMasa, Size, boolean, boolean, boolean, TipoRecogida)
            +getTipoMasa()
            +setTipoMasa(TipoMasa)
            +getSize()
            +setSize(Size)
            +isRellena()
            +setRellena(boolean)
            +isCebolla()
            +setCebolla(boolean)
            +isSinGluten()
            +setSinGluten(boolean)
            +getRecogida()
            +setRecogida(TipoRecogida)
            +toString()
    }