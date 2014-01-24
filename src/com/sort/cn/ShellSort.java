package com.sort.cn;

/**
 * ϣ������Shell����
 * 
 * Shell����Ҳ�Ƕ�ֱ�Ӳ��������㷨��һ���Ż�����˿���˵ֱ�Ӳ���������һ�������Shell����Shell�����ֱ
 * �Ӳ���������Ż���Ҫ�����ڣ�Shell����ͨ��ʹ��һ���������У��ݼ�����ÿ�ΰ�Ҫ���������ֳɼ��������飬Ȼ��
 * ����������в��������������Լ��ٱȽϺ��ƶ����ݵĴ�����Shell������һ�ַǳ���Ч�������㷨�����㷨��˼�� �ǣ� ����
 * 1.��h��hһ��ȡn/2��Ϊ�����n��Ԫ���з�Ϊ����С�飬��ÿ��С���ڰ�ֱ�Ӳ��뷨���� ���� 2.��h=h/2���ظ���1�� ����
 * 3.��h=1ʱ�������������ʱ�൱��ֱ�Ӳ������򣬲������������Ѿ������ź�����˱Ƚϴ������ƶ�������ֱ �Ӳ��������ٺࣩܶ
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

					j += h; // �ҵ�element[i]Ӧ�ðڷŵ�λ��

				if (j < i)

				{

					// ��j֮��������ƶ�hλ��Ȼ���elements[i]�ƶ���j��
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
