package grafica;
/**
 * 
 * @version 1.0
 * 
 */
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class Grafica extends JFrame {
public Grafica() {
	
	super("LO SDROGEGGIO");
	Container co=getContentPane();
//	{JPanel p=new JPanel();
//	{p.setBackground(Color.blue);
//	{co.add(p);
//	{JPanel pNord=new JPanel();
//	{pNord.setBackground(Color.YELLOW);
//	{co.add(pNord,"North");
//	{JPanel pSud=new JPanel();
//	{pNord.setBackground(new Color(111,11,1));
//	{co.add(pSud,"South");
//	{JButton b1=new JButton("SDROGO");
//	{pNord.add(b1);
//	{pNord.add(new JButton("ok"));
//	{p.add(new JLabel(new ImageIcon()));
//	{pNord.add(new JLabel(new ImageIcon()));
//	
		
	JPanel p=new JPanel();
	JPanel pEast=new JPanel();
	JPanel pOvest=new JPanel();
	p.setBackground(Color.white);
	pEast.setBackground(Color.green);
	pOvest.setBackground(Color.red);
	
	co.add(pEast,"East");
	co.add(pOvest,"West");
	co.add(p);
	pEast.add(new JLabel("                                            "));
	pOvest.add(new JLabel("                                            "));
	JPanel pNord,pSud;
	pNord=new JPanel();
	pSud=new JPanel();
	pNord.setBackground(Color.black);
	pSud.setBackground(Color.black);
	co.add(pNord,"North");
	co.add(pSud,"South");
	JLabel tit=new JLabel("BANDIERA ITALIANA");
	tit.setForeground(Color.white);
	pNord.add(tit);
	
	
	this.setResizable(false);//non ridimensionabile
	setSize(500,300);
	setLocation(550,260);
	setVisible(true);//di default è invisibile
	setDefaultCloseOperation(EXIT_ON_CLOSE);//chiude il processo nel momento in cui si clicca la X
}
	public static void main(String[] args) {
new Grafica();
	}

}
