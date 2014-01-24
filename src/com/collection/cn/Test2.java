package com.collection.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	
	public static void main(String[] args) {
        User user1 = new User();
        user1.setName("a");
        user1.setOrder(1);
        User user2 = new User();
        user2.setName("b");
        user2.setOrder(2);
        List<User> list = new ArrayList<User>();
        list.add(user2);
        list.add(user1);
       
        Collections.sort(list,new Comparator<User>(){
            public int compare(User arg0, User arg1) {
                return arg0.getOrder().compareTo(arg1.getOrder());
            }
        });
        for(User u : list){
            System.out.println(u.getName());
        }
    }

}
