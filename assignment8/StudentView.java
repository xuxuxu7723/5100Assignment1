import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;



public class StudentView extends JFrame{
	
	private JFrame frame = new JFrame();
	private JTextField idTextField, nameTextField, genderTextField;
	private JLabel idLabel, nameLabel, genderLabel;
	private JButton addButton;
	private JTable table;
    private JScrollPane scrollPane;
	private Font font;
	private StudentsTableModel model;
	
	public StudentView(StudentsTableModel model) {
		this.model = model;
		createComponents();
		setLayout();
		addComponents();
		addBehaviors();
		display();
	}
	
    public void createComponents() {
    	font = new Font("TimesRoman", Font.PLAIN, 36);
    	idLabel = new JLabel("ID");
    	idTextField = new JTextField(5);
    	idTextField.setFont(font);
    	nameLabel = new JLabel("Name");
    	nameTextField = new JTextField(5);
    	nameTextField.setFont(font);
    	genderLabel = new JLabel("Gender");
    	genderTextField = new JTextField(5);
    	genderTextField.setFont(font);
    	addButton = new JButton("ADD");
    	
		table = new JTable(model);
		scrollPane = new JScrollPane(table);

	}
	
	private void addComponents() {
		Container c = getContentPane();
		JPanel panel = new JPanel();
		panel.add(idLabel);
		panel.add(idTextField);
		panel.add(nameLabel);
		panel.add(nameTextField);
		panel.add(genderLabel);
		panel.add(genderTextField);
		panel.add(addButton);
		c.add(panel);
		c.add(scrollPane);
	}
	
	private void addBehaviors() {
		AddListener al = new AddListener();
		addButton.addActionListener(al);
		}
		
	class AddListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			int id = Integer.parseInt(getID());
			String name = getName();
			String gender = getGender();
			Student student = new Student(id,name,gender);
			//Student student = new Student(5,"33","55");
			model.addStudent(student);
			table.updateUI();
		}
	}
	
	private void setLayout() {
		
		GridLayout gl = new GridLayout(5, 1);
		//FlowLayout fl = new FlowLayout();
		Container c = this.getContentPane();
		c.setLayout(gl);
	}
	
	public void display() {
		setSize(600, 600);
		setVisible(true);

	}
	
	public String getID() {
		return idTextField.getText();
	}
	
	public String getName() {
		return nameTextField.getText();
	}
	
	public String getGender() {
		return genderTextField.getText();
	}
	
//	public static void main(String[] args) {
//		StudentView c = new StudentView();
//
//	}

}
