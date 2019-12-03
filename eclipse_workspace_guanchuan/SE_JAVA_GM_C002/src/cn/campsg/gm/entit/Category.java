package cn.campsg.gm.entit;

public class Category {
	
	private int id;
	public String firstLevel;
	public String secondLevel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstLevel() {
		return firstLevel;
	}
	public void setFirstLevel(String firstLevel) {
		this.firstLevel = firstLevel;
	}
	public String getSecondLevel() {
		return secondLevel;
	}
	public void setSecondLevel(String secondLevel) {
		this.secondLevel = secondLevel;
	}
	
	public Category() {
		
	}
	
	public Category(int id, String firstLevel, String secondLevel) {
		super();
		this.id = id;
		this.firstLevel = firstLevel;
		this.secondLevel = secondLevel;
	}
	@Override
	public String toString() {
		return firstLevel + ">" + secondLevel;
	}
	
	
}
