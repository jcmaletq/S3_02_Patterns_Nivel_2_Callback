package tiendas;

import llamada.*;
import tareas.*;
import javax.swing.JOptionPane;
public class web_zapateria implements int_tiendas{
	@Override
	public void envio() {
		// TODO Auto-generated method stub
		String forma_pago;
		System.out.println("Operación en web");
		forma_pago = (JOptionPane.showInputDialog
				("introudce metodo de pago en web ","tarjeta, paypal, debito").toUpperCase());
		if (forma_pago.equals("TARJETA")) {
		new pago_tarjeta().ejecutar_pago(new int_pasarella() {
			@Override 
			public void pago() {
				System.out.println("  API gestion tarjeta");
			}
		});
		}
		else if (forma_pago.equals("PAYPAL")){
		new pago_paypal().ejecutar_pago(new int_pasarella() {
			@Override 
			public void pago() {
				System.out.println("  API gestion cuenta paypal");
			}
		});	
		}
		else if (forma_pago.equals("DEBITO")){
			new pago_debito().ejecutar_pago(new int_pasarella() {
				@Override 
				public void pago() {
					System.out.println("  API gestion cuenta cliente  pago por debito");
				}
			});	
			}
		else {System.out.println("forma de pago no reconocida");}
	}

}
