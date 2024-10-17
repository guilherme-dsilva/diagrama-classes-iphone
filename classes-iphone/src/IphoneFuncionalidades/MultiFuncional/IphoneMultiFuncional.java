package IphoneFuncionalidades.MultiFuncional;
import IphoneFuncionalidades.AparelhoTelefonico.AparelhoTelefonico;
import IphoneFuncionalidades.NavegadorInternet.NavegadorInternet;
import IphoneFuncionalidades.ReprodutorMusical.ReprodutorMusical;

public class IphoneMultiFuncional implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	
	public void tocar() {
		System.out.println("Tocando musica pelo Iphone");
	}
	public void pausar() {
		System.out.println("Pausando musica pelo Iphone");
	}
	public void selecionarMusica() {
		System.out.println("Selecionando musica pelo Iphone");
	}
	public void ligar() {
		System.out.println("Ligando pelo Iphone");
	}
	
	public void atender() {
		System.out.println("Atendendo pelo Iphone");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz pelo Iphone");
	}
	
	public void exibirPagina() {
		System.out.println("Exibindo nova página pelo Iphone");
	}
	
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba pelo Iphone");
	}
	
	public void atualizarPagina() {
		System.out.println("Atualizando a pagina pelo Iphone");
	}
}
