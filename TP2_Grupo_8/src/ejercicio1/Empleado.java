package ejercicio1;

public class Empleado {
	//SE CREAN LAS VARIABLES Y SE ENCAPSULAN
    private int id;
    private String nombre;
    private int edad;

    static int contador=1000;
    
    //DESARROLLO DEL CONSTRUCTOR 1
    public Empleado()
    {
        contador++;
       
        this.id=contador;
        this.nombre="sin nombre";
        this.edad=35;
    }
    //DESARROLLO DEL CONSTRUCTOR 2
	
  	public Empleado(String nom,int edad)
  	{
  		contador++;
  		
  		this.id=contador;
  		this.edad=edad;
  		this.nombre=nom;
  	}

  	//método estático

  	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + id;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

  	
  	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		if (edad != other.edad)
			return false;
		if (id != other.id)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	public static int devuelveProximoId()
  	{
  		return contador +1;
  	}


  	
  	

    
    //getter and setter
    public String getNombre() {
        return nombre;
    }

  	//toString()
    @Override
	public String toString() {
		return "Empleado id=" + id + ", nombre=" + nombre + ", edad=" + edad + " ";
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

    

}
