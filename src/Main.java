public class Main {
    public static void main(String[] args) {
        Pizzas pizzaAmedida;

        //sintaxis NO reducida
        BuilderPizzas miBuilder=new BuilderPizzas();
        miBuilder.setRecogida(TipoRecogida.TIENDA);
        miBuilder.setSinGluten(true);
        pizzaAmedida=miBuilder.build();
        System.out.println(pizzaAmedida.toString());

        //sintaxis reducida pero poco legible
        Pizzas pizzaDefault = new BuilderPizzas().setCebolla(false).setSize(Size.BIG).build();
        System.out.println(pizzaDefault.toString());

        //sintaxis reducida legible
        Pizzas pizzaDefault2=new BuilderPizzas().setCebolla(true).setSize(Size.BIG).build();
        System.out.println(pizzaDefault2.toString());

        /*
        // utilizamos el builder y en concreto el metodo build
        // para tener nuestra pizza
        Pizzas creadaConBuilder = new BuilderPizzas().build();
        Pizzas sintaxisEncadenada = new BuilderPizzas()
                .setCebolla(true)
                .setSize(Pizzas.BIG)
                .build();

        // aunque el toSpring no está definida, nos valen estas lineas para poner
        // un punto de ruptura y hacer debug
        // asi podemos ver los objetos creados
        System.out.println(creadaConBuilder.toString());
        System.out.println(sintaxisEncadenada.toString());

         */
    }
}