package main.java.com.magicvet.model;

public abstract class Pet {

	private String type;
	private String sex;
	private String age;
	private String name;
	private String ownerName;

	@Override
	public String toString() {
		return "Pet {"
				+ "type = " + type
				+ ", sex = " + sex
				+ ", age = " + age
				+ ", name = " + name
				+ ", ownerName = " + ownerName
				+ "}";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
}
