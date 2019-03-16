import java.util.Scanner;

public class Coco {

	public static void main(String[] args) {
		int n;
		System.out.println(" 请输入一行，回车确认 :");
		String lin = new Scanner(System.in).nextLine();//读取一行
		for(char c='a'; c<='z'; c++) {//让c等于小写字母
			n=0;
			for(int i=0; i<lin.length(); i++) {//遍历字符串
				if(c == lin.charAt(i))//判断是否有等于c的小写字母
					n++;
			}
			if(n != 0)
				System.out.println(c+" : "+n);
		}		
	}

}
