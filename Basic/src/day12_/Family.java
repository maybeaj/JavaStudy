package day12_;
import java.util.ArrayList;

import day12_.FamilyTest;

public class Family {
	
	private String euihyun;
	private String hyojin;
	private String mother;
	private String father;

	public Family(String euihyun, String hyojin, String mother, String father) {
		this.euihyun = euihyun;
		this.hyojin = hyojin;
		this.mother = mother;
		this.father = father;
	}
	public ArrayList<String> getFamilyName() {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add(euihyun);
		arrayList.add(father);
		arrayList.add(mother);
		arrayList.add(hyojin);
		return arrayList;
	}
	
	public String gsEuihyun(String euihyun) {
		this.euihyun = euihyun;
		return this.euihyun;
	}
	public String getHyojin() {
		return hyojin;
	}
	public void setHyojin(String hyojin) {
		this.hyojin = hyojin;
	}
	public String getMother() {
		return mother;
	}
	public void setMother(String mother) {
		this.mother = mother;
	}
	public String getFather() {
		return father;
	}
	public void setFather(String father) {
		this.father = father;
	}
	
}
