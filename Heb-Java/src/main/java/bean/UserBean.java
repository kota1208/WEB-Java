package bean;

import java.io.Serializable;

import exception.CreateException;

public class UserBean implements Serializable{
	private String userPass;
//	都道府県
	private String userPrefectures;
//	市町村
	private String userMunicipality;
//	部門ID
	private int userDepartmentID;
//	ユーザのフリガナ
	private String userHurigana;
//	性別
	private String userGender;
//	検索キーワード
	private String searchWord;
//	ユーザを識別するきー
	private String userID;
//	ユーザー名
	private String userName;
//	生年月日
	private String userBirthday;
//	ログインや、追加などのリクエストを格納
	private String request;
//	JFrameやServletなどの環境を格納
	private String environment;



	public String getUserBirthday() {
		return userBirthday;
	}
	public void setUserBirthday(String userBirthday) throws CreateException{

		this.userBirthday = userBirthday;
	}

	public String getSearchWord() {
		return searchWord;
	}
	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID)throws CreateException {
		if(userID.equals("")) {
			throw new CreateException("ユーザIDを入力してください");
		}
		this.userID = userID;
	}

	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName)throws CreateException {
		if(userName.equals("")) {
			throw new CreateException("氏名を入力してください");
		}
		this.userName = userName;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass)throws CreateException {
		if(userPass.equals("")) {
			throw new CreateException("パスワードを入力してください");
		}
		this.userPass = userPass;
	}
	public String getUserPrefectures() {
		return userPrefectures;
	}
	public void setUserPrefectures(String userPrefectures)throws CreateException {
		if(userPrefectures.equals("未選択")) {
			throw new CreateException("都道府県を選択してください");
		}
		
		if(userPrefectures.equals("")) {
			throw new CreateException("都道府県を入力してください");
		}
		this.userPrefectures = userPrefectures;
	}
	public String getUserMunicipality() {
		return userMunicipality;
	}
	public void setUserMunicipality(String userMunicipality) throws CreateException{
		if(userMunicipality==null) {
			throw new CreateException("市区町村を選択してください");
		}
		
		if(userMunicipality.equals("")) {
			throw new CreateException("市区町村を入力してください");
		}
		
		this.userMunicipality = userMunicipality;
	}
	public int getUserDepartmentID() {
		return userDepartmentID;
	}
	public void setUserDepartmentID(int userDepartmentID) {
		this.userDepartmentID = userDepartmentID;
	}
	public String getUserHurigana() {
		return userHurigana;
	}
	public void setUserHurigana(String userHurigana)throws CreateException {
		if(userHurigana.equals("")) {
			throw new CreateException("フリガナを入力してください");
		}
		this.userHurigana = userHurigana;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender)throws CreateException {
		if(userGender.equals("F") ||userGender.equals("M")) {
			this.userGender = userGender;
		}else {
			throw new CreateException("性別をFかMで選択してください");
		}
	}

	public String getRequest() {
		return request;
	}
	public void setRequest(String request) {
		this.request = request;
	}
}
