
import java.util.Scanner;

public class JudgeSex {
	public static void main(String[] args){
		System.out.println("请输入身份证号码：");
		Scanner in = new Scanner(System.in);
		String a ;
		char[] b ;
		while(true){
			a = in.nextLine();
			b = a.toCharArray(); 
			if(b.length!=18){
				System.out.println("请输入18位身份证号:");
				continue;
			}
			for(int i=0;i<17;i++){
				if(!Character.isDigit(b[i])){
					System.out.println("请输入正确的身份证号:");
					continue;
				}
			}
			if(!Character.isDigit(b[17])){
				if(b[17]!='x'){
					System.out.println("请输入正确的身份证号:");
					continue;
				}
			}
			if(b[16]%2==0){
				System.out.println("性别：女");
				break;
			}
			else{
				System.out.println("性别：男");
				break;
			}
		}
		in.close();
	}
}
