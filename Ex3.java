class Ex3{

	public String ex3_0(int n){

          if(0 < n){
            return "その値は正です"; 
          }else{
             return "その値は0か負です";
          }


	}

	public int ex3_1(int n){
		
          if(0 < n){
             return n ;
          }else{
             return (n * -1); 
          }
        }


	public String ex3_2(int a, int b){

          if(a / b == a){
              return b + "は" + a + "の約数です";
          }else{
              return b + "は" + a + "の約数ではありません";
          }

	}

	public String ex3_3(int a, int b){

          if(b < a){
            return a + "のほうが大きいです";
          }else if(a < b){
            return b + "のほうが大きいです"; 
          }else{
            return "同じ値です";
          }


	}

	public String ex3_4(int a){

          if(a / 5 == 0){
             return "その値は5で割り切れます";
          }else if(a == -a){
            return "正でない整数値です";
          }else{
            return "その値は5で割り切れません";
          }
	}

	public String ex3_5(int a){

          if(a * 10 < a){
            return "その値は10の倍数です";
          }else if(a == -a){
            return "その値は10の倍数ではありません";
          }else{
             return "正でない整数値です";
          }
	}
	
	public String ex3_6(int a){

          if(a / 3 == 0){
             return "その値は3で割り切れます";
          }else if(a % 3 == 1){
            return "その値を3で割った余りは1です";
          }else if(a % 3 == 2){
            return "その値を3割った余りは2です";
          }else if(a == -a){
            return "正でない整数値です";
          }else{
             return "error";
          }
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
		return 0;
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}
}

