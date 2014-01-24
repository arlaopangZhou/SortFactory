package com.sort.cn;


/**
 * ������

        �������㷨��ֱ��ѡ�������㷨���Ĳ�ͬ���ڣ��������㷨������ô󶥶Ѻ���ȫ�����������ʣ�����ÿ������  ��Ľṹ��ͬʱ����ÿ�αȽ�ֻ�ǱȽϸ��ڵ�������ӽڵ㣬��˴�󽵵��˱ȽϵĴ����ͽ����Ĵ������Ӷ����Ч�ʣ��������㷨��ʱ�临�Ӷ���O(nlogn����2Ϊ��)��

�����������㷨��˼���ǣ����������ݷ���һ������a�У�������ĳ�����N��

����1��������aΪ���ݣ�����һ���󶥶ѣ��������ڶ�������ÿ���ڵ㣬���ڵ����Ǳ��ӽڵ����ʵû��ҪҪ���������ÿ������Ҳ�Ǵ󶥶ѣ�

����2�������󶥶ѵĸ��ڵ������a�е����һ���ڵ㣨���һ���ڵ㲻�ڲ����ߵĹ�����

�����ظ��ϱߵĹ���������N-1�κ�����a�Ѿ��ź���
 * @author dfzhou
 *
 */
public class HeapSort {

	public static void heapSort(int[] elements){ 

        for(int i = elements.length-1; i > 0; i--)
  
        { 
            buildHeap(elements,i);//���� 

            swap(elements,0,i);//�������ڵ�����һ���ڵ� 
        } 
} 
      
private static void buildHeap(int[] elements,int lastIndex){ 

        int lastParentIndex = (lastIndex-1)/2;//������һ�����ڵ� 

        for(int i = lastParentIndex; i >=0; i--)

        { 
            int parent = elements[i];
 
            int leftChild = elements[i*2+1];//��ڵ�϶����� 

            int rightChild = leftChild; 
 
            if(i*2+2 <=lastIndex)

            { 
                 rightChild = elements[i*2+2];//�ҽڵ㲻һ������ 
            } 
            
            int maxIndex = leftChild<rightChild?i*2+2:i*2+1; 

            if(parent < elements[maxIndex])

            { 
                swap(elements,i,maxIndex); 
            } 
        } 
} 
      
private static void swap(int[] elements,int firstIndex,int secondIndex){ 

        int temp = elements[firstIndex]; 
 
        elements[firstIndex] = elements[secondIndex]; 

        elements[secondIndex] = temp; 

}
	
}
