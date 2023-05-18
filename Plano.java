package classesPBK;

public class Plano {
	
		private String nomePlano;
	    private String cobertura;
	    private double valorCobertura;
	    private String periodoCobertura;
	    private String exclusoes;
	
	    public Plano (String nomePlano, String cobertura, double valorCobertura, String periodoCobertura, String exclusoes) {
	        this.nomePlano = nomePlano;
	        this.cobertura = cobertura;
	        this.valorCobertura = valorCobertura;
	        this.periodoCobertura = periodoCobertura;
	        this.exclusoes = exclusoes;
	    }
	
	    public String getNomePlano() {
	        return nomePlano;
	    }
	
	    public void setNomePlano(String nomePlano) {
	        this.nomePlano = nomePlano;
	    }
	
	    public String getCobertura() {
	        return cobertura;
	    }
	
	    public void setCobertura(String cobertura) {
	        this.cobertura = cobertura;
	    }
	
	    public double getValorCobertura() {
	        return valorCobertura;
	    }
	
	    public void setValorCobertura(double valorCobertura) {
	        this.valorCobertura = valorCobertura;
	    }
	
	    public String getPeriodoCobertura() {
	        return periodoCobertura;
	    }
	
	    public void setPeriodoCobertura(String periodoCobertura) {
	        this.periodoCobertura = periodoCobertura;
	    }
	
	    public String getExclusoes() {
	        return exclusoes;
	    }
	
	    public void setExclusoes(String exclusoes) {
	        this.exclusoes = exclusoes;
	    }
}
