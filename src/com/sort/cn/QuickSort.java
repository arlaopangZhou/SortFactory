package com.sort.cn;

/**
 * ��������
 * 
 * ��һ�־���Ľ��������ǿ������򣬿��������Ч�ʺܸߣ����ǿռ临�ӶȽϴ���Ϊ��������ʹ���˵ݹ飬���ݹ��ʵ����Ҫһ��ջ������������㷨˼���ǣ���
 * �������ݴ��������a[n]�У�
 * 
 * ����1.������Ƚϵ����鳤��Ϊ0����1�����ñȽϣ�ֱ�ӷ��ء�
 * 
 * ����2.������Ƚϵ����鳤�ȴ���1���������ѡ��һ������ֵ��centrum����Ȼ��ֱ����������˿�ʼ������
 * ���ҰѴ���߱����ҵ��Ĵ���centrum��Ԫ�غʹ��ұ߱����ҵ���С��centrum��Ԫ�ؽ��н���
 * ��ֱ�����������ϣ�������߱���ָ��ָ����������ڻ�����ұ߱���ָ��ָ�����������
 * 
 * ����3.��������Ԫ�غ��ұ߱���ָ��ָ���Ԫ�أ�����ԭ��������������Ԫ��Ϊ��ֳ����������飬����������Ԫ�ض����������࣬�ұ������Ԫ�ض���С�����࣬
 * Ȼ��ֱ������������ֱ���п�������
 * 
 * @author dfzhou
 * 
 */
public class QuickSort {

	public static void quickSort(int[] elements, int begin, int end) {

		if (begin < end)

		{
			int centrum = elements[begin];// ѡ���һ��Ԫ����Ϊ����

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
