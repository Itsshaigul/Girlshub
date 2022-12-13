package fitness_calc;
import javax.swing.*;

public class Main {
	public static Main app;
	private ListenersClass listenersClass=new ListenersClass(this);
	private JFrame main_GUI=new JFrame();
	private JPanel main_panel= new JPanel();
	protected JComboBox menu1;
	protected JComboBox menu2;
	protected JComboBox menu3;
	private JButton button_calculate = new JButton("Рассчитать");
	private JLabel info1 = new JLabel("Введите свой рост в см");
	private JLabel info3 = new JLabel("Введите свой вес в кг");
	private JLabel info4 = new JLabel("Выберите свой пол");
	private JLabel info5 = new JLabel("Выберите уровень физической активности");
	private JLabel info6 = new JLabel("Введите cвой возраст");
	private JLabel info7 = new JLabel("Выполнили:");
	private JLabel info8 = new JLabel("ст. гр. ИВТ-324");
	private JLabel info9 = new JLabel("Аминева У.Ф. 20130396");
	private JLabel info10 = new JLabel("Исянгильдина И.Г. 20130413");
	private JLabel info11 = new JLabel("Шаймарданова А.Р. 20130416");
	protected JTextArea output= new JTextArea();
	protected JTextField input1 = new JTextField("", 20);
	protected JTextField input2 = new JTextField("", 20);
	protected JTextField input3 = new JTextField("", 20);

	public Main() {
	output.setEditable(false);
	main_GUI.setTitle ("Фитнес-калькулятор");
	main_GUI.setBounds(0,0,555,666);
	main_GUI.setResizable(false);

	main_panel.setLayout(null);
	main_GUI.add(main_panel); 

	button_calculate.setBounds(80,280,300,40);
	button_calculate.addActionListener(listenersClass.listenerCalculate);
	main_panel.add(button_calculate);

	JLabel info2 = new JLabel("Выберите цель");
	info2.setBounds(20,40,350,30);
	main_panel.add(info2);
	String[] s= {"Набор массы", "Поддержание веса", "Снижение веса"};
	menu1=new JComboBox(s);

	menu1.setBounds(300,40,200,25);
	main_panel.add(menu1);

	String[] s1= {"Мужской", "Женский"};
	menu2=new JComboBox(s1);

	menu2.setBounds(300,200,200,25);
	main_panel.add(menu2);

	String[] s2= {"1","2","3","4","5"};
	menu3=new JComboBox(s2);

	menu3.setBounds(300,240,200,25);
	main_panel.add(menu3);

	info1.setBounds(20,80,200,30);
	main_panel.add(info1);

	info3.setBounds(20,120,200,30);
	main_panel.add(info3);

	info6.setBounds(20,160,200,30);
	main_panel.add(info6);

	info4.setBounds(20,200,200,30);
	main_panel.add(info4);

	info5.setBounds(20,240,300,30);
	main_panel.add(info5);
	
	info7.setBounds(350,450,200,20);
	main_panel.add(info7);
	
	info8.setBounds(350,470,200,20);
	main_panel.add(info8);
	
	info9.setBounds(350,490,200,20);
	main_panel.add(info9);
	
	info10.setBounds(350,510,200,20);
	main_panel.add(info10);
	
	info11.setBounds(350,531,200,20);
	main_panel.add(info11);

	input1.setBounds(300,80,200,30);
	main_panel.add(input1);

	input2.setBounds(300,120,200,30);
	main_panel.add(input2);

	input3.setBounds(300,160,200,30);
	main_panel.add(input3);

	output.setBounds(80,330,300,80);
	main_panel.add(output);
	JLabel image=new JLabel(new ImageIcon("C:\\Users\\Ulyana\\git\\Girlshub\\fitness_calc\\src\\Логотип УГАТУ.jpg"));
	image.setBounds(150,450,150,100);
	main_panel.add(image);
	main_GUI.setVisible(true);
	main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String[] args) {
	app=new Main();
}
}
