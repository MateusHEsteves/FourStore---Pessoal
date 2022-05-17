package br.com.foursys.fourcamp.fourstore.enums;

public enum PaymentMethod {
	CREDIT("Cartão de crédito", 1),
	DEBIT("Cartão de débito", 2),
	PIX("Pagamento via pix", 3),
	PAYPAL("Pagamento via paypal", 4),
	MONEY("Pagamento em dinheiro", 5);

	String description;
	int code;
	
	PaymentMethod(String description, int code) {
		this.description = description;
		this.code = code;
		
	}
	public String getDescription() {
		return description;
	}
	public int getCode() {
		return code;
	}
}
