package modelos;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class C1Centros {

	private int codCentro;
	private String nomCentro;
	private C1Profesores director;
	private String direccion;
	private String localidad;
	private String provincia;
	
	public C1Centros() {
		
	}
	
	public C1Centros(int codCentro, String nomCentro, C1Profesores director, String direccion, String localidad, String provincia) {
		this.codCentro = codCentro;
		this.nomCentro = nomCentro;
		this.director = director;
		this.direccion = direccion;
		this.localidad = localidad;
		this.provincia = provincia;
	}

	public int getCodCentro() {
		return codCentro;
	}

	public void setCodCentro(Integer codCentro) {
		this.codCentro = codCentro;
	}

	public String getNomCentro() {
		return nomCentro;
	}

	public void setNomCentro(String nomCentro) {
		this.nomCentro = nomCentro;
	}

	public C1Profesores getDirector() {
		return director;
	}

	public void setDirector(C1Profesores director) {
		this.director = director;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@Override
	public String toString() {
		return "Centros [codCentro=" + codCentro + ", nomCentro=" + nomCentro + ", director=" + director+", direccion="+direccion+", localidad="+localidad+", provincia="+provincia+"]";
	}
	
	public boolean comprobarCentros(C1Centros c) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		ObjectSet res = bd.queryByExample(c);
		boolean b = false;
		if(res.isEmpty()) {
			System.out.println("No existe el elemento");
			b = false;
		}else {
			System.out.println("El elemento existe:"+res.next());
			b = true;
		}
		bd.close();
		return b;
	}
	
	public void insertarCentros(C1Centros c) {
		if (!comprobarCentros(c)) {
			ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
			bd.store(c);
			bd.close();
		}else {
			System.out.println("Ya existe");
		}
	}
	
	public void borrarCentros(C1Centros c) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        ObjectSet res=bd.queryByExample(c);
        if(res.isEmpty()) {
            System.out.println("Ese centro no existe");
        }else {
        try {
            for(int i=0;i<10;i++) {
        C1Centros p=(C1Centros)res.next();
        bd.delete(p);
            }

    }catch(IllegalStateException ex) {
        System.out.println("Centro eliminado");

    }
        }
        bd.close();
	}
	
	public void actualizarCentros(Integer cod, String nombre, C1Profesores director, String direccion, String localidad, String provincia) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		ObjectSet res = bd.queryByExample(new C1Centros(cod,null,null,null,null,null));
		C1Centros c =(C1Centros)res.next();
        c.setCodCentro(cod);
        c.setNomCentro(nombre);
        c.setDirector(director);
        c.setDireccion(direccion);
        c.setLocalidad(localidad);
        c.setProvincia(provincia);
        bd.store(c);
        bd.close();
	}
	
	public C1Centros obtenerCentros(int id) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		C1Centros c = new C1Centros(id,null,null,null,null,null);
		 ObjectSet res = bd.queryByExample(c);
		if(!res.isEmpty()) {
		C1Centros c1 = (C1Centros)res.next();
			bd.close();
			return c1;
		}else {
			System.out.println("Centro no encontrado");
			bd.close();
			return null;	
		}
	}
	
	public void verProfesores(int cod) {
        ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        C1Centros c = new C1Centros(cod,null,null,null,null,null);
        ObjectSet res = bd.queryByExample(c);
        try {
        c = (C1Centros) res.next();
        C1Profesores p = new C1Profesores(0,null,null,null,null,c);
        ObjectSet res1 = bd.queryByExample(p);
        while(res1.hasNext()) {
            System.out.println(res1.next());
        }
        }catch(IllegalStateException e) {
            System.out.println("No se ha encontrado el centro");
        }
        bd.close();
    }
}
