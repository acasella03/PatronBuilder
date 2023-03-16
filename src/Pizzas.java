/**
 * Caracteríaticas de la Pizza.
 */
public class Pizzas {

    private TipoMasa tipoMasa;
    private Size size;
    private boolean rellena;
    private boolean salsa;
    private TipoSalsa tipoSalsa;
    private boolean cebolla;
    private boolean sinGluten;
    private boolean extraQueso;
    private boolean pineapple;
    private boolean mushrooms;
    private boolean jamon;
    private TipoRecogida recogida;

    public Pizzas() {
        this.cebolla = true;
        this.recogida = TipoRecogida.TIENDA;
        this.rellena = false;
        this.salsa = true;
        this.tipoSalsa = TipoSalsa.TOMATE;
        this.sinGluten = false;
        this.extraQueso = false;
        this.pineapple = false;
        this.mushrooms = false;
        this.jamon = false;
        this.size = Size.MEDIUM;
        this.tipoMasa = TipoMasa.FINA;
    }

    /**
     * Constructor con todos los parametros
     *
     * @param tipoMasa   espesor de la masa
     * @param size       tamaño de la pizza
     * @param rellena    si el borde esta relleno de queso
     * @param salsa      lleva o no lleva
     * @param tipoSalsa  tipo de salsa
     * @param cebolla    lleva o no lleva
     * @param sinGluten  para celíacos
     * @param extraQueso lleva o no lleva
     * @param pineapple  lleva o no lleva
     * @param mushrooms  lleva o no lleva
     * @param jamon      lleva o no
     * @param recogida   como lo va a recoger el cliente
     */
    public Pizzas(TipoMasa tipoMasa, Size size, boolean rellena, boolean salsa, TipoSalsa tipoSalsa, boolean cebolla, boolean sinGluten, boolean extraQueso, boolean pineapple, boolean mushrooms, boolean jamon, TipoRecogida recogida) {
        this.tipoMasa = tipoMasa;
        this.size = size;
        this.rellena = rellena;
        this.salsa = salsa;
        this.tipoSalsa = tipoSalsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
        this.pineapple = pineapple;
        this.mushrooms = mushrooms;
        this.jamon = jamon;
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

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public boolean isCebolla() {

        return cebolla;
    }

    public TipoSalsa getTipoSalsa() {
        return tipoSalsa;
    }

    public void setTipoSalsa(TipoSalsa tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
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

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    public boolean isPineapple() {
        return pineapple;
    }

    public void setPineapple(boolean pineapple) {
        this.pineapple = pineapple;
    }

    public boolean isMushrooms() {
        return mushrooms;
    }

    public void setMushrooms(boolean mushrooms) {
        this.mushrooms = mushrooms;
    }

    public boolean isJamon() {
        return jamon;
    }

    public void setJamon(boolean jamon) {
        this.jamon = jamon;
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
                "Masa= " + tipoMasa +
                ", tamaño= " + size +
                ", rellena= " + rellena +
                ", salsa= " + tipoSalsa +
                ", cebolla= " + cebolla +
                ", para celiacos= " + sinGluten +
                ", extraQueso= " + extraQueso +
                ", piña= " + pineapple +
                ", champiñones= " + mushrooms +
                ", jamón= " + jamon +
                ", recogida=" + recogida
                ;
    }
}
