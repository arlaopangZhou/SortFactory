package com.sort.cn;

/**
 *��������

   ����������һ��ͨ�����ϵذ���Ԫ�ز��뵽���ź���������е������㷨�����õĲ��������㷨����ֱ�Ӳ��������shell����

 ��1��ֱ�Ӳ�������

         ֱ�Ӳ�������ʵ�ֱȽϼ򵥣�����ֱ�Ӳ���û�г�ֵ������Ѳ���������Ѿ����������ʵ������кܶ����ֱ    �Ӳ�������Ľ����㷨�������۰��������ȣ��±���ֱ�Ӳ��������Javaʵ�֣�
 * @author dfzhou
 *
 */
public class InsertSort {

	public static void insertSort(int[] elements){ 

        for(int i = 1;i <elements.length; i++)
        
        { 
             int j = -1; 
             
             //�ҵ�element[i]Ӧ�ðڷŵ�λ�ã��˴��������ò����㷨�����Ż� 
             while(j <= i && elements[i] > elements[++j]);

                  if(j < i)
                  { 

                      //��j֮��������ƶ�һλ��Ȼ���elements[i]�ƶ���j�� 
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
