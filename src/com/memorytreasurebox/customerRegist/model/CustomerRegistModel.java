package com.memorytreasurebox.customerRegist.model;

public class CustomerRegistModel {

	/** USERID */
	private String userID;
	/** パスワード */
	private String password;
	/** 名前姓 */
	private String userSei;
	/** 名前名 */
	private String userMei;
	/** メールアドレス */
	private String email;

	/**
	* コンストラクタ
	*/
	CustomerRegistModel() {
	};
	
	/**
	 * コンストラクタ2
	 * @param userID
	 * @param password
	 * @param userSei
	 * @param userMei
	 * @param email
	 */
	CustomerRegistModel(String userID,String password,String userSei,String userMei,String email) {
		
		this.userID = userID;
		this.password = password;
		this.userSei = userSei;
		this.userMei = userMei;
		this.email = email;
		
	};
	

}
