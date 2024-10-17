package IphoneFuncionalidades.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico{
	
	public void ligar() {
		System.out.println("Ligando pelo Phone");
	}
	
	public void atender() {
		System.out.println("Atendendo pelo Phone");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}
}
