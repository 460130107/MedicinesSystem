package cn.com.views.settings;

import java.awt.Dialog;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import cn.com.service.settings.AddSupplierService;

public class AddSupplierDialog extends JDialog{
	private JLabel lblId;
	private JLabel lblName;
	private JLabel lblContact;
	private JLabel lblTel;
	private JLabel lblAddr;
	private JLabel lblNote;
	private JTextField textId;
	private JTextField textName;
	private JTextField textContact;
	private JTextField textTel;
	private JTextField textAddr;
	private JTextField textNote;
	private JButton btnSave;
	private JButton btnExit;
	private SupplierSetDialog sd;
	public AddSupplierDialog(SupplierSetDialog sd){
		this.sd = sd;
	}
	public JTextField getTextId() {
		return textId;
	}
	public void setTextId(JTextField textId) {
		this.textId = textId;
	}
	public JTextField getTextName() {
		return textName;
	}
	public void setTextName(JTextField textName) {
		this.textName = textName;
	}
	public JTextField gettextContact() {
		return textContact;
	}
	public void setTextHead(JTextField textContact) {
		this.textContact = textContact;
	}
	public JTextField getTextTel() {
		return textTel;
	}
	public void setTextTel(JTextField textTel) {
		this.textTel = textTel;
	}
	public JTextField getTextAddr() {
		return textAddr;
	}
	public void setTextAddr(JTextField textAddr) {
		this.textAddr = textAddr;
	}
	public JTextField getTextNote() {
		return textNote;
	}
	public void setTextNote(JTextField textNote) {
		this.textNote = textNote;
	}
	public JButton getBtnSave() {
		return btnSave;
	}
	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	public JButton getBtnExit() {
		return btnExit;
	}
	public void setBtnExit(JButton btnExit) {
		this.btnExit = btnExit;
	}
	
	/**
	 * @wbp.parser.constructor
	 */
	public AddSupplierDialog(SupplierSetDialog sd,String title,boolean model) {
		super(sd,title,model);
		lblId = new JLabel("供货商编号*：");
		lblName = new JLabel("供货商名称*：");
		lblContact = new JLabel("联系人：");
		lblTel = new JLabel("联系电话：");
		lblAddr = new JLabel("供货商地址：");
		lblNote = new JLabel("备注：");
		textId = new JTextField();
		textName = new JTextField();
		textContact = new JTextField();
		textTel = new JTextField();
		textAddr = new JTextField();
		textNote = new JTextField();
		btnSave = new JButton("保存");
		btnExit = new JButton("退出");
		init();
	}
	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("增加供货商");
		this.setSize(415, 345);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(getOwner());
		this.setResizable(false);
		getContentPane().setLayout(null);
		
		lblId.setBounds(37, 10, 83, 23);
		getContentPane().add(lblId);
		
		lblName.setBounds(37, 50, 83, 23);
		getContentPane().add(lblName);
		
		lblContact.setBounds(47, 90, 58, 23);
		getContentPane().add(lblContact);
		
		lblTel.setBounds(37, 130, 72, 23);
		getContentPane().add(lblTel);
		
		lblAddr.setBounds(37, 170, 83, 23);
		getContentPane().add(lblAddr);
		
		lblNote.setBounds(60, 210, 49, 23);
		getContentPane().add(lblNote);
		
	
		textId.setBounds(119, 11, 213, 21);
		getContentPane().add(textId);
		textId.setColumns(10);
		

		textName.setColumns(10);
		textName.setBounds(119, 51, 213, 21);
		getContentPane().add(textName);
		
		textContact.setColumns(10);
		textContact.setBounds(119, 91, 213, 21);
		getContentPane().add(textContact);
		
		textTel.setColumns(10);
		textTel.setBounds(119, 131, 213, 21);
		getContentPane().add(textTel);
		
		textAddr.setColumns(10);
		textAddr.setBounds(119, 171, 213, 21);
		getContentPane().add(textAddr);
		
		textNote.setColumns(10);
		textNote.setBounds(119, 211, 213, 38);
		getContentPane().add(textNote);
		
		btnSave.setBounds(118, 259, 93, 36);
		getContentPane().add(btnSave);
		
		btnExit.setBounds(239, 259, 93, 36);
		getContentPane().add(btnExit);
	
		
		
		
		AddSupplierService ads = new AddSupplierService(this,sd);
		btnSave.setActionCommand("Save");
		btnExit.setActionCommand("Exit");
		
		btnSave.addActionListener(ads);
		btnExit.addActionListener(ads);
		
		this.setVisible(true);
	}

}
