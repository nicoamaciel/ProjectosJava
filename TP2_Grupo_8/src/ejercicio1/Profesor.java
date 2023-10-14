package ejercicio1;


//HERENCIA DE EMPLEADO
public class Profesor extends Empleado implements Comparable<Profesor>{
	//ENCAPSULAMIENTO
	private String cargo;
	private int antiguedadDocente;
	
	//CONSTRUCTOR 1 
	Profesor()
	{
		
	}
	
	//CONSTRUCTOR 2
	public Profesor(String cargo, int antiguedadDocente) {
		super();
		this.cargo = cargo;
		this.antiguedadDocente = antiguedadDocente;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + antiguedadDocente;
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		return result;
	}

	
	//METODO EQUALS
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		if (antiguedadDocente != other.antiguedadDocente)
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		return true;
	}

	//getters and setters
	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getAntiguedadDocente() {
		return antiguedadDocente;
	}

	public void setAntiguedadDocente(int antiguedadDocente) {
		this.antiguedadDocente = antiguedadDocente;
	}

	//TO STRING  id, nombre, edad, cargo y antiguedadDocente
	@Override
	public String toString() {
		return "Profesor Cargo=" + cargo + ", Antiguedad=" + antiguedadDocente + ", Nombre=" + getNombre()
				+ ", Edad=" + getEdad() + ", Id=" + getId() + " ";
	}

	


	//DESARROLLAR PARA PUNTO 6
	@Override
	public int compareTo(Profesor prof) {
		 int comparacionPorNombre = this.cargo.compareTo(prof.cargo);
	        if (comparacionPorNombre != 0) {
	            return comparacionPorNombre;
	        }
	        // Si los nombres son iguales, compara por edad
	        return Integer.compare(this.antiguedadDocente, prof.antiguedadDocente);
	    }
	}

	
	
	

