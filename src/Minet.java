
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.ComponentOrientation;

import javax.swing.JSplitPane;

import java.awt.Component;
import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Cursor;
import java.awt.Point;

public class Minet {

	private JFrame Minet;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Minet window = new Minet();
					window.Minet.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Minet() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Minet = new JFrame();
		Minet.setBackground(new Color(255, 255, 255));
		Minet.getContentPane().setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		Minet.getContentPane().setLayout(new GridLayout(0, 1, 0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBorder(null);
		splitPane.setDividerSize(0);
		splitPane.setBackground(new Color(255, 255, 255));
		Minet.getContentPane().add(splitPane);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setBorder(null);
		splitPane_1.setDividerSize(0);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_1);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setBorder(null);
		splitPane_2.setDividerSize(0);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setLeftComponent(splitPane_2);
		
		JLabel UsrLabel = new JLabel("\u7528\u6237\u5217\u8868");
		UsrLabel.setDisplayedMnemonic(KeyEvent.VK_CONTROL);
		UsrLabel.setOpaque(true);
		UsrLabel.setIcon(new ImageIcon("icon\\usr.png"));
		UsrLabel.setBackground(new Color(173, 216, 230));
		UsrLabel.setForeground(new Color(0, 0, 0));
		UsrLabel.setHorizontalAlignment(SwingConstants.CENTER);
		UsrLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		splitPane_2.setLeftComponent(UsrLabel);
		
		JScrollPane scrollPane_usr = new JScrollPane();
		scrollPane_usr.setForeground(new Color(255, 255, 255));
		scrollPane_usr.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		scrollPane_usr.setAutoscrolls(true);
		scrollPane_usr.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane_usr.setBackground(new Color(255, 255, 255));
		scrollPane_usr.setBorder(new LineBorder(new Color(130, 135, 144)));
		scrollPane_usr.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane_2.setRightComponent(scrollPane_usr);
		
		JList list_usr = new JList();
		list_usr.setVisibleRowCount(10);
		list_usr.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		list_usr.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		list_usr.setModel(new AbstractListModel() {
			String[] values = new String[] {"\u5609\u534E", "\u4F1F\u79D1", "\u4F1F\u9E4F", "\u718A\u732B", "\u5929\u6674", "LY", "\u795E\u79D8\u4EBA", "\u65E0\u8138\u7537"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_usr.setVerifyInputWhenFocusTarget(false);
		list_usr.setValueIsAdjusting(true);
		list_usr.setSelectionForeground(Color.BLACK);
		list_usr.setSelectionBackground(new Color(240, 248, 255));
		list_usr.setName("");
		list_usr.setLayoutOrientation(JList.VERTICAL_WRAP);
		list_usr.setForeground(Color.WHITE);
		list_usr.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		list_usr.setFixedCellWidth(100);
		list_usr.setFixedCellHeight(20);
		list_usr.setBackground(new Color(25, 25, 112));
		scrollPane_usr.setViewportView(list_usr);
		splitPane_2.setDividerLocation(20);
		
		JSplitPane splitPane_3 = new JSplitPane();
		splitPane_3.setBorder(null);
		splitPane_3.setDividerSize(0);
		splitPane_3.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_1.setRightComponent(splitPane_3);
		
		JLabel GroupLabel = new JLabel("\u7FA4\u7EC4\u5217\u8868");
		GroupLabel.setOpaque(true);
		GroupLabel.setIcon(new ImageIcon("icon\\group.png"));
		GroupLabel.setForeground(new Color(0, 0, 0));
		GroupLabel.setDisplayedMnemonic(KeyEvent.VK_CONTROL);
		GroupLabel.setBackground(new Color(173, 216, 230));
		GroupLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLabel.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		splitPane_3.setLeftComponent(GroupLabel);
		
		JSplitPane splitPane_7 = new JSplitPane();
		splitPane_7.setBorder(null);
		splitPane_7.setBackground(new Color(245, 245, 245));
		splitPane_7.setDividerSize(0);
		splitPane_7.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_3.setRightComponent(splitPane_7);
		
		JButton button_new = new JButton("\u521B\u5EFA\u65B0\u7FA4\u7EC4");
		button_new.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String input = JOptionPane.showInputDialog("\u8BF7\u8F93\u5165\u65B0\u5EFA\u7FA4\u7EC4\u540D\u79F0");
		    	if (input != null) {
			    	System.out.println(input);
			    }	
			}
		});
		button_new.setIcon(new ImageIcon("icon//new.png"));
		button_new.setForeground(new Color(0, 0, 0));
		button_new.setBackground(new Color(255, 255, 255));
		button_new.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		splitPane_7.setRightComponent(button_new);
		
		JScrollPane scrollPane_group = new JScrollPane();
		scrollPane_group.setBorder(new LineBorder(new Color(130, 135, 144)));
		scrollPane_group.setForeground(new Color(255, 255, 255));
		scrollPane_group.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		scrollPane_group.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		scrollPane_group.setBackground(new Color(255, 255, 255));
		scrollPane_group.setAutoscrolls(true);
		scrollPane_group.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		splitPane_7.setLeftComponent(scrollPane_group);
		
		JList list = new JList();
		list.setVisibleRowCount(10);
		
		list.setValueIsAdjusting(true);
		list.setSelectionForeground(Color.BLACK);
		list.setSelectionBackground(new Color(240, 248, 255));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"where_to_go", "this_is_love", "eat", "MINET", "MIAC", "RIP", "take_away", "flight", "sac", "study"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		list.setSelectedIndex(1);
		list.setLayoutOrientation(JList.VERTICAL_WRAP);
		list.setForeground(Color.WHITE);
		list.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		list.setFixedCellWidth(100);
		list.setFixedCellHeight(20);
		list.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		list.setBackground(new Color(25, 25, 112));
		scrollPane_group.setViewportView(list);
		splitPane_7.setDividerLocation(173);
		splitPane_3.setDividerLocation(20);
		splitPane_1.setDividerLocation(145);
		
		JSplitPane splitPane_4 = new JSplitPane();
		splitPane_4.setBorder(null);
		splitPane_4.setDividerSize(0);
		splitPane_4.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_4);
		
