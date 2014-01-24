package com.collection.cn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
        User user1 = new User();
        user1.setName("a");
        user1.setOrder(1);
        User user2 = new User();
        user2.setName("b");
        user2.setOrder(2);
        List<User> list = new ArrayList<User>();
        //¥À¥¶add user2‘Ÿadd user1
        list.add(user2);
        list.add(user1);
        Collections.sort(list);
        for(User u : list){
            System.out.println(u.getName());
        }
    }
	
}
