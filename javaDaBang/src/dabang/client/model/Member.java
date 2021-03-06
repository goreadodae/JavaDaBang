package dabang.client.model;

public class Member {
	private String id;        //아이디
	private String passWord;  //비밀번호
	private String nickName;  //별명 
	private String name;      //이름
	private int sclc;//1양력, 2음력
	private int ageY;
	private int ageM;
	private int ageD;
	private char gender;
	private String phoneNumber;  //폰번
	private String grade;     //회원등급
	private double point;     //포인트

	public Member() {}

	public Member(String id, String passWord, String nickName, String name, int sclc, int ageY, int ageM, int ageD,
			char gender, String phoneNumber, String grade, double point) {
		super();
		this.id = id;
		this.passWord = passWord;
		this.nickName = nickName;
		this.name = name;
		this.sclc = sclc;
		this.ageY = ageY;
		this.ageM = ageM;
		this.ageD = ageD;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.grade = grade;
		this.point = point;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getSclc() {
		return sclc;
	}

	public void setSclc(int sclc) {
		this.sclc = sclc;
	}
	public int getAgeY() {
		return ageY;
	}
	public void setAgeY(int ageY) {
		this.ageY = ageY;
	}
	public int getAgeM() {
		return ageM;
	}
	public void setAgeM(int ageM) {
		this.ageM = ageM;
	}
	public int getAgeD() {
		return ageD;
	}
	public void setAgeD(int ageD) {
		this.ageD = ageD;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	@Override
	public String toString()
	{
		return 
				this.nickName     +"님의 정보"+
				this.name         +" \t\t"+
				this.phoneNumber  +" \t\t"+
				this.grade        +" \t\t"+
				this.point;
	}

}