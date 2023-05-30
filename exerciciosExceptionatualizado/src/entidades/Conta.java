package entidades;

public class Conta {
	private float saldo;
	private float valorLimite;
	private int codigo;

	// ------- Inicio Getters and Setters--------

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

	// ------- Fim Getters and Setters--------

	// metodo que adiciona o valor deposito ao saldo.
	public void depositar(float deposito) {
		float resultado;
		resultado = deposito + saldo;
		this.saldo = resultado;
	}

	// metodo sacar que remove de saldo, mas antes verifica se se o saque é maior
	// que o saldo... caso for, ele joga uma excessão, senão ele entra no else e
	// verifica se o valor do saque é maior que o limite de saque e, novamente, caso
	// seja, ele joga um excessao para o limite sendo menor que o saque.
	public void Sacar(float saque) throws ContaExcecao {
		if (saque > saldo) {
			throw new ContaExcecao("Saque invalido! Saque maior que o saldo atual");
		} else {
			if (saque > valorLimite) {
				throw new ContaExcecao(
						"Saque invalido! Saque maior que o Limite. Saque até: R$" + valorLimite + " por vez.");
			} else {
				float resultado;
				resultado = saldo - saque;
				this.saldo = resultado;
			}
		}
	}

}
