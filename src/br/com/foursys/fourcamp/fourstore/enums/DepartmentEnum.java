package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum DepartmentEnum {
	VESTUARIO("51"), 
	CALCADO("52"), 
	ACESSORIOS("53"), 
	PERFUMARIA("54");
	
	public String key;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key =  key;
	}
	DepartmentEnum(String key) {
			this.key = key;
		
	}
	
	private static final Map<String,DepartmentEnum> lookup = new HashMap<String,DepartmentEnum>();
	
	
	static {
	      for(DepartmentEnum s : EnumSet.allOf(DepartmentEnum.class))
	           lookup.put(s.getKey(), s);
	 }
	
	 public static DepartmentEnum get(String key) { 
	      return lookup.get(key); 
	 }
}
