//package example;
//
//public class Grade {
//	String name;
//	String s_answer;
//	
//	String check_answer;
//	int ans_num;
//	int score;
//	
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getS_answer() {
//		return s_answer;
//	}
//
//	public void setS_answer(String s_answer) {
//		this.s_answer = s_answer;
//	}
//
//	public void marking(String answer) {
//		check_answer = "";
//		for(int i = 0; i < s_answer.length(); i++) {
//			if(s_answer.charAt(i) == answer.charAt(i)) {
//				check_answer += "O";
//				ans_num++;
//			}else {
//				check_answer += "X";
//			}
//		}
//		score = (100/s_answer.length())*ans_num;
//	}
//}