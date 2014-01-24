package com.sort.cn;

/**
 * 希尔排序（Shell排序）
 * 
 * Shell排序也是对直接插入排序算法的一种优化，因此可以说直接插入排序是一种特殊的Shell排序，Shell排序对直
 * 接插入排序的优化主要体现在，Shell排序通过使用一个增量序列（递减），每次把要排序的数组分成几个子数组，然后
 * 对子数组进行插入排序，这样可以减少比较和移动数据的次数，Shell排序是一种非常高效的排序算法，该算法的思想 是： 　　
 * 1.以h（h一般取n/2）为间隔将n个元素列分为几个小组，在每个小组内按直接插入法排序 　　 2.令h=h/2，重复第1步 　　
 * 3.当h=1时，排序结束（此时相当于直接插入排序，不过由于数据已经基本排好序，因此比较次数和移动次数比直 接插入排序少很多）
 * 
 * @author dfzhou
 * 
 */
public class ShellSort {

	public static void shellSort(int[] elements) {

		for (int h = elements.length / 2; h > 0; h /= 2)

		{

			for (int i = h; i < elements.length; i++)

			{

				int j = i % h;

				while (j <= i && elements[i] > elements[j])

					j += h; // 找到element[i]应该摆放的位置

				if (j < i)

				{

					// 将j之后的数据移动h位，然后把elements[i]移动到j处
					int temp = elements[i];

					for (int k = i - h; k >= j; k -= h)

					{

						elements[k + h] = elements[k];
					}

					elements[j] = temp;
				}

			}

		}
	}

}
