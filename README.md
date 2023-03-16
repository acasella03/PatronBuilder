```mermaid
classDiagram
    App "1" *-- "1..*" BuilderPizzas : association
    class App{
        +pizzaBasica: Pizzas
        +pizzaBasicaExtraQueso: Pizzas
        +pizzaParaCeliacos: Pizzas
        +main(String[] args)
    }
    class BuilderPizzas{
          -_pizza: Pizzas
          +buil( )
          +BuilderPizzas()
          +setTipoMasa(TipoMasa tipoMasa)
          +setSize(Size size)
          +setRelleno(boolean relleno)
          +setSalsa(boolean salsa)
          +setTipoSalsa(TipoSalsa tipoSalsa)
          +setCebolla(boolean cebolla)
          +setSinGluten(boolean sinGluten)
          +setExtraQueso(boolean extraQueso)
          +setPineapple(boolean pineapple)
          +setMushrooms(boolean mushrooms)
          +setJamon(boolean jamon)
          +setRecogida(TipoRecogida recogida)
    }
    BuilderPizzas "1" *-- "1" Pizzas : association
    class Pizzas{
            -tipoMasa: TipoMasa
            -size: Size
            -rellena: boolean
            -salsa: boolean
            -tipoSalsa: TipoSalsa
            -cebolla: boolean
            -sinGluten: boolean
            -extraQueso: boolean
            -pineapple: boolean
            -mushrooms: boolean
            -jamon: boolean
            -recogida: TipoRecogida
            +Pizzas()
            +Pizzas(TipoMasa, Size, boolean, boolean, TipoSalsa, boolean, boolean, boolean, boolean, boolean, boolean, TipoRecogida)
            +getTipoMasa()
            +setTipoMasa(TipoMasa)
            +getSize()
            +setSize(Size)
            +isRellena()
            +setRellena(boolean)
            +isSalsa()
            +setSalsa(boolean)
            +getTipoSalsa()
            +setTipoSalsa(TipoSalsa)
            +isCebolla()
            +setCebolla(boolean)
            +isSinGluten()
            +setSinGluten(boolean)
            +isExtraQueso()
            +setExtraQueso(boolean)
            +isPineapple()
            +setPineapple(boolean)
            +isMushrooms()
            +setMushrooms(boolean)
            +isJamon()
            +setJamon(boolean)
            +getRecogida()
            +setRecogida(TipoRecogida)
            +toString()
    }