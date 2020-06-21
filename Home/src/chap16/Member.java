package chap16;

public class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;
	private String name;
	private int sex;
	private int age;
	private String job;
	

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	public String getJob() {
		return job;
	}
	public String getName() {
		return name;
	}

	public Member(String name, int sex, int age, String job) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.job = job;
	}

}
