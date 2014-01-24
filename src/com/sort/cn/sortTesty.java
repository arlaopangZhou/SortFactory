package com.sort.cn;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 
 * @author LiuB
 */
public class sortTesty {

	// ���������Ͻ�������,����
	public void sortIntArray() {
		int[] array = new int[] { 8, 5, 9, 0, 6, 3, 4, 7, 2, 1 };
		System.out.println("��������ǰ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		Arrays.sort(array);
		System.out.println("���������");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// ���������Ͻ�������,����,ð��
	private static void descendSort() {
		int[] array = new int[] { 8, 5, 9, 0, 6, 3, 4, 7, 2, 1 };
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[j]>array[i]){
                    int t=array[j];
                    array[j]=array[i];
                    array[i]=t;
                }
            }
        }
    }
	
	// ���ַ������Ͻ�������
	public void sortStringArray() {
		String[] array = new String[] { "a", "c", "e", "d", "b" };
		System.out.println("�ַ�������ǰ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("�ַ��������");
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	// �Զ��󼯺Ͻ�������
	public void sortObjectArray() {
		Dog o1 = new Dog("dog1", 1);
		Dog o2 = new Dog("dog2", 4);
		Dog o3 = new Dog("dog3", 5);
		Dog o4 = new Dog("dog4", 2);
		Dog o5 = new Dog("dog5", 3);
		Dog[] dogs = new Dog[] { o1, o2, o3, o4, o5 };
		System.out.println("��������ǰ");
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			System.out.print(dog.getName() + ":" + dog.getWeight() + " ");
		}
		System.out.println();
		Arrays.sort(dogs, new ByWeightComparator());
		System.out.println("���������");
		for (int i = 0; i < dogs.length; i++) {
			Dog dog = dogs[i];
			System.out.print(dog.getName() + ":" + dog.getWeight() + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		sortTesty t = new sortTesty();
		t.sortIntArray();
		t.sortStringArray();
		t.sortObjectArray();
	}
}	





// ���Զ���Dog
class Dog {
	private String name;
	private int weight;

	public Dog(String name, int weight) {
		this.setName(name);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}

// �Ƚ�������Dog��������Ϊ�ȽϵĻ�׼
class ByWeightComparator implements Comparator {
	public int compare(Dog o1, Dog o2) {
		int diff = o1.getWeight() - o2.getWeight();
		if (diff > 0)
			return 1;
		if (diff < 0)
			return -1;
		else
			return 0;
	}

	public int compare(Object o1, Object o2) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
