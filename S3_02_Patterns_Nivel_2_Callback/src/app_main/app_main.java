package app_main;
import llamada.*;
import tareas.*;
import tiendas.*;
public class app_main {
/*
 * Callback
 * Simula una passarel·la de pagament que rebi un objecte encapsulador del mètode de pagament a efectuar: 
 * 		targeta de crèdit, Paypal o deute en compte bancari.
 * La passarel·la invocarà el pagament sense conèixer la forma i retornant el control a la classe d'origen.
 * La classe que invoca la passarel·la de pagament serà una botiga de sabates.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// añadido efectivo para comprobar que no usa los metodos		
		zapateria compra_z = new zapateria();
		compra_z.envio();
	// añadido compra online para comprobar 	
		web_zapateria compra_w = new web_zapateria();
		compra_w.envio();
	}

}
