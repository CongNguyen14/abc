package kits.learnvocab.dto;

import java.io.Serializable;

public class Word_langDto implements Serializable{
	private int id;
	private String name;
	private int lang_id;
	public Word_langDto(int id, String name, int lang_id) {
		super();
		this.id = id;
		this.name = name;
		this.lang_id = lang_id;
	}
	public Word_langDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLang_id() {
		return lang_id;
	}
	public void setLang_id(int lang_id) {
		this.lang_id = lang_id;
	}
	
	
}
