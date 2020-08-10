package aula04;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public ContaBanco() { 
		this.setSaldo(0);
		this.setStatus(false);
	}
	
	public void estadoAtual() {
		System.out.println("============================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("============================");
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.setSaldo(50);
		}
		else if (t == "CP") {
			this.setSaldo(150);
		}
		
		System.out.println("Conta aberta com sucesso!");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta está com dinheiro!");
		}
		else if (this.getSaldo() < 0) {
			System.out.println("Conta está em débito!");
		}
		else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso!");
		}
	}
	
	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() + valor); 	// saldo = saldo + valor
			System.out.println("Depósito realizado na conta de " + this.getDono() + "!");
		}
		else {
			System.out.println("Conta não está aberta para o depósito!");
		}
	}
	
	public void sacar(float valor) {		
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor); 	// saldo = saldo - valor
				System.out.println("Saque realizado na conta de " + this.getDono() + "!");
			}
			else {
				System.out.println("Saldo insuficiente para o saque!");
			}
		}
		else {
			System.out.println("Conta não está aberta para o saque!");
		}
	}
	
	public void pagarMensal() {	
		float valorMensal = 0;
		
		if (this.getTipo() == "CC") {
			valorMensal = 12;
		}		
		else if (this.getTipo() == "CF") {
			valorMensal = 20;
		}
		if (this.getStatus()) {		
			this.setSaldo(this.getSaldo() - valorMensal); // saldo = saldo - valorMensal
			
			System.out.println("Mensalidade paga com sucesso na conta de " + this.getDono() + " !");
			
		}
		else {
			System.out.println("Conta não está aberta para a mensalidade!");
		}
		
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}	
}
