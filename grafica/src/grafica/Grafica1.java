package grafica;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Grafica1 extends JFrame{
	public Grafica1(){
		super("BANDIERA");
		Container co=getContentPane();
		JPanel pNord,pSud,p;
		pNord=new JPanel();
		pSud=new JPanel();
		pNord.setBackground(Color.black);
		pSud.setBackground(Color.black);
	JLabel tit=new JLabel("BANDIERA UNGHERESE");
	tit.setForeground(Color.white);
	pNord.add(tit);
	co.add(pNord,"North");
	co.add(pSud,"South");
	p=new JPanel(new BorderLayout());
	JPanel  ppNord,ppSud,pp;
	ppNord=new JPanel();
	ppSud=new JPanel();
	pp=new JPanel();
	ppNord.setBackground(Color.red);
	ppSud.setBackground(Color.white);
	pp.setBackground(Color.green);
	pp.add(ppNord,"North");
	pp.add(ppSud,"South");
	co.add(pp);
	JLabel t=new JLabel("  ");
	t.setFont(new Font("Ariel",1,36));
	JLabel t1=new JLabel("  ");
	t.setFont(new Font("Ariel",1,36));
	ppNord.add(t);
	ppNord.add(t1);
	setSize(300,300);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		}
	public static void main(String[] args) {
		new Grafica1();
	}
	}
