import java.awt.Color;

public class Frame1 extends JPanel{
	
	private JLabel label;
	private JButton botaoIniciar;
	private JTextField texto;
	
	public Frame1() {
		super();
		
		setLayout(null);
		label = new JLabel();
		label.setToolTipText("Clique em 'comprar' para iniciar uma nova compra");
		add(label);

		botaoIniciar = new JButton("Comprar");
		botaoIniciar.setBounds(420, 350, 150, 100);
		botaoIniciar.addActionListener(
		
		new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				Frame2 janela2 = new Frame2();
				janela2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				janela2.setSize(1000, 700);
				janela2.setVisible(true);
				
			}
			
		});
		add(botaoIniciar);
	
	
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.RED);
		g.setFont(new Font("Serif", Font.BOLD + Font.ITALIC, 60));
		g.drawString("Sistema de bilheteria", 150, 200);
		
	}
	
	

}
