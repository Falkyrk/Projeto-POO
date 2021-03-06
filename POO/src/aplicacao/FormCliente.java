package aplicacao;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import classes.PrjCliente;
import classes.PrjEndereco;
import classes.PrjUsuario;
import repositorio.RepoSistema;

public class FormCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtidCLiente;
	private JTextField textnomeCliente;
	private JTextField txtemailCliente;
	private JTextField txtIdUsuario;
	private JTextField txtNomeUsuario;
	private JPasswordField txtSenha;
	private JTextField txtidEndereco;
	private JTextField txtLogradouro;
	private JTextField txtNumero;
	private JTextField txtBairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente frame = new FormCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormCliente() {
		setResizable(false);
		setTitle("Gerenciar Clientes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIdCliente = new JLabel("Id do Cliente:");
		lblIdCliente.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblIdCliente.setBounds(19, 11, 87, 14);
		contentPane.add(lblIdCliente);
		
		txtidCLiente = new JTextField();
		txtidCLiente.setBounds(20, 32, 207, 20);
		contentPane.add(txtidCLiente);
		txtidCLiente.setColumns(10);
		
		JLabel lblNomeCliente = new JLabel("Nome do Cliente");
		lblNomeCliente.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNomeCliente.setBounds(237, 11, 106, 14);
		contentPane.add(lblNomeCliente);
		
		textnomeCliente = new JTextField();
		textnomeCliente.setBounds(237, 32, 578, 20);
		contentPane.add(textnomeCliente);
		textnomeCliente.setColumns(10);
		
		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblEmail.setBounds(20, 63, 54, 14);
		contentPane.add(lblEmail);
		
		txtemailCliente = new JTextField();
		txtemailCliente.setBounds(20, 88, 795, 20);
		contentPane.add(txtemailCliente);
		txtemailCliente.setColumns(10);
		
		JLabel lblIdUsuario = new JLabel("Id do Usuario:");
		lblIdUsuario.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblIdUsuario.setBounds(20, 130, 87, 14);
		contentPane.add(lblIdUsuario);
		
		txtIdUsuario = new JTextField();
		txtIdUsuario.setColumns(10);
		txtIdUsuario.setBounds(20, 155, 247, 20);
		contentPane.add(txtIdUsuario);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usu\u00E1rio:");
		lblNomeUsuario.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblNomeUsuario.setBounds(277, 131, 106, 14);
		contentPane.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setColumns(10);
		txtNomeUsuario.setBounds(277, 155, 234, 20);
		contentPane.add(txtNomeUsuario);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(521, 155, 294, 20);
		contentPane.add(txtSenha);
		
		JLabel lblPassword = new JLabel("Senha:");
		lblPassword.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblPassword.setBounds(521, 131, 87, 14);
		contentPane.add(lblPassword);
		
		JLabel lblEndereco = new JLabel("Endere\u00E7o:");
		lblEndereco.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblEndereco.setBounds(20, 218, 69, 14);
		contentPane.add(lblEndereco);
		
		txtidEndereco = new JTextField();
		txtidEndereco.setColumns(10);
		txtidEndereco.setBounds(20, 243, 354, 20);
		contentPane.add(txtidEndereco);
		
		JLabel lblLogradouro = new JLabel("Logradouro:");
		lblLogradouro.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblLogradouro.setBounds(384, 218, 91, 14);
		contentPane.add(lblLogradouro);
		
		txtLogradouro = new JTextField();
		txtLogradouro.setColumns(10);
		txtLogradouro.setBounds(384, 243, 431, 20);
		contentPane.add(txtLogradouro);
		
		JLabel lblnumero = new JLabel("N\u00FAmero:");
		lblnumero.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblnumero.setBounds(20, 285, 69, 14);
		contentPane.add(lblnumero);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(20, 317, 128, 20);
		contentPane.add(txtNumero);
		
		JLabel lblBairro = new JLabel("Bairro:");
		lblBairro.setFont(new Font("Verdana", Font.PLAIN, 11));
		lblBairro.setBounds(159, 286, 69, 14);
		contentPane.add(lblBairro);
		
		txtBairro = new JTextField();
		txtBairro.setColumns(10);
		txtBairro.setBounds(159, 317, 656, 20);
		contentPane.add(txtBairro);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//instancia da classe PRJUsuario
				PrjUsuario usuario = new PrjUsuario();
				//Instancia da classe PRJEndereco
				PrjEndereco endereco = new PrjEndereco();
				//Instancia da classe PRJCliente
				PrjCliente cliente = new PrjCliente();
				//Vamos adicionar o cliente a memoria com o RepoSistema
				RepoSistema rs = new RepoSistema();
				
				//O Id do usuario recebe apenas numeros inteiros, porem a caixa em que ? digitado o ID ? do tipo text.
				//Portanto se faz necessario realizar uma convers?o de texto para inteiro
				
				usuario.idUsuario = Integer.parseInt( txtIdUsuario.getText());
				usuario.nomeUsuario = (txtNomeUsuario.getText());
				usuario.senha = txtSenha.getText();
				
				endereco.idEndereco = Integer.parseInt(txtidEndereco.getText()) ;
				endereco.logradouro = txtLogradouro.getText();
				endereco.numero =  txtNumero.getText();
				
				cliente.idCliente = Integer.parseInt(txtidCLiente.getText());
				cliente.nomeCliente = textnomeCliente.getText();
				cliente.email = txtemailCliente.getText();
				
				
				
				
				
				
				
				
				
				
				JOptionPane.showMessageDialog(null,rs.cadUsuario(usuario)+"\n" + rs.cadEndereco(endereco)+"\n"+ rs.cadCLiente(cliente));
			}
		});
		btnCadastrar.setFont(new Font("Verdana", Font.PLAIN, 11));
		btnCadastrar.setBounds(364, 447, 111, 31);
		contentPane.add(btnCadastrar);
	}
}
