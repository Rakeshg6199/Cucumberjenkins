package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PageObjectModel extends BaseClass{
	

	public PageObjectModel() {
		PageFactory.initElements( driver, this);
	}

	@FindBy(xpath = "//h1[text()='Registration']")
	private WebElement textRegistration;
	
	@FindBy(id = "emailId")
	private WebElement txtEmail;
	
	@FindBy(id = "name")
	private WebElement txtName;
	
	@FindBy(id = "password")
	private WebElement txtPass;
	
	public WebElement getTextRegistration() {
		return textRegistration;
	}

	public void setTextRegistration(WebElement textRegistration) {
		this.textRegistration = textRegistration;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtName() {
		return txtName;
	}

	public void setTxtName(WebElement txtName) {
		this.txtName = txtName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnGender() {
		return btnGender;
	}

	public void setBtnGender(WebElement btnGender) {
		this.btnGender = btnGender;
	}

	public WebElement getBbtnSubmit() {
		return bbtnSubmit;
	}

	public void setBbtnSubmit(WebElement bbtnSubmit) {
		this.bbtnSubmit = bbtnSubmit;
	}

	public WebElement getTextSuccess() {
		return textSuccess;
	}

	public void setTextSuccess(WebElement textSuccess) {
		this.textSuccess = textSuccess;
	}

	@FindBy(xpath = "//label[@for='male']")
	private WebElement btnGender;
		
	@FindBy(xpath = "//a[text()='Submit']")
	private WebElement bbtnSubmit;
	
	@FindBy(xpath = "//h1[text()='Success']")
	private WebElement textSuccess;
	
	
	
}
