import java.text.NumberFormat;
import java.util.Scanner;
class currenconverter{
    public static void main(String[] args) {
        System.out.print("Enter a amount:");
        Scanner user=new Scanner(System.in);
        int rate=user.nextInt();
        NumberFormat currency=NumberFormat.getCurrencyInstance();
        String currency_generate=currency.format(rate);
        System.out.print("currency formate is:");
        System.out.print(currency_generate);
        user.close();
    }
}