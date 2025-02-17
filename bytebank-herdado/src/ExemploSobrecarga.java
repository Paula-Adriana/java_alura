
public class ExemploSobrecarga {
	/*
	 * Existe um outro conceito nas linguagens OO que se chama de sobrecarga que �
	 * muito mais simples do que a sobrescrita e nem dependente da heran�a.
	 * 
	 * Por exemplo, na nossa classe Gerente, imagine um outro novo m�todo autentica
	 * que recebe al�m da senha tamb�m o login: public class Gerente extends
	 * Funcionario {
	 * 
	 * private int senha;
	 * 
	 * public void setSenha(int senha) { this.senha = senha; }
	 * 
	 * public boolean autentica(int senha) { if(this.senha == senha) { return true;
	 * } else { return false; } }
	 * 
	 * //novo m�todo, recebendo dois params public boolean autentica(String login,
	 * int senha) { //implementacao omitida }
	 * 
	 * //outros m�todos omitidos }
	 * 
	 * Repare que criamos uma nova vers�o do m�todo
	 * autentica. Agora temos dois m�todos autentica na mesma classe que variam na
	 * quantidade ou tipos de par�metros. Isso se chama sobrecarga de m�todos.
	 * 
	 * A sobrecarga n�o leva em conta a visibilidade ou retorno do m�todo, apenas os
	 * par�metros e n�o depende da heran�a.
	 */
}
