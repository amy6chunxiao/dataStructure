package algorithm.sortTest;

import com.cqupt.algorithm.sort.InsertSort;
import com.cqupt.algorithm.sort.Sort;

public class InsertSortTest {
	public static void main(String[] args) {
		 Sort<Test> insertSort = new InsertSort<Test>();
		 Test test1 = new Test(3);
		 Test test2 = new Test(1);
		 Test test3 = new Test(4);
		 Test test4 = new Test(2);
		 Test test5 = new Test(5);
		
		 Test[] array = { test1, test2, test3, test4, test5 };
		 insertSort.sort(array, array.length - 1);
		
		 System.out.println("排序完成：");
		 for (Test d : array) {
		 System.out.print(d.getNum() + " ");
		 }
		 
//		Sort<Double> insertSort = new InsertSort<Double>();
//		Double[] array = {2.0, 4.0, 2.0, 5.0, 9.0, 12.0, 3.0, 10.0, 1.0, 1.0};
//		insertSort.sort(array, array.length);
//
//		System.out.println("排序完成：");
//		for (double d : array) {
//			System.out.print(d + " ");
//		}
	}
}
