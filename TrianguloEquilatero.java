public class TrianguloEquilatero extends FiguraGeometrica {
    private double lado;
    private final String tipo = "Triangulo Equilatero";

    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public String getDetalhes() {
        String details = "Lados: " + this.lado;

        return details;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();

        info += ", Tipo: " + this.tipo;
        info += ", Lados: " + this.lado;
        info += ", Area: " + this.calcularArea();
        info += ", Perimetro: " + this.calcularPerimetro();

        return info;
    }

    @Override
    public double calcularArea() {
        return (Math.sqrt(3) / 4) * Math.pow(2, lado);
    }

    @Override
    public double calcularPerimetro() {
        return 3 * lado;
    }

    /**
     * @return double return the lado
     */
    public double getLado() {
        return lado;
    }

    /**
     * @param lado the lado to set
     */
    public void setLado(double lado) {
        this.lado = lado;
    }
}
