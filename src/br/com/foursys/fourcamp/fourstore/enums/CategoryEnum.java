package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum CategoryEnum {
	
	MASCULINO("MS"), 
	FEMININO("FM"), 
	INFANTIL("IN"), 
	BABY("BB");
	
	public String key;
	
	public String getKey() {
		return key;
	}
	
	CategoryEnum(String key) {
			this.key = key;
		
	}
	private static final Map<String,CategoryEnum> lookup = new HashMap<String,CategoryEnum>();
	static {
	      for(CategoryEnum s : EnumSet.allOf(CategoryEnum.class))
	           lookup.put(s.getKey(), s);
	 }
	
	 public static CategoryEnum get(String key) { 
	      return lookup.get(key); 
	 }
}
