package tareas;

import llamada.*;

public class pago_tarjeta extends Abstract_Task {

	@Override
	public void ejecutar_pago(int_pasarella metodo) {
     metodo.pago();
     System.out.println("pagado via tarjeta");
	}
	

}
