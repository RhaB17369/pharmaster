package pharmaster;
/*Application de gestion de medicaments dans une pharmacie.
 *Realise par RhaB17369
 *Email: regonnebriceharold@gmail.com */
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import connections.conector;
import pharmmaster.Rventes;

public class Administrator extends JFrame {
	
	JPanel pn,pn1,pn2,pn3;
	JButton bnew;
	conector cn=new conector();
	Statement st;
	ResultSet rst;
	JTable table;
	JScrollPane scroll;
	
	
	AffichagePanel1 aff1=new AffichagePanel1(); 
	Requetes rq=new Requetes();
	Rventes rv=new Rventes();
   
	
	public Administrator(){
		this.setTitle("chcode_appli");
		this.setSize(1350,700);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		pn=new JPanel();
		pn.setLayout(null);
		pn.setBackground(Color.blue);
		pn.setBounds(3,3,400,320);
		add(pn);
		
		pn1=new JPanel();
		pn1.setLayout(null);
		pn1.setBounds(3,3,400,667);
		pn1.setBorder(BorderFactory.createTitledBorder(""));
		aff1.Panel1(pn1);
		bnew=new JButton("Nouveau");
		bnew.setBounds(250,440,100,25);
		bnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Administrator ad=new Administrator();
				ad.setVisible(true);
				
			}
		});
		pn1.add(bnew);
		
       
	
		JButton bnew=new JButton("Nouveau");
		bnew.setBounds(250,440,100,25);
		bnew.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				dispose();
				Administrator ad=new Administrator();
				ad.setVisible(true);
				
			}
		});
		pn1.add(bnew);
		pn.add(pn1);
		
		
		pn2=new JPanel();
		pn2.setLayout(null);
		pn2.setBounds(405,3,935,320);
		
		rq.requete(pn2);
		pn.add(pn2);
		
		pn3=new JPanel();
		pn3.setLayout(null);
		pn3.setBounds(405,325,935,345);
		pn3.setBorder(BorderFactory.createTitledBorder(""));
		rv.rventes(pn3);
		pn.add(pn3);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Administrator ad=new Administrator();
		ad.setVisible(true);
	
		

	}



}
