package Ejercicio1;



public class Principal {

	public static void main(String[] args) {
		
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("Juan Perez",33);
		Empleado empleado3 = new Empleado("Carlos Rodriguez",40);
		Empleado empleado4 = new Empleado("Maria Gonzalez",38);
		Empleado empleado5 = new Empleado();
		
		Empleado[] vEmpleados = new Empleado[5];
		vEmpleados[0] = empleado1;
		vEmpleados[1] = empleado2;
		vEmpleados[2] = empleado3;
		vEmpleados[3] = empleado4;
		vEmpleados[4] = empleado5;
		
		for (Empleado e : vEmpleados) {
			System.out.println(e.toString());
		}
	
		System.out.println(Empleado.devuelveProximoId());
	
	}
	

}
