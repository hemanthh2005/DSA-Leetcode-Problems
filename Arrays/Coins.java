
//441

public class Coins {
    public static int arrangeCoins(int n) {
    long k=0;
    for(long i=0;i<=k;i++){
        for(long j=0;j<=i;j++){
            k++;
        }if(k>n){
            return (int)i;
        }
    }return 0;

    }

    public static void main(String [] args) {
        System.out.println(arrangeCoins(1649760492));
    }
}
