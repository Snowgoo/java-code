import java.util.Scanner;

public class Coco {

	public static void main(String[] args) {
		int n;
		System.out.println(" ������һ�У��س�ȷ�� :");
		String lin = new Scanner(System.in).nextLine();//��ȡһ��
		for(char c='a'; c<='z'; c++) {//��c����Сд��ĸ
			n=0;
			for(int i=0; i<lin.length(); i++) {//�����ַ���
				if(c == lin.charAt(i))//�ж��Ƿ��е���c��Сд��ĸ
					n++;
			}
			if(n != 0)
				System.out.println(c+" : "+n);
		}		
	}

}
