package com.collection.cn;

/**
* ¸ù¾İorder¶ÔUserÅÅĞò
*/

public class User implements Comparable<User> {

	private String name;
    private Integer order;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getOrder() {
        return order;
    }
    public void setOrder(Integer order) {
        this.order = order;
    }
	
	@Override
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		return this.getOrder().compareTo(o.getOrder());
	}

}
