package exercise1_Visitor;

import java.util.Date;

public class Veterinario_Visitor implements IVisitor {
	public Date date;
	public String res;
	
	@Override
	public String visit(Perro perro) {
		if (perro.getEnfermedades() == ListaEnfermedades.Enfermedad1) {
			date = new Date();
			System.out.println("El perro "+perro.getNombre()+" con "+perro.getEdad()+" años tiene la " + perro.getEnfermedades());
			res = "Se da la cura 1 en fecha y hora: " + date ;
			System.out.println(res);
		} else if (perro.getEnfermedades() == ListaEnfermedades.Enfermedad2){
			date = new Date();
			System.out.println("El perro "+perro.getNombre()+" con "+perro.getEdad()+" años tiene la " + perro.getEnfermedades());
			res = "Se da la cura 2 en fecha y hora: " + date ;
			System.out.println(res);
		} 
		return res;
	}

	@Override
	public String visit(Gato gato) {
		if (gato.getEnfermedad() == ListaEnfermedades.Enfermedad1) {
			date = new Date();
			System.out.println("El gato "+gato.getNombre()+" con "+gato.getEdad()+" años tiene la " + gato.getEnfermedad());
			res = "Se da la cura 1 en fecha y hora: " + date ;
			System.out.println(res);
		} else if (gato.getEnfermedad() == ListaEnfermedades.Enfermedad2){
			date = new Date();
			System.out.println("El gato "+gato.getNombre()+" con "+gato.getEdad()+" años tiene la " + gato.getEnfermedad());
			res = "Se da la cura 2 en fecha y hora: " + date ;
			System.out.println(res);
		} 
		return res;
	}

	@Override
	public String visit(Caballo caballo) {
		if (caballo.getEnfermedad() == ListaEnfermedades.Enfermedad1) {
			date = new Date();
			System.out.println("El caballo "+caballo.getNombre()+" con "+caballo.getEdad()+" años tiene la " + caballo.getEnfermedad());
			res = "Se da la cura 1 en fecha y hora: " + date ;
			System.out.println(res);
		} else if (caballo.getEnfermedad() == ListaEnfermedades.Enfermedad2){
			date = new Date();
			System.out.println("El caballo "+caballo.getNombre()+" con "+caballo.getEdad()+" años tiene la " + caballo.getEnfermedad());
			res = "Se da la cura 2 en fecha y hora: " + date ;
			System.out.println(res);
		} 
		return res;
	}
	

}
