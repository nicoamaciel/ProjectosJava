package ejercicio1;


import java.util.Iterator;
//import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

public class mainEjercicio1_b {

	public static void main(String[] args) {

		
		//PUNTO 5 Y 6
		Set<Profesor> listaProfesor=new TreeSet<Profesor>();
		
		
		
		Profesor p=new Profesor("Profesor",5);
		Profesor p2=new Profesor("Ayudante",2);
		Profesor p3=new Profesor("Profesor",3);
		Profesor p4=new Profesor("Profesor",5);
		Profesor p5=new Profesor("Ayudante",1);
		
		
		listaProfesor.add(p);
		listaProfesor.add(p2);
		listaProfesor.add(p3);
		listaProfesor.add(p4);
		listaProfesor.add(p5);
		
		Iterator<Profesor> iterator = listaProfesor.iterator();

        while (iterator.hasNext()) {
            Profesor prof = iterator.next();
            System.out.println(prof);
        }
		
		//PUNTO 7
		
		
		Profesor profe=new Profesor("Profesor",20);
		Profesor profeGemelo=new Profesor("Profesor",20);
		profe.setId(1009);
		profeGemelo.setId(1009);
		System.out.println(profe.toString());
		System.out.println(profeGemelo.toString());
		if(profe.equals(profeGemelo))
		{
			System.out.println("ES EL MISMO PROFESOR");
		}
		else
		{
			System.out.println("NO ES EL MISMO PROFESOR");
		}
		
	}

}
