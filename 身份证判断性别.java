package xiongzheng;

import java.util.Scanner;

public class JudgeSex.java {
	public static void main(String[] args){
		System.out.println("���������֤���룺");
		Scanner in = new Scanner(System.in);
		String a ;
		char[] b ;
		while(true){
			a = in.nextLine();
			b = a.toCharArray(); 
			if(b.length!=18){
				System.out.println("������18λ���֤��:");
				continue;
			}
			for(int i=0;i<18;i++){
				if(!Character.isDigit(b[i])){
					System.out.println("��������ȷ�����֤��:");
					continue;
				}
			}
			if(!Character.isDigit(b[18])){
				if(b[18]!='x'){
					System.out.println("��������ȷ�����֤��:");
					continue;
				}
			}
			if(b[17]%2==0){
				System.out.println("�Ա�Ů");
				break;
			}
			else{
				System.out.println("�Ա���");
				break;
			}
		}
		in.close();
	}
}
