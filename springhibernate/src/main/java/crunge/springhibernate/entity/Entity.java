package crunge.springhibernate.entity;

public class Entity {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Entity [name=" + name + "]";
	}
	
}
