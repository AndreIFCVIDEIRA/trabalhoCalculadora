package calculadora;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;


public class calculadoraMain extends JFrame {

    private JPanel contentPane;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tfR;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                	calculadoraMain frame = new calculadoraMain();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public calculadoraMain() {
        setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 473, 182);
        contentPane = new JPanel();
        contentPane.setBackground(Color.LIGHT_GRAY);
        contentPane.setForeground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        tf1 = new JTextField();
        tf1.setBounds(10, 57, 50, 40);
        contentPane.add(tf1);
        tf1.setColumns(10);

        tf2 = new JTextField();
        tf2.setColumns(10);
        tf2.setBounds(310, 57, 50, 40);
        contentPane.add(tf2);

        JButton btSom = new JButton("+");
        btSom.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Som();
            }
        });
        btSom.setBounds(130, 57, 50, 40);
        contentPane.add(btSom);

        JButton btSub = new JButton("-");
        btSub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Sub();
            }
        });
        btSub.setBounds(70, 57, 50, 40);
        contentPane.add(btSub);

        JButton btMulti = new JButton("X");
        btMulti.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Multi();
            }
        });
        btMulti.setBounds(250, 57, 50, 40);
        contentPane.add(btMulti);

        JButton btDiv = new JButton("/");
        btDiv.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Div();
            }
        });
        btDiv.setBounds(190, 57, 50, 40);
        contentPane.add(btDiv);

        tfR = new JTextField();
        tfR.setEditable(false);
        tfR.setColumns(10);
        tfR.setBounds(393, 57, 50, 40);
        contentPane.add(tfR);

        JLabel label = new JLabel("=");
        label.setFont(new Font("Tahoma", Font.PLAIN, 20));
        label.setBounds(370, 53, 20, 40);
        contentPane.add(label);
        
        JLabel lblCalculadoraEmJava = new JLabel("CALCULADORA EM JAVA");
        lblCalculadoraEmJava.setFont(new Font("Arial", Font.PLAIN, 30));
        lblCalculadoraEmJava.setForeground(Color.RED);
        lblCalculadoraEmJava.setBounds(45, 11, 367, 40);
        contentPane.add(lblCalculadoraEmJava);
        
        JButton btnSair = new JButton("SAIR");
        btnSair.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		System.exit(1);
        	}
        });
        btnSair.setFont(new Font("Arial", Font.PLAIN, 16));
        btnSair.setBounds(184, 109, 89, 23);
        contentPane.add(btnSair);
}
    private void Som() {
        tfR.setText(Integer.toString(Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText())));
    }
    private void Sub() {
        tfR.setText(Integer.toString(Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText())));
    }
    private void Multi() {
        tfR.setText(Integer.toString(Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText())));
    }
    private void Div(){
        tfR.setText(Double.toString(Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText())));
    }

}