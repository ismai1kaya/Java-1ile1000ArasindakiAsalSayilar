public class AsalSayilar {

    public  static boolean AsalMi(int sayi){

        for (int i = 2; i < sayi;i++){
            if(sayi % i == 0 ){
                return false;
            }

        }return true;
    }

    public static void main(String[] args){


        for (int a = 2; a <1000;a++){

            if(AsalMi(a)){
                System.out.println(a);
            }
        }
    }
}
