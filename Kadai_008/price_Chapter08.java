package kadai_008;

public class price_Chapter08 {
	public static void main(String[]args) {
		
//		年代
		int userAge = 30;
//		サービスの使用料金
		int serviceCost = 0;
		
//		年代に応じた料金を取得
		serviceCost = switch (userAge) {
		case 10 -> 1000;
		case 20 -> 2000;
		case 30,40 -> 3000;
		case 50,60,70 -> 4000;
		case 80 -> 5000;
		default -> 500;
		};
		
//		料金を表示
		System.out.println(userAge + "代の料金は" + serviceCost + "円");
	}
}
