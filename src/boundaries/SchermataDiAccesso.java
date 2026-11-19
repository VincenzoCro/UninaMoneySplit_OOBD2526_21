package boundaries;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;

import controllers.ControllerAccesso;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class SchermataDiAccesso extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfUsername;
	
	private ControllerAccesso controllerAccesso;
	private JPasswordField pfPassword;

	/**
	 * Create the panel.
	 */
	public SchermataDiAccesso(ControllerAccesso controllerAccesso) {
		this.controllerAccesso = controllerAccesso;
		
		setLayout(new MigLayout("", "[][106.00,grow]", "[][][][]"));
		
		JLabel lblUsername = new JLabel("Username:");
		add(lblUsername, "cell 0 0,alignx trailing");
		
		tfUsername = new JTextField();
		add(tfUsername, "cell 1 0,growx");
		tfUsername.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password:");
		add(lblPassword, "cell 0 1,alignx trailing");
		
		pfPassword = new JPasswordField();
		add(pfPassword, "cell 1 1,growx");
		
		JButton btnRegistrati = new JButton("Registrati");
		add(btnRegistrati, "flowx,cell 1 3,alignx center");
		
		JButton btnAccedi = new JButton("Accedi");
		btnAccedi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					controllerAccesso.loginProfilo(tfUsername.getText(), pfPassword.getPassword());
				}
				catch (Exception ex) {
					
				}
			}
		});
		add(btnAccedi, "cell 1 3,alignx center");

	}

	public void mostraErrore(String messaggio) {
		JOptionPane.showMessageDialog(this, messaggio, "Errore di accesso", JOptionPane.ERROR_MESSAGE);
	}

	public void mostraInfo(String messaggio) {
		JOptionPane.showMessageDialog(this, messaggio, "Successo", JOptionPane.INFORMATION_MESSAGE);
	}

}
