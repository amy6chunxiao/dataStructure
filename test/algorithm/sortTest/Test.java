package algorithm.sortTest;

public class Test implements Comparable {

	private double num;

	public Test(double num) {
		this.num = num;
	}

	@Override
	public int compareTo(Object o) {
		Test test = (Test) o;
		return (int) (num - test.num);
	}

	public double getNum() {
		return num;
	}

	public void setNum(double num) {
		this.num = num;
	}

}
