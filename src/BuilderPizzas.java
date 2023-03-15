/**
 * Ensamblador de pizzas.
 */
public class BuilderPizzas {
    /**
     * Objeto para construir el builder.
     */
    private Pizzas _pizza; // el guion bajo es para remarcar que es un objeto de esta clase

    /**
     * Método que devuelve el objeto terminado.
     *
     * @return el objeto terminado.
     */
    public Pizzas build() {
        return this._pizza;
    }

    /**
     * Constructor para crear la pizza y configurarla.
     */
    public BuilderPizzas() {
        _pizza = new Pizzas();
    }

    // metodos para la personalizacion de la pizza

    /**
     * Método para personalizar la masa de la pizza.
     *
     * @param tipoMasa indicar el tipo de masa.
     * @return el tipo de masa.
     */
    public BuilderPizzas setTipoMasa(TipoMasa tipoMasa) {
        _pizza.setTipoMasa(tipoMasa);
        return this;
    }

    /**
     * Método para personalizar el tamaño de la pizza.
     *
     * @param size indicar el tamaño de la pizza.
     * @return el tamaño de la pizza.
     */
    public BuilderPizzas setSize(Size size) {
        _pizza.setSize(size);
        return this;
    }

    /**
     * Método para personalizar el relleno de la pizza.
     *
     * @param relleno indicar si está rellena(true) o no(false).
     * @return si está rellena(true) o no(false).
     */
    public BuilderPizzas setRelleno(boolean relleno) {
        _pizza.setRellena(relleno);
        return this;
    }

    /**
     * Método para personalizar el ingrediente cebolla de la pizza.
     *
     * @param cebolla indicar si lleva(true) o no(false) cebolla.
     * @return si lleva cebolla(true) o no(false).
     */
    public BuilderPizzas setCebolla(boolean cebolla) {
        _pizza.setCebolla(cebolla);
        return this;
    }

    /**
     * Método para personalizar el gluten de la pizza.
     *
     * @param sinGluten indicar si tiene(true) o no(false) gluten.
     * @return si tiene gluten(true) o no(false).
     */
    public BuilderPizzas setSinGluten(boolean sinGluten) {
        _pizza.setSinGluten(sinGluten);
        return this;
    }

    /**
     * Método para personalizar la recogida de la pizza.
     *
     * @param recogida indicar tipo de recogida.
     * @return tipo de recogida.
     */
    public BuilderPizzas setRecogida(TipoRecogida recogida) {
        _pizza.setRecogida(recogida);
        return this;
    }
}
