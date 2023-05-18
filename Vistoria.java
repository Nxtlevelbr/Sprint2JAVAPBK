package classesPBK;

public class Vistoria {
	
		private String descricaoBicicleta;
		private String observacoes;
		private String fotosBicicleta;

		public Vistoria(String descricaoBicicleta, String observacoes, String fotosBicicleta)  {
	        this.descricaoBicicleta = descricaoBicicleta;
	        this.observacoes = observacoes;
	        this.fotosBicicleta = fotosBicicleta; 
	    }

	    public String getDescricaoBicicleta() {
	        return descricaoBicicleta;
	    }

	    public void setDescricaoBicicleta(String descricaoBicicleta) {
	        this.descricaoBicicleta = descricaoBicicleta;
	    }

	    public String getObservacoes() {
	        return observacoes;
	    }

	    public void setObservacoes(String observacoes) {
	        this.observacoes = observacoes;
	    }

	    public String getFotosBicicleta() {
	        return fotosBicicleta;
	    }

	    public void setFotosBicicleta(String fotosBicicleta) {
	        this.fotosBicicleta = fotosBicicleta;
	    }

}
