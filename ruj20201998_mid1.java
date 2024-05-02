package midterm;

import java.util.Random;
import java.util.Scanner;

public class ruj20201998_mid1 {

	public static void main(String[] args) {
		
        String[] com = {"가위", "바위", "보"};
        Scanner s = new Scanner(System.in);
        Random random = new Random();
        
        while (true) {
        	System.out.println("가위 바위 보를 입력하세요 (종료를 입력하면 종료됩니다.)");
        	String user = s.nextLine();
        	
        	if(user.equals("종료")) {
        		System.out.println("종료합니다...");
        		break;
        	};
        	
        	if(!user.equals("가위") && !user.equals("보") && !user.equals("바위")) {
        		System.out.println("잘못 입력하였습니다.");
        		continue;
        	};
        	
        	int ran = random.nextInt(3);
        	
        	if(user.equals("가위")) {
        		if(com[ran].equals("가위")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("비겼습니다.");
        			continue;
        		}
        		if(com[ran].equals("바위")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("졌습니다....");
        			continue;
        		}
        		else {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("이겼습니다!");
        			break;
        		}
        	}
        	
        	if(user.equals("바위")) {
        		if(com[ran].equals("바위")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("비겼습니다.");
        			continue;
        		}
        		if(com[ran].equals("보")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("졌습니다....");
        			continue;
        		}
        		else {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("이겼습니다!");
        			break;
        		}
        	}
        	
        	if(user.equals("보")) {
        		if(com[ran].equals("보")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("비겼습니다.");
        			continue;
        		}
        		if(com[ran].equals("가위")) {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("졌습니다....");
        			continue;
        		}
        		else {
        			System.out.println(user + "/" + com[ran]);
        			System.out.println("이겼습니다!");
        			break;
        		}
        	}
        	
        }
        s.close();
    
}
}
