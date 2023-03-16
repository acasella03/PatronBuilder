public class Main {
    public static void main(String[] args) {

        Pizzas pizzaBasica = new BuilderPizzas().build();
        System.out.println(pizzaBasica.toString());

        Pizzas pizzaBasicaExtraQueso = new BuilderPizzas().setTipoMasa(TipoMasa.NORMAL).setExtraQueso(true).build();
        System.out.println(pizzaBasicaExtraQueso.toString());

        Pizzas pizzaParaCeliacos = new BuilderPizzas().setSinGluten(true).setSize(Size.SMALL).setTipoSalsa(TipoSalsa.SALSA_SIN_GLUTEN).build();
        System.out.println(pizzaParaCeliacos.toString());
    }
}