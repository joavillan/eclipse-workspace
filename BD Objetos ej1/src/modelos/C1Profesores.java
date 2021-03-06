package modelos;

import java.util.Date;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class C1Profesores {

	private int codProf;
	private String nombreApe;
	private String nombreEspe;
	private String fechaNac;
	private String sexo;
	private C1Centros c1Centros;
	
	public C1Profesores() {
		
	}
	
	public C1Profesores(int codProf, String nombreApe, String nombreEspe, String fechaNac, String sexo, C1Centros c1Centros) {
		this.codProf = codProf;
		this.nombreApe = nombreApe;
		this.nombreEspe = nombreEspe;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
		this.c1Centros = c1Centros;
	}

	public int getCodProf() {
		return codProf;
	}

	public void setCodProf(int codProf) {
		this.codProf = codProf;
	}

	public String getNombreApe() {
		return nombreApe;
	}

	public void setNombreApe(String nombreApe) {
		this.nombreApe = nombreApe;
	}

	public String getNombreEspe() {
		return nombreEspe;
	}

	public void setNombreEspe(String nombreEspe) {
		this.nombreEspe = nombreEspe;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public C1Centros getC1Centros() {
		return c1Centros;
	}

	public void setC1Centros(C1Centros c1Centros) {
		this.c1Centros = c1Centros;
	}
	
	@Override
	public String toString() {
		return "Profesores [codProf=" + codProf + ", nombreApe=" + nombreApe + ", nombreEspe=" + nombreEspe+", fechaNac="+fechaNac+", sexo="+sexo+", centros="+c1Centros+"]";
	}
	
	public boolean comprobarProfesores(C1Profesores p) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		ObjectSet res = bd.queryByExample(p);
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
	
	public void insertarProfesores(C1Profesores p) {
		if (!comprobarProfesores(p)) {
			ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
			bd.store(p);
			bd.close();
		}else {
			System.out.println("Ya existe");
		}
	}
	
	public void borrarProfesores(C1Profesores p) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        ObjectSet res=bd.queryByExample(p);
        if(res.isEmpty()) {
            System.out.println("Ese profesor no existe");
        }else {
        try {
            for(int i=0;i<10;i++) {
        C1Profesores c=(C1Profesores)res.next();
        bd.delete(c);
            }

    }catch(IllegalStateException ex) {
        System.out.println("Profesor eliminado");

    }
        }
        bd.close();
	}
	
	public void actualizarProfesores(int cod,String nombre,String nombrees,String fechanac,String sexo,C1Centros cen) {
        ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        try {
	        ObjectSet res = bd.queryByExample(new C1Profesores(cod,null,null, null, null, null));
	        C1Profesores a=(C1Profesores)res.next();
	        a.setNombreApe(nombre);
	        a.setNombreEspe(nombrees);
	        a.setFechaNac(fechanac);
	        a.setSexo(sexo);
	        a.setC1Centros(cen);
	        bd.store(a);
	        System.out.println("Profesor modificado");
	    }catch(IllegalStateException ex) {
	    	System.out.println("ERROR"+ex);
	    }
	        bd.close();
	    }
	
	public C1Profesores obtenerProfesor(int id) {
        ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        C1Profesores c = new C1Profesores(id,null,null,null,null,null);
        ObjectSet res = bd.queryByExample(c);
        if(!res.isEmpty()) {
        C1Profesores c1 = (C1Profesores)res.next();
        bd.close();
            return c1;
        }else {
            System.out.println("No se ha encontrado el profesor");
            return null;
        }

    }
	
	public void consultarAsignaturas(C1Profesores p) {
        C1Asignaturas a = new C1Asignaturas(null,null,null);
        C1Profesores pa;
        ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        ObjectSet res = bd.queryByExample(p);
        while(res.hasNext()) {
            pa=(C1Profesores)res.next();
            ObjectSet resa= bd.queryByExample(a);
            while(resa.hasNext()) {
                C1Asignaturas a1 = (C1Asignaturas)resa.next();
                    if(a1.getSetprofesores().contains(pa)) {
                        System.out.println(a1.getNombreAsi());
                    }
            }
        }
        bd.close();
    }
}
