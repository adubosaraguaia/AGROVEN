package atualizacao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.UIManager;

import java.awt.Window.Type;

import javax.swing.JTextField;
import javax.swing.JLabel;

import de.javasoft.plaf.synthetica.SyntheticaWhiteVisionLookAndFeel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FormAtualizar {

	public JFrame frmAtualizarAmbiente;
	private JTextField textFieldAtuAmbiente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(new SyntheticaWhiteVisionLookAndFeel());
		} catch (Exception e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormAtualizar window = new FormAtualizar();
					window.frmAtualizarAmbiente.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FormAtualizar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAtualizarAmbiente = new JFrame();
		frmAtualizarAmbiente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frmAtualizarAmbiente.setTitle("Atualizar Ambiente");
		frmAtualizarAmbiente.setBounds(100, 100, 446, 192);
		frmAtualizarAmbiente.setLocationRelativeTo(null);
		frmAtualizarAmbiente.getContentPane().setLayout(null);
		
		JButton btnAtualizar = new JButton("Atualizar Ambiente");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date dataAtual = new Date();
				SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
				textFieldAtuAmbiente.setText("Ambiente atualizado com sucesso!!! - "+formatador.format(dataAtual));
			}
		});
		btnAtualizar.setBounds(133, 43, 155, 23);
		frmAtualizarAmbiente.getContentPane().add(btnAtualizar);
		
		textFieldAtuAmbiente = new JTextField();
		textFieldAtuAmbiente.setBounds(22, 106, 380, 36);
		frmAtualizarAmbiente.getContentPane().add(textFieldAtuAmbiente);
		textFieldAtuAmbiente.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ultima Atualiza\u00E7\u00E3o:");
		lblNewLabel.setBounds(22, 84, 107, 23);
		frmAtualizarAmbiente.getContentPane().add(lblNewLabel);
	}
}
