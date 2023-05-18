package classesPBK;

public class Apolice {
	private int numero;
    private String titular;
    private String vigencia;
    private float valorSegurado;

    public Apolice(int numero, String titular, String vigencia, float valorSegurado) {
        this.numero = numero;
        this.titular = titular;
        this.vigencia = vigencia;
        this.valorSegurado = valorSegurado;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public double getValorSegurado() {
        return valorSegurado;
    }

    public void setValorSegurado(float valorSegurado) {
        this.valorSegurado = valorSegurado;
    }
}
