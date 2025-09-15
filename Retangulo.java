public class Retangulo extends FiguraGeometrica {
    private double largura;
    private double altura;
    private final String tipo = "Retangulo";

    public Retangulo(String cor, double largura, double altura) {
        super(cor); 
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();

        info += ", Tipo: " + this.tipo;
        info += ", Largura: " + this.largura;
        info += ", Altura: " + this.altura;
        info += ", Area: " + this.calcularArea();
        info += ", Perimetro: " + this.calcularPerimetro();

        return info;
    }

    @Override
    public String getDetalhes() {
        String details = "Largura: " + this.largura + ", Altura: " + this.altura;
        return details;
    }
}