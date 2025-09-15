public abstract class FiguraGeometrica implements CalculosGeometricos {
    private static int counterId = 0;

    private int id;
    private String color;
    private final String tipo = "Figura";

    FiguraGeometrica() {

    }

    FiguraGeometrica(String color) {
        this.color = color;
        this.id = FiguraGeometrica.counterId;
        FiguraGeometrica.counterId++;
    }

    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    public String getTipoFigura() {
        return this.tipo;
    }

    /**
     * @return int return the figureID
     */
    public int getFigureID() {
        return this.id;
    }

    /**
     * @return String return the color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 
     * @return figure info as color and ID
     */
    public String getInfo() {
        String info = "ID: " + this.id + ", ";
        info += "Cor: " + this.color;

        return info;
    }

    /**
     * 
     * @return the total of figures
     */
    public static int getTotalFiguras() {
        return FiguraGeometrica.counterId;
    }

    public abstract String getDetalhes();
}
