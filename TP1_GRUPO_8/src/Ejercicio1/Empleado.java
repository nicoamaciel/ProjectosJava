package Ejercicio1;

public class Empleado {
	
	//SE CREAN LAS VARIABLES Y SE ENCAPSULAN
	private int id;
	private String nombre;
	private int edad;

	static int contador=1000;
	
	//Desarrollo del constructor 1
	public Empleado()
	{
		contador++;
		
		this.id=contador;
		this.nombre="sin nombre";
		this.edad=99;
	}
	//DESARROLLO DEL CONSTRUCTOR 2
	
	public Empleado(String nom,int edad)
	{
		contador++;
		
		this.id=contador;
		this.edad=edad;
		this.nombre=nom;
	}

	
	//getter and setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	//método estático
	
		public static int devuelveProximoId()
		{
			return contador +1;
		}

	//toString()	
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
		}
	
}
