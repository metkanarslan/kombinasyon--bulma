import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        int n,r;
        Scanner inp = new Scanner(System.in);
        System.out.print("N Giriniz : ");
        n = inp.nextInt();
        System.out.print("R Giriniz : ");
        r= inp.nextInt();
        int total=1,total2=1,total3=1,fark,sonuc;
        for (int i=1; i<=n; i++){
            total=total*i;
        }
        for (int i=1; i<=r; i++){
            total2=total2*i;
        }
        fark=n-r;
        for (int i=1; i<=fark; i++){
            total3=total3*i;
        }
        sonuc=total/(total2*(total3));
        System.out.println(sonuc);
    }

}
