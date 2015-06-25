package algorithm.sortTest;

import com.cqupt.algorithm.sort.HeapSort;
import com.cqupt.algorithm.sort.Sort;

public class HeapSortTest {

	public static void main(String[] args) {
		Sort<Double> heapSort = new HeapSort<Double>();
		Double[] r = { 2.0, 9.0, 5.0, 3.0, 21.0, 4.0, 6.0 };
		heapSort.sort(r, r.length);

		System.out.println("排序完成");
		for (double d : r) {
			System.out.print(d + " ");
		}
	}
}
