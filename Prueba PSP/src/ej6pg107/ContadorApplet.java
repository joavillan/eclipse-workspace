package ej6pg107;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JProgressBar;
import javax.swing.JSlider;

public class ContadorApplet extends Applet implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	class HiloCorredor extends Thread{
		
		boolean paro;
		long cont;
		
		HiloCorredor(long l){
			this.cont = l;
		}
		
		public void run() {
			paro=false;
			while (!paro) {
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				repaint();
				cont++;
			}
		}

		public void setParo(boolean paro) {
			this.paro = paro;
		}

		public long getCont() {
			return cont;
		}
	}
	
	HiloCorredor HC1 = new HiloCorredor(1);
	HiloCorredor HC2 = new HiloCorredor(1);
	HiloCorredor HC3 = new HiloCorredor(1);
	
	
	private Font fuente;
	private Button b0,b1,b2;//botones del Applet
	private JSlider js1,js2,js3;
	private JProgressBar jpb1,jpb2,jpb3;
	
	
	public void start() {
		HC1.start();
		HC2.start();
		HC3.start();
	}
 
	public void init() {
		this.setSize(400, 200);
		//setBackground(Color.yellow);
		add(b0=new Button("Comenzar Carrera"));
		b0.addActionListener(this);
		add(js1=new JSlider(1,10,5));
		//js1.addAncestorListener(HC1.setPriority(js1.getValue()));
		add(jpb1=new JProgressBar(0,100));
		add(js2=new JSlider(1,10,5));
		add(jpb2=new JProgressBar(0,100));
		add(js3=new JSlider(1,10,5));
		add(jpb3=new JProgressBar(0,100));
		add(b1=new Button("Finalizar hilo 1"));
		b1.addActionListener(this);
		add(b2=new Button("Finalizar hilo 2"));
		b2.addActionListener(this);
		fuente=new Font("Verdana",Font.BOLD,26);
	}


	public void paint(Graphics g) {
		g.clearRect(0, 0,400,400);
		g.setFont(fuente);
		g.drawString(Long.toString((long)HC1.getCont()),80,200);
		g.drawString(Long.toString((long)HC2.getCont()),160,200);
		g.drawString(Long.toString((long)HC3.getCont()),240,200);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			b1.setLabel("Hilo 1 Finalizado");
			HC1.stop();
		}else if(e.getSource()==b2){
			b2.setLabel("Hilo 2 Finalizado");
			HC2.stop();		
		}else {
			
		}
	}
	
	public void stop() {
		//h1=null;
		//h2=null;
	}
}
