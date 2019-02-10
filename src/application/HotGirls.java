package application;

public class HotGirls {
	
	private int code;
	private String name;
	private int age;
	private String address;
	
	public HotGirls(int code, String name, int age, String address) {
		super();
		this.code = code;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public HotGirls() {
		super();
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getCode()+" | "+this.getName()+" | "+this.getAge()+" | "+this.getAddress();
	}
}
