package com.sort.cn;

/**
 *插入排序

   插入排序是一种通过不断地把新元素插入到已排好序的数据中的排序算法，常用的插入排序算法包括直接插入排序和shell排序。

 （1）直接插入排序

         直接插入排序实现比较简单，但是直接插入没有充分的利用已插入的数据已经排序这个事实，因此有很多针对直    接插入排序改进的算法，例如折半插入排序等，下边是直接插入排序的Java实现：
 * @author dfzhou
 *
 */
public class InsertSort {

	public static void insertSort(int[] elements){ 

        for(int i = 1;i <elements.length; i++)
        
        { 
             int j = -1; 
             
             //找到element[i]应该摆放的位置，此处可以利用查找算法进行优化 
             while(j <= i && elements[i] > elements[++j]);

                  if(j < i)
                  { 

                      //将j之后的数据移动一位，然后把elements[i]移动到j处 
                      int temp = elements[i]; 

                      for(int k = i-1;k >= j;k--)
               
                      { 

                          elements[k+1] = elements[k]; 

                      } 

                      elements[j] = temp; 
                  } 

          } 
     }
}
