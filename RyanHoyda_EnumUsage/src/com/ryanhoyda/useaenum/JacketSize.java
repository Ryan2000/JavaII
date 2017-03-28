package com.ryanhoyda.useaenum;

public enum JacketSize {
	
    S("Small", 36),
    M ("Medium", 40),
    L ("Large", 44),
    EL ("Extra Large", 48);
	
	private String size;
	private int chest_size;
	
	private JacketSize(String size, int chest_size) {
		this.size = size;
		this.chest_size = chest_size;
	}

	public String getSize() {
		return size;
	}

	public int getChest_size() {
		return chest_size;
	}


	
	
	
	
}






