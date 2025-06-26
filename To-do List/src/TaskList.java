import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

public class TaskList {
	private JList<Task> taskList;
	
	private DefaultListModel<Task> tasks;
	
	public static void main(String[] args) {
		TaskList list = new TaskList();
	}
	
	public TaskList() {
		CreateList();
	}
	
	public void add() {
		String name = JOptionPane.showInputDialog(null, "Enter the task name? ");
		String priority = JOptionPane.showInputDialog(null, "What's the priority? ");
		if (name != null && priority != null) {
			if (name.equals("") && priority.equals(""))
				JOptionPane.showMessageDialog(null, "Invalid Inputs", "Error", JOptionPane.ERROR_MESSAGE);
			else
				tasks.addElement(new Task(name, priority));
		}
	}

	public void edit() {
		Task t = taskList.getSelectedValue();
		int index = taskList.getSelectedIndex();
		if (t != null) {
			String check = JOptionPane.showInputDialog(null, "What do you want to change? ");
			if (check != null) {
				switch(check.toLowerCase()) {
				case "name":
					String name = JOptionPane.showInputDialog(null, "Enter the new name: ");
					t.setName(name);
					tasks.insertElementAt(t, index);
					tasks.remove(index);
					break;
				case "priority":
					String pr = JOptionPane.showInputDialog(null, "Enter the new priority: ");
					t.setPriority(pr);
					tasks.insertElementAt(t, index);
					tasks.remove(index);
					break;
				case "status":
					boolean st = JOptionPane.showInputDialog(null, "Enter the status (true or false): ") != null;
					t.setStatus(st);
					tasks.insertElementAt(t, index);
					tasks.remove(index);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Invalid input", null, JOptionPane.ERROR_MESSAGE);
				}
			} else {
				JOptionPane.showMessageDialog(null, "Nothing Entered", "Warning", JOptionPane.ERROR_MESSAGE);
			}
				
		} else {
			JOptionPane.showMessageDialog(null, "Select task first", "Warning", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void CreateList() {
		JFrame frame = new JFrame("To-do List App");
		frame.setSize(500,400);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		tasks = new DefaultListModel<>();
		tasks.addElement(new Task("Grocery Shopping", "high"));
		tasks.addElement(new Task("Car oil change", "high"));
		tasks.addElement(new Task("Water", "medium"));
		tasks.addElement(new Task("Getting Ice cream", "low"));
		
		taskList = new JList<>(tasks);
		taskList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		taskList.setFont(new Font("Serif", Font.ITALIC | Font.BOLD, 17));
		
		Font font = new Font("Monospaced", Font.BOLD, 16);
		
		JButton done = new JButton("Mark as done");
		done.setFont(font);
		done.setForeground(Color.green);
		done.setBackground(Color.DARK_GRAY);
		done.addActionListener(e -> {
			Task t = taskList.getSelectedValue();
			int index = taskList.getSelectedIndex();
			if (t != null) {
				t.setStatus(true);
				tasks.insertElementAt(t, index);
				tasks.remove(index);
			}
		});
		
		JButton add = new JButton("Add Task");
		add.setFont(font);
		add.setForeground(Color.green);
		add.setBackground(Color.DARK_GRAY);
		add.addActionListener(e -> {
			this.add();
		});
		
		JButton edit = new JButton("Edit Task");
		edit.setFont(font);
		edit.setForeground(Color.green);
		edit.setBackground(Color.DARK_GRAY);
		edit.addActionListener(e -> {
			this.edit();
		});
		
		JButton remove = new JButton("Remove Task");
		remove.setFont(font);
		remove.setForeground(Color.green);
		remove.setBackground(Color.DARK_GRAY);
		remove.addActionListener(e -> {
			Task t = taskList.getSelectedValue();
			if (t != null)
				tasks.removeElement(t);
		});
		
		JLabel label = new JLabel("Options");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(font);
		label.setForeground(Color.DARK_GRAY);
		label.setBackground(Color.GREEN);
		
		JPanel panel = new JPanel(new BorderLayout());
		panel.add(add, BorderLayout.SOUTH);
		panel.add(remove, BorderLayout.EAST);
		panel.add(edit, BorderLayout.CENTER);
		panel.add(done, BorderLayout.WEST);
		panel.add(label, BorderLayout.NORTH);

		frame.add(panel, BorderLayout.SOUTH);
		frame.add(taskList);
		frame.setVisible(true);
		
	}

}
