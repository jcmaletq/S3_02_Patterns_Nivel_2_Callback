package tiendas;

import llamada.*;
import tareas.*;
import javax.swing.JOptionPane;
public class zapateria implements int_tiendas{
	@Override
	public void envio() {
		// TODO Auto-generated method stub
		String forma_pago;
		System.out.println("Operación en tienda");
		forma_pago = (JOptionPane.showInputDialog
				("introudce metodo de pago en tienda ","tarjeta, paypal, debito, efectivo").toUpperCase());
		if (forma_pago.equals("TARJETA")) {
		new pago_tarjeta().ejecutar_pago(new int_pasarella() {
			@Override 
			public void pago() {
				System.out.println("   cobro en terminal del pago con tarjeta");
			}
		});
		}
		else if (forma_pago.equals("PAYPAL")){
		new pago_paypal().ejecutar_pago(new int_pasarella() {
			@Override 
			public void pago() {
				System.out.println("  pide cuenta paypal");
			}
		});	
		}
		else if (forma_pago.equals("DEBITO")){
			new pago_debito().ejecutar_pago(new int_pasarella() {
				@Override 
				public void pago() {
					System.out.println("  pide cuenta para el pago por debito");
				}
			});	
			}
		else if (forma_pago.equals("EFECTIVO")){
			System.out.println("cobro en efectivo");	
			}
		else {System.out.println("forma de pago no reconocida");}
	}

}
