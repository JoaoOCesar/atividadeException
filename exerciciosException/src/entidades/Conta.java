package entidades;

public class Conta {
	private float saldo;
	private float valorLimite;
	private int codigo;

	//------- Inicio Getters and Setters--------
	
	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getValorLimite() {
		return valorLimite;
	}

	public void setValorLimite(float valorLimite) {
		this.valorLimite = valorLimite;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//------- Fim Getters and Setters--------

	public void Sacar(float saque) throws ContaExcecao {
		if(saque>saldo) {
			throw new ContaExcecao("Saque invalido! Saque maior que o saldo atual");
		}else {
			float resultado;
			resultado = saque - saldo;
		}
	}
	
	

}
