package algorithm.dpTest;

import java.util.ArrayList;
import java.util.List;

import com.cqupt.algorithm.dynamicProgramming.TowerBlaster;

public class TowerBlasterTest {
	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();

		list1.add(2);
		list2.add(3);
		list2.add(4);
		list3.add(6);
		list3.add(5);
		list3.add(7);
		list4.add(4);
		list4.add(1);
		list4.add(8);
		list4.add(3);

		triangle.add(list1);
		triangle.add(list2);
		triangle.add(list3);
		triangle.add(list4);

		TowerBlaster towerBlaster = new TowerBlaster();
		System.out.println(towerBlaster.minimumTotal(triangle));
		System.out.println(towerBlaster.recurMinimumTotal(triangle));
	}
}
