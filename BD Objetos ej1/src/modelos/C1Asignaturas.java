package modelos;

import java.util.ArrayList; 
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

public class C1Asignaturas {

	private String codAsig;
	private String nombreAsi;
	private ArrayList<C1Profesores> setprofesores;
	
	public C1Asignaturas() {
		
	}
	
	public C1Asignaturas(String codAsig, String nombreAsi, ArrayList<C1Profesores> setprofesores) {
		this.codAsig = codAsig;
		this.nombreAsi = nombreAsi;
		this.setprofesores = setprofesores;
	}

	public String getCodAsig() {
		return codAsig;
	}

	public void setCodAsig(String codAsig) {
		this.codAsig = codAsig;
	}

	public String getNombreAsi() {
		return nombreAsi;
	}

	public void setNombreAsi(String nombreAsi) {
		this.nombreAsi = nombreAsi;
	}
	
	public ArrayList<C1Profesores> getSetprofesores() {
		return setprofesores;
	}

	public void setSetprofesores(ArrayList<C1Profesores> setprofesores) {
		this.setprofesores = setprofesores;
	}
	
	@Override
	public String toString() {
		return "Asignaturas [codAsig=" + codAsig + ", nombreAsi=" + nombreAsi + ", setprofesores=" + setprofesores+ "]";
	}
	
	public boolean comprobarAsignatura(C1Asignaturas a) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		ObjectSet res = bd.queryByExample(a);
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
	
	public void insertarAsignatura(C1Asignaturas a) {
		if (!comprobarAsignatura(a)) {
			ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
			bd.store(a);
			bd.close();
		}else {
			System.out.println("Ya existe");
		}
	}
	
	public void borrarAsignatura(C1Asignaturas a) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
        ObjectSet res=bd.queryByExample(a);
        if(res.isEmpty()) {
            System.out.println("Esa asignatura no existe");
        }else {
        try {
            for(int i=0;i<10;i++) {
        C1Asignaturas c=(C1Asignaturas)res.next();
        bd.delete(c);
            }

    }catch(IllegalStateException ex) {
        System.out.println("Asignatura eliminada");

    }
        }
        bd.close();
	}
	
	public void actualizarAsignatura(String cod,String nombre, ArrayList<C1Profesores> temp) {
		ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
		ObjectSet res = bd.queryByExample(new C1Asignaturas(cod,null,null));
		C1Asignaturas a=(C1Asignaturas)res.next();
        a.setCodAsig(cod);
        a.setNombreAsi(nombre);
        a.setSetprofesores(temp);
        bd.store(a);
        bd.close();
	}
}
