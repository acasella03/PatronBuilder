/**
 * Caracteríaticas de la Pizza.
 */
public class Pizzas {

    private TipoMasa tipoMasa;
    private Size size;
    private boolean rellena;
    private boolean cebolla;
    private boolean sinGluten;
    private TipoRecogida recogida;

    public Pizzas() {
        this.cebolla = true;
        this.recogida = TipoRecogida.TIENDA;
        this.rellena = false;
        this.sinGluten = false;
        this.size = Size.MEDIUM;
        this.tipoMasa = TipoMasa.FINA;
    }

    /**
     * Constructor con todos los parametros
     *
     * @param tipoMasa  espesor de la masa
     * @param size      tamaño de la pizza
     * @param rellena   si el borde esta relleno de queso
     * @param cebolla   lleva o no lleva
     * @param sinGluten para celíacos
     * @param recogida  como lo va a recoger el cliente
     */
    public Pizzas(TipoMasa tipoMasa, Size size, boolean rellena, boolean cebolla, boolean sinGluten, TipoRecogida recogida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.recogida = recogida;
    }

    public TipoMasa getTipoMasa() {

        return tipoMasa;
    }

    public void setTipoMasa(TipoMasa tipoMasa) {

        this.tipoMasa = tipoMasa;
    }

    public Size getSize() {

        return size;
    }

    public void setSize(Size size) {

        this.size = size;
    }

    public boolean isRellena() {

        return rellena;
    }

    public void setRellena(boolean rellena) {

        this.rellena = rellena;
    }

    public boolean isCebolla() {

        return cebolla;
    }

    public void setCebolla(boolean cebolla) {

        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {

        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {

        this.sinGluten = sinGluten;
    }

    public TipoRecogida getRecogida() {

        return recogida;
    }

    public void setRecogida(TipoRecogida recogida) {

        this.recogida = recogida;
    }

    @Override
    public String toString() {
        return "Pizzas: " +
                "tipo de masa= " + tipoMasa +
                ", tamaño= " + size +
                ", rellena= " + rellena +
                ", cebolla= " + cebolla +
                ", sinGluten= " + sinGluten +
                ", recogida= " + recogida;
    }
}
