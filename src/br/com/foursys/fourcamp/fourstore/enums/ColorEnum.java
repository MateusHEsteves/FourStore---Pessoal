package br.com.foursys.fourcamp.fourstore.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum ColorEnum {
	BRANCO("01"), 
	AZUL("02"), 
	VERMELHO("03"), 
	AMARELO("04"), 
	VERDE("05"), 
	LARANJA("06"), 
	ROXO("07"), 
	CINZA("08"), 
	MARROM("09"), 
	PRETO("10");
	
	public String key;
	
	public String getKey() {
		return key;
	}
	ColorEnum(String key) {
			this.key = key;
		
	}
	
	private static final Map<String,ColorEnum> lookup = new HashMap<String,ColorEnum>();
	
	
	static {
	      for(ColorEnum s : EnumSet.allOf(ColorEnum.class))
	           lookup.put(s.getKey(), s);
	 }
	
	 public static ColorEnum get(String key) { 
	      return lookup.get(key); 
	 }
}
