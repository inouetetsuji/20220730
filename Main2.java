
public class Main2 {
		public static int array[] = {3,7,45,1,6,75,85,24,11,87};
		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
//			Question 素数を抽出するプログラムを作成しましょう。パラメータはint型の配列で入力されます。
//			要素数は1	
		
			for(int i=0; i<10; i++){
			    int n = array[i];
			    for(int j =2; (n%j!=0 && j<n)||j==n ; j++){
			    	if(j==n) {
			    		System.out.println(n+"は素数です。");
			}
		}
}
}
}