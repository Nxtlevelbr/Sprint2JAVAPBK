package classesPBK;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
		private int id;
		private String nome;
	    private String cpf;
	    private String rg;
	    private String dataNascimento;
	    private String email;
	    private String fone;
	    private String cep;
	    private String endereco;
	    private arrayList<bike> bicicletas;
	    
	    public Cliente(int id, String nome, String cpf, String rg, String email, String fone, String dataNascimento, String cep, String endereco) {
	        this.id = id;
	    	this.nome = nome;
	        this.cpf = cpf;
	        this.rg= rg;
	        this.email = email;
	        this.fone = fone;
	        this.dataNascimento = dataNascimento;
	        this.cep= cep;
	        this.endereco= endereco;
	        this.bicicletas = new ArrayList<>();
	    }
	    
	    public void cadastrarBike(Bike bike) {
	    	bicicletas.add(bike);
	    }
	    public int getId() {
	    	return id;
	    }
	    
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getFone() {
	        return fone;
	    }

	    public void setFone(String fone) {
	        this.fone = fone;
	    }
	    
	    public String getCep() {
	        return cep;
	    }

	    public void setcep(String cep) {
	        this.cep = cep;
	    }
	    
	    public String getEndereco() {
	        return endereco;
	    }

	    public void setEndereco(String endereco) {
	        this.endereco = endereco;
	    }
	    
	    public String getRg() {
	        return rg;
	    }

	    public void setRg(String rg) {
	        this.rg = rg;
	    }

		public String getDataNascimento() {
			return dataNascimento;
		}
		 public void setDataNascimento(String  dataNascimento ) {
		        this.dataNascimento = dataNascimento;
		}
}
