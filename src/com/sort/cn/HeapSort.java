package com.sort.cn;


/**
 * 堆排序

        堆排序算法和直接选择排序算法最大的不同在于，堆排序算法充分利用大顶堆和完全二叉树的性质，保留每次排序  后的结构，同时由于每次比较只是比较根节点和它的子节点，因此大大降低了比较的次数和交换的次数，从而提高效率，堆排序算法的时间复杂度是O(nlogn，以2为底)。

　　堆排序算法的思想是：（假设数据放在一个数组a中，且数组的长度是N）

　　1：以数组a为数据，建立一个大顶堆（这样对于二叉树的每个节点，根节点总是比子节点大，其实没必要要求二叉树的每个子树也是大顶堆）

　　2：交换大顶堆的根节点和数组a中的最后一个节点（最后一个节点不在参与后边的工作）

　　重复上边的工作，经过N-1次后，数组a已经排好序。
 * @author dfzhou
 *
 */
public class HeapSort {

	public static void heapSort(int[] elements){ 

        for(int i = elements.length-1; i > 0; i--)
  
        { 
            buildHeap(elements,i);//建堆 

            swap(elements,0,i);//交换根节点和最后一个节点 
        } 
} 
      
private static void buildHeap(int[] elements,int lastIndex){ 

        int lastParentIndex = (lastIndex-1)/2;//获得最后一个父节点 

        for(int i = lastParentIndex; i >=0; i--)

        { 
            int parent = elements[i];
 
            int leftChild = elements[i*2+1];//左节点肯定存在 

            int rightChild = leftChild; 
 
            if(i*2+2 <=lastIndex)

            { 
                 rightChild = elements[i*2+2];//右节点不一定存在 
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
