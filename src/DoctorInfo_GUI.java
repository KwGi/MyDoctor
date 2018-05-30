	import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DoctorInfo_GUI extends JFrame{
	
		private JPanel InfoPanel = new JPanel();
		private JButton BackButton = new JButton("Back");
	
	public DoctorInfo_GUI(Doctor doctor,Registry reg,Patient connected) {
		
		InfoPanel.setLayout(new GridLayout(13,1,10,10));
   	    
		
	    InfoPanel.add(new JLabel("Doctor's Info")) ; 
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("Name: " + doctor.getName()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("Surname: " + doctor.getSurname()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("AMKA: " + doctor.getAmka()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("Email: " + doctor.getMail()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("Age: " + doctor.getAge()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    if(doctor.isGender())
	    	InfoPanel.add(new JLabel("Gender: Female" ));
	    else
	    	InfoPanel.add(new JLabel("Gender: Male" ));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("Telephone: " + doctor.getTelephone())); 
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
	    InfoPanel.add(new JLabel("City : "+ doctor.getCityName()));
	    InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
		InfoPanel.add(new JLabel("Speciality : " + doctor.getSpeciality()));
		InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
		InfoPanel.add(new JLabel ("Tag : "  + doctor.getTag()));
		InfoPanel.add(Box.createRigidArea(new Dimension (0,20)));
		
		InfoPanel.add(BackButton);
		
		BackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				new MakeAppointment_GUI(connected,reg);
				dispose();
			}
			
		});
		
		this.setContentPane(InfoPanel);
		this.setSize(250,500);
		this.setVisible(true);
		this.setTitle("DOCTOR'S INFO GUI");
		this.getContentPane().setLayout(new BoxLayout(InfoPanel, BoxLayout.Y_AXIS));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
