package logica;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import modelos.Articulos;
import modelos.Clientes;
import modelos.Ventas;

public class funciones {

	    public void VisualizarVentas(Ventas v) {
	    	ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
	        ObjectSet res= bd.queryByExample(v);
	        while(res.hasNext()) {
	            System.out.println(res.next());
	        }
	        bd.close();

	    }
	    
	   public void VisualizarClientes(Clientes c) {
	    	ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
	        ObjectSet res= bd.queryByExample(c);
	        while(res.hasNext()) {
	            System.out.println(res.next());
	        }
	        bd.close();

	    }
	    
	    /*public void VisualizarClientes(Clientes c) {
	        ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
	        ObjectSet res = bd.queryByExample(c);
	        int ventas=0;
	        while(res.hasNext()) {
		        System.out.println(res.next());
			        try {
				        Ventas v = new Ventas(0, null, (Clientes) res.next(), 0, null);
				        ObjectSet resV = bd.queryByExample(v);
				        //Precio total:
				        System.out.println(((Ventas) resV.next()).getCodarti().getPvp()*((Ventas) resV).getUniven());
			        }catch(Exception e) {
			            e.printStackTrace();
			        }
		        ventas ++;
	        }
	        System.out.println(ventas);
	        bd.close();
	    }*/
	    
	    public void VisualizarArticulos(Articulos a) {
	    	ObjectContainer bd=Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(),"basedatos.db4o");
	        ObjectSet res= bd.queryByExample(a);
	        while(res.hasNext()) {
	            System.out.println(res.next());
	        }
	        bd.close();

	    }
}
