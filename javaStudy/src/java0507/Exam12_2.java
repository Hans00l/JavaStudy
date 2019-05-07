package java0507;

public class Exam12_2 {
	public static void main(String[] args) {
		String file = "/home/temp/Java.class";
		String[] path = file.split("/");// 코드 작성
		for(int i = 0; i < path.length; i++) {
			System.out.println(path[i]);
		}
	}
}