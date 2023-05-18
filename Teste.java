package classesPBK;

public class Teste {

	public static void main(String[] args) {
       //teste1 CLIENTE 
		Cliente c1 = new Cliente("ANNA", "665443323", "ANNA.EMAIL", "RG543232", "1198876655", "CEP644554", "19/08/05", "enderecoanna");
			System.out.println("Nome: " + c1.getNome ());
			System.out.println("Cpf: " + c1.getCpf ());
			System.out.println("Enail: " + c1.getEmail ());
			System.out.println("RG: " + c1.getRg ());
			System.out.println("Fone: " + c1.getFone());
			System.out.println("CEP: " + c1.getCep());
			System.out.println("Data de Nascimento: " + c1.getDataNascimento());
			System.out.println("Endereço: " + c1.getEndereco());
		//TESTE 2 BICICLETA 
			Bike b1 = new Bike(null, 0, null, null, null, null, null, null, 0, 0, 0, null, 0, 0, null, null, 0 );
				System.out.println("Tamanho do quadro: " + b1.getTamanhoQuadro());
				System.out.println("Tipo do quadro: " + b1.getTipoQuadro());
				System.out.println("Quantidade de marchas: " + b1.getQuantidadeMarcha());
				System.out.println("Tipo de suspensão: " + b1.getTipoSuspensao());
				System.out.println("Tipo de freio: " + b1.getTipoFreio());
				System.out.println("Utilização para: " + b1.getUtilizaPara());
				System.out.println("Modalidade: " + b1.getModalidade());
				System.out.println("Marca: " + b1.getMarca());
				System.out.println("Modelo: " + b1.getModelo());
				System.out.println("Valor: " + b1.getValor());
				System.out.println("Número de série: " + b1.getNumeroSerie());
				System.out.println("Ano de fabricação: " + b1.getAnoFabricacao());
				System.out.println("Acessório: " + b1.getAcessorio());
				System.out.println("Média de utilização: " + b1.getMediaUtilizacao());
				System.out.println("Tamanho do pneu: " + b1.getTamanhoPneu());
				System.out.println("Tipo de pneu: " + b1.getTipoPneu());
				System.out.println("Nota fiscal: " + b1.getNotaFiscal());
		//TESTE 3- VISTORIA
		Vistoria v1 = new Vistoria(null, null, null);
			System.out.println("Descrição da bicicleta: " + v1.getDescricaoBicicleta());
			System.out.println("Observações: " + v1.getObservacoes());
			System.out.println("Fotos da bicicleta: " + v1.getFotosBicicleta());

      //TESTE 4-  PLANO
		Plano p1 = new Plano(null,null,0,null,null);
			System.out.println("Nome do Plano: " + p1.getNomePlano());
			System.out.println("Cobertura: " + p1.getCobertura());
			System.out.println("Valor da Cobertura: " + p1.getValorCobertura());
			System.out.println("Período de Cobertura: " + p1.getPeriodoCobertura());
			System.out.println("Exclusões: " + p1.getExclusoes());

      //TESTE 5- PAGAMENTO 
		Pagamento pg1 = new Pagamento(null,null,0, null,null,null,null);
			System.out.println("Data do pagamento: " + pg1.getDataPagamento());
			System.out.println("Forma de pagamento: " + pg1.getFormaPagamento());
			System.out.println("Valor do pagamento: " + pg1.getValorPagamento());
			System.out.println("Número do cartão de crédito: " + pg1.getNumeroCartaoCredito());
			System.out.println("Código de segurança: " + pg1.getCodigoSeguranca());
			System.out.println("Nome do titular do cartão: " + pg1.getNomeTitularCartao());
			System.out.println("Dados bancários: " + pg1.getdadosBancarios());

	 //TESTE 6 - APOLICE 
			Apolice a1= new Apolice (0, null,null,0);
				System.out.println("Número: " + a1.getNumero());
				System.out.println("Titular: " + a1.getTitular());
				System.out.println("Vigência: " + a1.getVigencia());
				System.out.println("Valor Segurado: " + a1.getValorSegurado());


	 //TESTE 7- CHATBOT
			Chatbot cb1 = new Chatbot(null, null, null, null);
				System.out.println("Histórico: " + cb1.getHistorico());
				System.out.println("Conhecimento: " + cb1.getConhecimento());;
				System.out.println("Linguagem: " + cb1.getLinguagem());
				System.out.println("Personalização: " + cb1.getPersonalizacao());
				
      //TESTE 8- LOGIN 
			Login l1 = new Login(null, null, null);
			System.out.println("Cpf: " + l1.getCpf ());
			System.out.println("Senha: " + l1.getSenha());
			System.out.println("Alterar senha: " + l1.getAlterarSenha());
			
  }
}