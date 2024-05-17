import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Login extends JFrame {

    private JTextField tflogin;
    private JLabel ibSenha;
    private JLabel ibLogin;
    private JButton bLogar;
    private JButton bCancelar;
    private JPasswordField pfsenha;
    private static Login frame;

    public Login() {
        inicializarComponentes();
        definirEventos();
    }

    private void inicializarComponentes() {
        setTitle("Login do sistema");
        setBounds(0, 0, 250, 200);
        setLayout(null);
        tflogin = new JTextField(5);
        pfsenha = new JPasswordField(5);
        ibSenha = new JLabel("Senha");
        ibLogin = new JLabel("Login");
        bLogar = new JButton("Logar");
        bCancelar = new JButton("Cancelar");
        tflogin.setBounds(100, 30, 120, 25);
        ibLogin.setBounds(30, 30, 80, 25);
        ibSenha.setBounds(30, 75, 80, 25);
        pfsenha.setBounds(100, 75, 120, 25);
        bLogar.setBounds(20, 120, 100, 25);
        add(tflogin);
        add(ibSenha);
        add(ibLogin);
        add(bLogar);
        add(bCancelar);
        add(pfsenha);
    }

    private void definirEventos() {
        bLogar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String senha = new String(pfsenha.getPassword());
                if (tflogin.getText().equals("java7") && senha.equals("java7")) {
                    System.out.println("teste");
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Login e senha inválidos!");
                }
            }
        });
    }

    public static void main(String[] args) {
        frame = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
