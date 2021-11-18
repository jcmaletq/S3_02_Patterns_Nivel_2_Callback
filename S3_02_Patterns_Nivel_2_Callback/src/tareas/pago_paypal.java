package tareas;

import llamada.*;

public class pago_paypal extends Abstract_Task {

	@Override
	public void ejecutar_pago(int_pasarella metodo) {
     metodo.pago();
     System.out.println("ejecutado via paypal");
	}
	

}
