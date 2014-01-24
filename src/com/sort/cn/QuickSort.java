package com.sort.cn;

/**
 * 快速排序
 * 
 * 另一种经典的交换排序是快速排序，快速排序的效率很高，但是空间复杂度较大，因为快速排序使用了递归，而递归的实现需要一个栈。快速排序的算法思想是：（
 * 假设数据存放在数组a[n]中）
 * 
 * 　　1.如果待比较的数组长度为0或者1，则不用比较，直接返回。
 * 
 * 　　2.如果待比较的数组长度大于1，则随机的选择一个中枢值（centrum），然后分别从数组的两端开始遍历，
 * 并且把从左边遍历找到的大于centrum的元素和从右边遍历找到的小于centrum的元素进行交换
 * ，直到数组遍历完毕（即：左边遍历指针指向的索引大于或等于右边遍历指针指向的索引）。
 * 
 * 　　3.交换中枢元素和右边遍历指针指向的元素，这样原来的数组以中枢元素为界分成了两个数组，且左边数组的元素都不大于中枢，右边数组的元素都不小于中枢，
 * 然后分别对两个子数组分别进行快速排序。
 * 
 * @author dfzhou
 * 
 */
public class QuickSort {

	public static void quickSort(int[] elements, int begin, int end) {

		if (begin < end)

		{
			int centrum = elements[begin];// 选择第一个元素作为中枢

			int front = begin + 1;

			int back = end;

			while (front <= back)

			{
				while ((front <= end) && (elements[front] < centrum))

					front++;

				while ((back >= begin) && (elements[back] > centrum))

					back--;

				if (front < back)

				{
					swap(elements, front, back);

				} else {

					break;

				}

			}

			if (begin < back)

				swap(elements, begin, back);

			quickSort(elements, begin, back - 1);

			quickSort(elements, back + 1, end);
		}

	}

	private static void swap(int[] elements, int i, int j) {

		int temp = elements[i];

		elements[i] = elements[j];

		elements[j] = temp;

	}

}
