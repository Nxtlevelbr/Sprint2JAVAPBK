package classesPBK;

public class Login {
	
	 	private String cpf;
	    private String senha;
	    private String alterarSenha;

	    public Login( String cpf, String senha, String alterarSenha) {
	        this.cpf = cpf;
	        this.senha= senha;
	        this.alterarSenha = alterarSenha;    
	    }
		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getAlterarSenha() {
			return alterarSenha;
		}

		public void setAlterarSenha(String alterarSenha) {
			this.alterarSenha = alterarSenha;
		}

}
