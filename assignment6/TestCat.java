package assignment6;

public class TestCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("cat","xuyishu","white","50");
		cat.setSex(4);
		System.out.println(cat);
		cat.setBoardStart(66, 25, 1000);
		cat.setBoardEnd(3, 9, 1001);
		System.out.println(""+cat.boarding(2, 25, 1001));
	}

}
