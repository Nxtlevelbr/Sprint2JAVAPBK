package classesPBK;

public class Chatbot {
	private String historico;
	private String conhecimento;
	private String linguagem;
	private String personalizacao;
	
	 public Chatbot(String historico, String conhecimento, String linguagem, String personalizacao) {
	        this.historico = historico;
	        this.conhecimento = conhecimento;
	        this.linguagem = linguagem;
	        this.personalizacao = personalizacao;
	    }

	    public String getHistorico() {
	        return historico;      
	    }

	    public void setHistorico(String historico) {
	        this.historico = historico;
	    }

	    public String getConhecimento() {
	        return conhecimento;
	    }

	    public void setConhecimento(String conhecimento) {
	        this.conhecimento = conhecimento;
	    }

	    public String getLinguagem() {
	        return linguagem;
	    }

	    public void setLinguagem(String linguagem) {
	        this.linguagem = linguagem;
	    }

	    public String getPersonalizacao() {
	        return personalizacao;
	    }

	    public void setPersonalizacao(String personalizacao) {
	        this.personalizacao = personalizacao;
	    }
}
