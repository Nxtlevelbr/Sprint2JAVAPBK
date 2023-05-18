package classesPBK;

public class Bike {
	private int tamanhoQuadro;
	private String tipoQuadro;
	private int quantidadeMarcha;
	private String tipoSuspensao;
	private String tipoFreio;
	private String utilizaPara;
	private String modalidade;
	private String marca;
	private String modelo;
	private double valor;
	private int numeroSerie;
	private int anoFabricacao;
	private String acessorio;
	private int mediaUtilizacao;
	private int tamanhoPneu;
	private String tipoPneu; 
	private String notaFiscal;
	
	public Bike(String tipoQuadro, int quantidadeMarcha, String tipoSuspensao, String tipoFreio, String utilizaPara, String modalidade, String marca, String modelo, double valor, int numeroSerie, int anoFabricacao, String acessorio, int mediaUtilizacao, int tamanhoPneu, String tipoPneu, String notaFiscal, int tamanhoQuadro) {
	    this.tamanhoQuadro = tamanhoQuadro;
	    this.tipoQuadro = tipoQuadro;
	    this.quantidadeMarcha = quantidadeMarcha;
	    this.tipoSuspensao = tipoSuspensao;
	    this.tipoFreio = tipoFreio;
	    this.utilizaPara = utilizaPara;
	    this.modalidade = modalidade;
	    this.marca = marca;
	    this.modelo = modelo;
	    this.valor = valor;
	    this.numeroSerie = numeroSerie;
	    this.anoFabricacao = anoFabricacao;
	    this.acessorio = acessorio;
	    this.mediaUtilizacao = mediaUtilizacao;
	    this.tamanhoPneu = tamanhoPneu;
	    this.tipoPneu = tipoPneu;
	    this.notaFiscal = notaFiscal;
	}





	public int getTamanhoQuadro() {
	    return tamanhoQuadro;
	}

	public void setTamanhoQuadro(int tamanhoQuadro) {
	    this.tamanhoQuadro = tamanhoQuadro;
	}

	public String getTipoQuadro() {
	    return tipoQuadro;
	}

	public void setTipoQuadro(String tipoQuadro) {
	    this.tipoQuadro = tipoQuadro;
	}

	public int getQuantidadeMarcha() {
	    return quantidadeMarcha;
	}

	public void setQuantidadeMarcha(int quantidadeMarcha) {
	    this.quantidadeMarcha = quantidadeMarcha;
	}

	public String getTipoSuspensao() {
	    return tipoSuspensao;
	}

	public void setTipoSuspensao(String tipoSuspensao) {
	    this.tipoSuspensao = tipoSuspensao;
	}

	public String getTipoFreio() {
	    return tipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
	    this.tipoFreio = tipoFreio;
	}

	public String getUtilizaPara() {
	    return utilizaPara;
	}

	public void setUtilizaPara(String utilizaPara) {
	    this.utilizaPara = utilizaPara;
	}

	public String getModalidade() {
	    return modalidade;
	}

	public void setModalidade(String modalidade) {
	    this.modalidade = modalidade;
	}

	public String getMarca() {
	    return marca;
	}

	public void setMarca(String marca) {
	    this.marca = marca;
	}

	public String getModelo() {
	    return modelo;
	}

	public void setModelo(String modelo) {
	    this.modelo = modelo;
	}



	public int getNumeroSerie() {
	    return numeroSerie;
	}
	public void setNumeroSerie(int numeroSerie) {
	    this.numeroSerie = numeroSerie;
	}

	public int getAnoFabricacao() {
	    return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
	    this.anoFabricacao = anoFabricacao;
	}


	public String getAcessorio() {
	    return acessorio;
	}
	public void setAcessorio(String acessorio) {
	    this.acessorio = acessorio;
	}


	public int getMediaUtilizacao() {
	    return mediaUtilizacao;
	}
	public void setMediaUtilizacao(int mediaUtilizacao) {
	    this.mediaUtilizacao = mediaUtilizacao;
	}

	public int getTamanhoPneu() {
	    return tamanhoPneu;
	}
	public void setTamanhoPneu(int tamanhoPneu) {
	    this.tamanhoPneu = tamanhoPneu;
	}

	public String getTipoPneu() {
	    return tipoPneu;
	}
	public void setTipoPneu(String tipoPneu) {
	    this.tipoPneu = tipoPneu;
	}


	public String getNotaFiscal() {
	    return notaFiscal;
	}

	public void setNotaFiscal(String notaFiscal) {
	    this.notaFiscal = notaFiscal;
	}

	public void setValor(double valor) {
	    this.valor = valor;
	}
	public double getValor() {
	    return valor;

	}
}
