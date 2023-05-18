package classesPBK;

public class Pagamento {
	
		private String dataPagamento;
		private String  formaPagamento;
		private float valorPagamento;
		private String numeroCartaoCredito;
		private String codigoSeguranca;
		private String nomeTitularCartao;
		private String dadosBancarios;
	
		public Pagamento(String dataPagamento, String formaPagamento, float valorPagamento, String numeroCartaoCredito, String codigoSeguranca, String nomeTitularCartao, String dadosBancarios) {
	        this.dataPagamento = dataPagamento;
	        this.formaPagamento = formaPagamento;
	        this.valorPagamento = valorPagamento;
	        this.numeroCartaoCredito = numeroCartaoCredito;
	        this.codigoSeguranca = codigoSeguranca;
	        this.nomeTitularCartao = nomeTitularCartao;
	        this.dadosBancarios = dadosBancarios;
	    }

	    public String getDataPagamento() {
	        return dataPagamento;
	    }

	    public void setDataPagamento(String dataPagamento) {
	        this.dataPagamento = dataPagamento;
	    }

	    public String getFormaPagamento() {
	        return formaPagamento;
	    }

	    public void setFormaPagamento(String formaPagamento) {
	        this.formaPagamento = formaPagamento;
	    }

	    public double  getValorPagamento() {
	        return valorPagamento;
	    }

	    public void setValorPagamento(float valorPagamento) {
	        this.valorPagamento = valorPagamento;
	    }

	    public String getNumeroCartaoCredito() {
	        return numeroCartaoCredito;
	    }

	    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
	        this.numeroCartaoCredito = numeroCartaoCredito;
	    }

	    public String getCodigoSeguranca() {
	        return codigoSeguranca;
	    }

	    public void setCodigoSeguranca(String codigoSeguranca) {
	        this.codigoSeguranca = codigoSeguranca;
	    }

	    public String getNomeTitularCartao() {
	        return nomeTitularCartao;
	    }

	    public void setNomeTitularCartao(String nomeTitularCartao) {
	        this.nomeTitularCartao = nomeTitularCartao;
	    }
	    public String getdadosBancarios() {
	        return dadosBancarios;
	    }

	    public void setdadosBancarios(String dadosBancarios) {
	        this.dadosBancarios = dadosBancarios;
	    }
}
