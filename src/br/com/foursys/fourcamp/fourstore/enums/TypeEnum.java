package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum TypeEnum {

	INVERNO("101"),
	VERAO("102"),
	INTIMO("103"),
	ACESSORIOS("104"),
	GERAL("106");
	
	public String key;
	
	
	public String getKey() {
		return key;
	}
	
	TypeEnum(String key) {
		this.key = key;
	
	}	
	private static final Map<String,TypeEnum> lookup = new HashMap<String,TypeEnum>();
	static {
	      for(TypeEnum s : EnumSet.allOf(TypeEnum.class))
	           lookup.put(s.getKey(), s);
	 }
	
	 public static TypeEnum get(String key) { 
	      return lookup.get(key); 
	 }
}
