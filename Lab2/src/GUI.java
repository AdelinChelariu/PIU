import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Label;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import java.awt.Cursor;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;

public class GUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel;
	private JPanel securitySettingsPanel;
	private JPanel serverSettingsPanel;
	private JPanel messageStoragePanel;
	private JPanel buttonsPanel;
	private Label ServerSettings;
	private JLabel serverTypeLabel;
	private JLabel serverNameLabel;
	private JLabel userNameLabel;
	private JLabel serverType;
	private JTextField serverNameTextField;
	private JTextField userNameTextField;
	private JLabel portLabel;
	private JSpinner portSpinner;
	private JLabel defaultPortLabel;
	private JLabel connectionLabel;
	private JLabel authenticationLabel;
	private JComboBox connectionComboBox;
	private JComboBox authenticationComboBox;
	private JButton OKButton;
	private JButton cancelButton;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Account Settings");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 511, 790);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{424, 0};
		gbl_contentPane.rowHeights = new int[]{54, 108, 89, 215, 185, 79, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		ServerSettings = new Label("  Server Settings");
		ServerSettings.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		ServerSettings.setBackground(new Color(0, 120, 215));
		ServerSettings.setForeground(new Color(255, 255, 255));
		ServerSettings.setFont(new Font("Tahoma", Font.BOLD, 20));
		GridBagConstraints gbc_serverSettings = new GridBagConstraints();
		gbc_serverSettings.insets = new Insets(0, 0, 5, 0);
		gbc_serverSettings.fill = GridBagConstraints.HORIZONTAL;
		gbc_serverSettings.gridx = 0;
		gbc_serverSettings.gridy = 0;
		contentPane.add(ServerSettings, gbc_serverSettings);
		
		panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 1;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{70, 171, 44, 54, 0, 0};
		gbl_panel.rowHeights = new int[]{34, 34, 34, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		serverTypeLabel = new JLabel(" Server Type:");
		GridBagConstraints gbc_serverTypeLabel = new GridBagConstraints();
		gbc_serverTypeLabel.fill = GridBagConstraints.BOTH;
		gbc_serverTypeLabel.insets = new Insets(0, 0, 5, 5);
		gbc_serverTypeLabel.gridx = 0;
		gbc_serverTypeLabel.gridy = 0;
		panel.add(serverTypeLabel, gbc_serverTypeLabel);
		
		serverType = new JLabel("IMAP Mail Server");
		GridBagConstraints gbc_serverType = new GridBagConstraints();
		gbc_serverType.fill = GridBagConstraints.BOTH;
		gbc_serverType.insets = new Insets(0, 0, 5, 5);
		gbc_serverType.gridx = 1;
		gbc_serverType.gridy = 0;
		panel.add(serverType, gbc_serverType);
		
		serverNameLabel = new JLabel(" Server Name:");
		GridBagConstraints gbc_serverNameLabel = new GridBagConstraints();
		gbc_serverNameLabel.anchor = GridBagConstraints.EAST;
		gbc_serverNameLabel.fill = GridBagConstraints.VERTICAL;
		gbc_serverNameLabel.insets = new Insets(0, 0, 5, 5);
		gbc_serverNameLabel.gridx = 0;
		gbc_serverNameLabel.gridy = 1;
		panel.add(serverNameLabel, gbc_serverNameLabel);
		
		serverNameTextField = new JTextField();
		GridBagConstraints gbc_serverNameTextField = new GridBagConstraints();
		gbc_serverNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_serverNameTextField.insets = new Insets(0, 0, 5, 5);
		gbc_serverNameTextField.gridx = 1;
		gbc_serverNameTextField.gridy = 1;
		panel.add(serverNameTextField, gbc_serverNameTextField);
		serverNameTextField.setColumns(10);
		
		portLabel = new JLabel("Port: ");
		GridBagConstraints gbc_portLabel = new GridBagConstraints();
		gbc_portLabel.anchor = GridBagConstraints.EAST;
		gbc_portLabel.insets = new Insets(0, 0, 5, 5);
		gbc_portLabel.gridx = 2;
		gbc_portLabel.gridy = 1;
		panel.add(portLabel, gbc_portLabel);
		
		portSpinner = new JSpinner();
		GridBagConstraints gbc_portSpinner = new GridBagConstraints();
		gbc_portSpinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_portSpinner.insets = new Insets(0, 0, 5, 5);
		gbc_portSpinner.gridx = 3;
		gbc_portSpinner.gridy = 1;
		panel.add(portSpinner, gbc_portSpinner);
		
		defaultPortLabel = new JLabel("  Default: 143");
		GridBagConstraints gbc_defaultPortLabel = new GridBagConstraints();
		gbc_defaultPortLabel.insets = new Insets(0, 0, 5, 0);
		gbc_defaultPortLabel.gridx = 4;
		gbc_defaultPortLabel.gridy = 1;
		panel.add(defaultPortLabel, gbc_defaultPortLabel);
		
		userNameLabel = new JLabel(" User Name:");
		GridBagConstraints gbc_userNameLabel = new GridBagConstraints();
		gbc_userNameLabel.anchor = GridBagConstraints.WEST;
		gbc_userNameLabel.insets = new Insets(0, 0, 0, 5);
		gbc_userNameLabel.fill = GridBagConstraints.VERTICAL;
		gbc_userNameLabel.gridx = 0;
		gbc_userNameLabel.gridy = 2;
		panel.add(userNameLabel, gbc_userNameLabel);
		
		userNameTextField = new JTextField();
		GridBagConstraints gbc_userNameTextField = new GridBagConstraints();
		gbc_userNameTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_userNameTextField.insets = new Insets(0, 0, 0, 5);
		gbc_userNameTextField.gridx = 1;
		gbc_userNameTextField.gridy = 2;
		panel.add(userNameTextField, gbc_userNameTextField);
		userNameTextField.setColumns(10);
		
		securitySettingsPanel = new JPanel();
		GridBagConstraints gbc_securitySettingsPanel = new GridBagConstraints();
		gbc_securitySettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_securitySettingsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_securitySettingsPanel.gridx = 0;
		gbc_securitySettingsPanel.gridy = 2;
		securitySettingsPanel.setBorder(BorderFactory.createTitledBorder("Security Settings"));
		contentPane.add(securitySettingsPanel, gbc_securitySettingsPanel);
		GridBagLayout gbl_securitySettingsPanel = new GridBagLayout();
		gbl_securitySettingsPanel.columnWidths = new int[]{140, 140, 141, 0};
		gbl_securitySettingsPanel.rowHeights = new int[]{30, 30, 0};
		gbl_securitySettingsPanel.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_securitySettingsPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		securitySettingsPanel.setLayout(gbl_securitySettingsPanel);
		
		connectionLabel = new JLabel(" Connection security");
		GridBagConstraints gbc_connectionLabel = new GridBagConstraints();
		gbc_connectionLabel.anchor = GridBagConstraints.WEST;
		gbc_connectionLabel.insets = new Insets(0, 0, 5, 5);
		gbc_connectionLabel.gridx = 0;
		gbc_connectionLabel.gridy = 0;
		securitySettingsPanel.add(connectionLabel, gbc_connectionLabel);
		
		connectionComboBox = new JComboBox();
		String salut[] = new String[] {"Valoare1", "Valoare2", "Valoare3"};
		connectionComboBox.setModel(new DefaultComboBoxModel(salut));
		GridBagConstraints gbc_connectionComboBox = new GridBagConstraints();
		gbc_connectionComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_connectionComboBox.insets = new Insets(0, 0, 5, 5);
		gbc_connectionComboBox.gridx = 1;
		gbc_connectionComboBox.gridy = 0;
		securitySettingsPanel.add(connectionComboBox, gbc_connectionComboBox);
		
		authenticationLabel = new JLabel(" Authentication method");
		GridBagConstraints gbc_authenticationLabel = new GridBagConstraints();
		gbc_authenticationLabel.anchor = GridBagConstraints.WEST;
		gbc_authenticationLabel.insets = new Insets(0, 0, 0, 5);
		gbc_authenticationLabel.gridx = 0;
		gbc_authenticationLabel.gridy = 1;
		securitySettingsPanel.add(authenticationLabel, gbc_authenticationLabel);
		
		authenticationComboBox = new JComboBox();
		GridBagConstraints gbc_authenticationComboBox = new GridBagConstraints();
		gbc_authenticationComboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_authenticationComboBox.insets = new Insets(0, 0, 0, 5);
		gbc_authenticationComboBox.gridx = 1;
		gbc_authenticationComboBox.gridy = 1;
		securitySettingsPanel.add(authenticationComboBox, gbc_authenticationComboBox);
		
		serverSettingsPanel = new JPanel();
		GridBagConstraints gbc_serverSettingsPanel = new GridBagConstraints();
		gbc_serverSettingsPanel.fill = GridBagConstraints.BOTH;
		gbc_serverSettingsPanel.insets = new Insets(0, 0, 5, 0);
		gbc_serverSettingsPanel.gridx = 0;
		gbc_serverSettingsPanel.gridy = 3;
		serverSettingsPanel.setBorder(BorderFactory.createTitledBorder("Server Settings"));
		serverSettingsPanel.setLayout(null);
		contentPane.add(serverSettingsPanel, gbc_serverSettingsPanel);
		
		chckbxNewCheckBox = new JCheckBox("Check for new messages at startup");
		chckbxNewCheckBox.setBounds(6, 16, 241, 23);
		chckbxNewCheckBox.setSelected(true);
		serverSettingsPanel.add(chckbxNewCheckBox);
		
		chckbxNewCheckBox_1 = new JCheckBox("Check for new messages every ");
		chckbxNewCheckBox_1.setBounds(6, 44, 215, 23);
		chckbxNewCheckBox_1.setSelected(true);
		serverSettingsPanel.add(chckbxNewCheckBox_1);
		
		chckbxNewCheckBox_2 = new JCheckBox("Allow immediate server notifications when new messages arrive\r\n");
		chckbxNewCheckBox_2.setBounds(6, 72, 452, 23);
		chckbxNewCheckBox_2.setSelected(true);
		serverSettingsPanel.add(chckbxNewCheckBox_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(217, 46, 56, 20);
		serverSettingsPanel.add(spinner);
		
		JLabel lblNewLabel = new JLabel("minutes");
		lblNewLabel.setBounds(283, 48, 46, 14);
		serverSettingsPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("When I delete a message:");
		lblNewLabel_1.setBounds(16, 102, 161, 14);
		serverSettingsPanel.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Move it to this folder:");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(26, 123, 185, 23);
		serverSettingsPanel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Just mark it as deleted");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(26, 149, 270, 23);
		serverSettingsPanel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Remove it immediately");
		buttonGroup.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(26, 175, 247, 23);
		serverSettingsPanel.add(rdbtnNewRadioButton_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(213, 123, 168, 22);
		serverSettingsPanel.add(comboBox);
		
		JButton btnNewButton = new JButton("Advanced...");
		btnNewButton.setBounds(365, 171, 107, 31);
		serverSettingsPanel.add(btnNewButton);
		
		messageStoragePanel = new JPanel();
		GridBagConstraints gbc_messageStoragePanel = new GridBagConstraints();
		gbc_messageStoragePanel.fill = GridBagConstraints.BOTH;
		gbc_messageStoragePanel.insets = new Insets(0, 0, 5, 0);
		gbc_messageStoragePanel.gridx = 0;
		gbc_messageStoragePanel.gridy = 4;
		messageStoragePanel.setBorder(BorderFactory.createTitledBorder("Message Storage"));
		messageStoragePanel.setLayout(null);
		contentPane.add(messageStoragePanel, gbc_messageStoragePanel);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Clean up (\"Expunge\") Inbox on Exit");
		chckbxNewCheckBox_3.setBounds(11, 24, 293, 29);
		messageStoragePanel.add(chckbxNewCheckBox_3);
		
		JCheckBox chckbxNewCheckBox_4 = new JCheckBox("Empty Trash on Exit");
		chckbxNewCheckBox_4.setBounds(11, 48, 177, 29);
		messageStoragePanel.add(chckbxNewCheckBox_4);
		
		JLabel lblNewLabel_2 = new JLabel("Message Store Type: ");
		lblNewLabel_2.setBounds(11, 76, 161, 21);
		messageStoragePanel.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(187, 72, 145, 29);
		messageStoragePanel.add(comboBox_1);
		
		textField = new JTextField();
		textField.setBounds(11, 141, 353, 27);
		messageStoragePanel.add(textField);
		textField.setColumns(10);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setBounds(379, 139, 93, 31);
		messageStoragePanel.add(btnBrowse);
		
		JLabel lblNewLabel_3 = new JLabel("Local directory:");
		lblNewLabel_3.setBounds(21, 114, 119, 21);
		messageStoragePanel.add(lblNewLabel_3);
		
		buttonsPanel = new JPanel();
		buttonsPanel.setLayout(null);
		GridBagConstraints gbc_buttonsPanel = new GridBagConstraints();
		gbc_buttonsPanel.fill = GridBagConstraints.BOTH;
		gbc_buttonsPanel.gridx = 0;
		gbc_buttonsPanel.gridy = 5;
		contentPane.add(buttonsPanel, gbc_buttonsPanel);
		
		OKButton = new JButton("OK");
		OKButton.setBounds(297, 56, 80, 23);
		buttonsPanel.add(OKButton);
		
		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(392, 56, 80, 23);
		buttonsPanel.add(cancelButton);
	}
}
