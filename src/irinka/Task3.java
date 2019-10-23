package irinka;
public class Task3 implements Task3Interface {
    int a;
    int b;

    Task3(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void Allints() {
        for (int i = a; i < b; i++) {
            System.out.println(i);
        }
    }

    public void Alldivisorsa() {
        for (int c = 1; c <= a; c++) {
            if (a % c == 0) {
                System.out.println(c);
            }
        }
    }

    public void SimpleDivisorsb() {
        while (b % 2 == 0) {
            System.out.print(2 + " ");
            b /= 2;
        }
        for (int i = 3; i <= Math.sqrt(b); i += 2) {
            while (b % i == 0) {
                System.out.print(i + " ");
                b /= i;
            }
        }
        if (b > 2)
            System.out.println(b);
    }
    public void MaxFrequency(){
        int []frequency = new int[10];
        while(b > 0)
        {
            int digit = b % 10;
            b /= 10;
            frequency[digit] ++;
        }
        int maxFrequency = 0;
        int index = 0;
        for(int i = 0; i < 10; ++i){
            if(frequency[i] > maxFrequency){
                maxFrequency = frequency[i];
                index = i;
            }
        }
        System.out.println("ყველაზე ხშირად გამოყენებულია ციფრი: "+ index);
    }
    public static void main(String... args){
        Task3 obj = new Task3(520,1040);
        System.out.println("a და b შორის მოთავსებულია ");
        obj.Allints();
        System.out.println("a-ს ყველა გამყოფი");
        obj.Alldivisorsa();
        System.out.println("b-ს მარტივი გამყოფები");
        obj.SimpleDivisorsb();
        System.out.println("b-ში ხშირად განმეორებული ციფრი");
        obj.MaxFrequency();
    }


}


