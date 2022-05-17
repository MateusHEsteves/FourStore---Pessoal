package br.com.foursys.fourcamp.fourstore.model;

import br.com.foursys.fourcamp.fourstore.enums.CategoryEnum;
import br.com.foursys.fourcamp.fourstore.enums.ColorEnum;
import br.com.foursys.fourcamp.fourstore.enums.DepartmentEnum;
import br.com.foursys.fourcamp.fourstore.enums.TypeEnum;

public class Product {
	private String id;
	private String sku;
	private Integer qtt;
	private Double originalPrice;
	private Double salePrice;
	private TypeEnum type; 
	private String size;
	private ColorEnum color;
	private CategoryEnum category;
	private DepartmentEnum departament;
	private String description;
	
	

	public Product(String sku, Integer qtt) {
		super();
		this.sku = sku;
		this.qtt = qtt;
	}
	public Product(String sku, Integer qtt, Double originalPrice, Double salePrice) {
		super();
		this.sku = sku;
		this.qtt = qtt;
		this.salePrice = salePrice;
		this.originalPrice = originalPrice;
		parseSku(sku);
	}

	public Product(String sku, Integer qtt, Double originalPrice, Double salePrice,  String description) {
		super();
		this.sku = sku;
		this.qtt = qtt;
		this.originalPrice = originalPrice;
		this.salePrice = salePrice;
		this.description = description;
		parseSku(sku);
	}
	
	
	
	public Integer getQtt() {
		return qtt;
	}
	public void setQtt(Integer qtt) {
		this.qtt = qtt;
	}
	public Double getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(Double originalPrice) {
		this.originalPrice = originalPrice;
	}
	public Double getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public TypeEnum getType() {
		return type;
	}
	public void setType(TypeEnum type) {
		this.type = type;
	}
	public ColorEnum getColor() {
		return color;
	}
	public void setColor(ColorEnum color) {
		this.color = color;
	}
	public CategoryEnum getCategory() {
		return category;
	}
	public void setCategory(CategoryEnum category) {
		this.category = category;
	}
	public DepartmentEnum getDepartament() {
		return departament;
	}
	public void setDepartament(DepartmentEnum departament) {
		this.departament = departament;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String descryption) {
		this.description = descryption;
	}
	public String getSku() {
		return sku;
	}
	
	
	private void parseSku(String sku) {
		
		this.id =  sku.substring(0,3);
		this.color = color.get(sku.substring(3,5))  ;
		this.departament = departament.get(sku.substring(5,7)) ;
		this.type=  type.get(sku.substring(7,10));
		this.category = category.get( sku.substring(10, 12));
		
	}
	
}
