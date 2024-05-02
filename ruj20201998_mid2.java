package midterm;
import java.util.Scanner;
import java.util.Random;

public class ruj20201998_mid2 {

	public static void main(String[] args) {
		
	        String[] com = {"가위", "바위", "보"};
	        String[] com2 = {"가위", "바위", "보"};
	        Scanner s = new Scanner(System.in);
	        Random random = new Random();
	        int score = 0;
	        
	        while (true) {
	        	System.out.println("가위 바위 보중 두개를 입력하세요 (종료를 입력하면 종료됩니다.)");
	        	String user = s.next(); //공백 기준으로 값을 입력받기위해 nextLine이 아닌 next를 사용
	        	String user2 = s.next(); 
	        	
	        	
	        	if(user.equals("종료") || user2.equals("종료")) {
	        		System.out.println("종료합니다...");
	        		break;
	        	};
	        	
	        	if(!user.equals("가위") && !user.equals("보") && !user.equals("바위")) {
	        		System.out.println("잘못 입력하였습니다.");
	        		continue;
	        	};
	        	
	        	if(!user2.equals("가위") && !user2.equals("보") && !user2.equals("바위")) {
	        		System.out.println("잘못 입력하였습니다.");
	        		continue;
	        	};
	        	
	        	int ran = random.nextInt(3); //반복문 안에 랜덤 변수는 한번 정해지면 유지되기 때문에 2개를 선언
	        	int ran2 = random.nextInt(3);
	        	int comOutput = random.nextInt(2); //comInput배열에서 값을 가져오기 위해 선언하는 랜덤 함수
	        	
	        	System.out.println("유저: " + user + "/" + user2);
	        	System.out.println("컴퓨터:" + com[ran] + "/" + com2[ran2]);
	        	System.out.print("내고싶은 값을 입력하세요: ");
	        	String minus = s.next();
	        	
		        String[] comInput = {com[ran], com2[ran2]};	        	
	        	String userHana = "";
	        	
	        		        	
	        	if(user.equals(minus)){ //마이너스에 입력한 값이 아닌 값을 userHana변수에 할당
	        		userHana = user;
	        	}
	        	
	        	if(user2.equals(minus)) {
	        		userHana = user2;
	        	}
	        	
	        	if(!user.equals(minus) && !user2.equals(minus)) {
	        		System.out.println("없는 값입니다. 재시작합니다.");
	        		continue;
	        	}
	        	
	        	
	        	
	        	if(userHana.equals("가위")) {
	        		if(comInput[comOutput].equals("가위")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("비겼습니다.");
	        			score += 0;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		if(comInput[comOutput].equals("바위")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("졌습니다....");
	        			score += -1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		else {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("이겼습니다!");
	        			score += 1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			if(score > 3) {
	        				System.out.println("축하드립니다!!!");
	    	        		break;
	    	        	}
	        			else {
	        				continue;
	        			}
	        		}
	        	}
	        	
	        	if(userHana.equals("바위")) {
	        		if(comInput[comOutput].equals("바위")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("비겼습니다.");
	        			score += 0;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		if(comInput[comOutput].equals("보")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("졌습니다....");
	        			score += -1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		else {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("이겼습니다!");
	        			score += 1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			if(score > 3) {
	        				System.out.println("축하드립니다!!!");
	    	        		break;
	    	        	}
	        			else {
	        				continue;
	        			}
	        		}
	        	}
	        	
	        	if(userHana.equals("보")) {
	        		if(comInput[comOutput].equals("보")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("비겼습니다.");
	        			score += 0;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		if(comInput[comOutput].equals("가위")) {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("졌습니다....");
	        			score += -1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			continue;
	        		}
	        		else {
	        			System.out.println("유저: "+ userHana);
	        			System.out.println("컴퓨터: "+ comInput[comOutput]);
	        			System.out.println("이겼습니다!");
	        			score += 1;
	        			System.out.println("현재 점수는 " + score + "점 입니다");
	        			if(score > 3) {
	        				System.out.println("축하드립니다!!!");
	    	        		break;
	    	        	}
	        			else {
	        				continue;
	        			}
	        			
	        		}
	        	}
	        	
	        }
	        s.close();
	    
	}

}

