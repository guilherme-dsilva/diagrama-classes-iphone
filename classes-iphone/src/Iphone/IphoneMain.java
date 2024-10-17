package Iphone;
import IphoneFuncionalidades.AparelhoTelefonico.Phone;

import IphoneFuncionalidades.MultiFuncional.IphoneMultiFuncional;
import IphoneFuncionalidades.NavegadorInternet.GoogleMaps;
import IphoneFuncionalidades.NavegadorInternet.Safari;
import IphoneFuncionalidades.NavegadorInternet.Widgets;
import IphoneFuncionalidades.ReprodutorMusical.Ipod;

public class IphoneMain {
	
public static void main(String[] args) {
		
		IphoneMultiFuncional iphone = new IphoneMultiFuncional();
		Phone phone = new Phone();
		Ipod ipod = new Ipod();
		Safari safari = new Safari();
		Widgets widgets = new Widgets();
		GoogleMaps maps = new GoogleMaps();
		
		maps.adicionarNovaAba();
	}
}