		JSplitPane splitPane_5 = new JSplitPane();
		splitPane_5.setDividerSize(0);
		splitPane_5.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_4.setLeftComponent(splitPane_5);
		
		JLabel chat = new JLabel("this_is_love");
		chat.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		chat.setForeground(new Color(0, 0, 0));
		chat.setOpaque(true);
		chat.setIcon(new ImageIcon("icon//chat.png"));
		chat.setBackground(new Color(230, 230, 250));
		chat.setHorizontalAlignment(SwingConstants.CENTER);
		chat.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		splitPane_5.setLeftComponent(chat);
		
		JTextArea record = new JTextArea();
		record.setSelectedTextColor(new Color(255, 255, 255));
		record.setBackground(new Color(248, 248, 255));
		record.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		record.setEditable(false);
		splitPane_5.setRightComponent(record);
		record.setSelectionColor(new Color(100, 149, 237));
		record.setText("\u5929\u6674\uFF1A233\r\n\u4F1F\u79D1\uFF1A\u5929\u6674\u5973\u795E\r\n\u5609\u534E\uFF1A\u75F4\u7EBF\r\nLY\uFF1A\u3002\u3002\u3002\u3002\r\n");
		
		JSplitPane splitPane_6 = new JSplitPane();
		splitPane_6.setDividerSize(0);
		splitPane_6.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane_4.setRightComponent(splitPane_6);
		
		JTextArea text_input = new JTextArea();
		text_input.setSelectedTextColor(new Color(255, 255, 255));
		text_input.setSelectionColor(new Color(100, 149, 237));
		text_input.setTabSize(4);
		text_input.setText("\u8BF7\u8F93\u5165...");
		text_input.setForeground(new Color(0, 0, 0));
		text_input.setBorder(null);
		text_input.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		text_input.setBackground(new Color(248, 248, 255));
		text_input.setAlignmentY(Component.TOP_ALIGNMENT);
		text_input.setAlignmentX(Component.LEFT_ALIGNMENT);
		splitPane_6.setLeftComponent(text_input);
		
		JButton button_send = new JButton("\u53D1\u9001");
		button_send.setIcon(new ImageIcon("icon\\send.png"));
		button_send.setBackground(new Color(147, 112, 219));
		button_send.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 15));
		splitPane_6.setRightComponent(button_send);
		splitPane_6.setDividerLocation(104);
		splitPane_4.setDividerLocation(233);
		splitPane.setDividerLocation(135);
		Minet.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 13));
		Minet.setIconImage(Toolkit.getDefaultToolkit().getImage("icon\\logo.jpg"));
		
		Minet.setResizable(false);
		Minet.setTitle("MINET");
		
		Minet.setBounds(100, 100, 560, 400);
		Minet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
