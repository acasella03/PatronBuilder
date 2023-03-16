public class Main {
    public static void main(String[] args) {
        Pizzas pizzaAmedida;

        //sintaxis NO reducida
        BuilderPizzas miBuilder = new BuilderPizzas();
        miBuilder.setRecogida(TipoRecogida.PARA_LLEVAR);
        miBuilder.setSinGluten(true);
        miBuilder.setCebolla(false);
        miBuilder.setRelleno(false);
        miBuilder.setSize(Size.MEDIUM);
        miBuilder.setTipoMasa(TipoMasa.NORMAL);
        pizzaAmedida = miBuilder.build();
        System.out.println(pizzaAmedida.toString());

        //sintaxis reducida pero poco legible
        Pizzas pizzaDefault = new BuilderPizzas().setSize(Size.BIG).setRelleno(true).build();
        System.out.println(pizzaDefault.toString());

        //sintaxis reducida legible
        Pizzas pizzaDefault2 = new BuilderPizzas().setCebolla(true).setSize(Size.BIG).setRecogida(TipoRecogida.PARA_LLEVAR).build();
        System.out.println(pizzaDefault2.toString());

    }
}