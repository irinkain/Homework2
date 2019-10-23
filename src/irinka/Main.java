package irinka;
import java.io.*;

public class Main {
    //ფაილში ჩაწერა
    public static void main(String[] args) throws IOException {
        double result;
        int b[] = {1,2};

        BufferedWriter bw = new BufferedWriter(new FileWriter("function.txt", true));
        //This is most preferable class to write data to a file since more data can be written to the file in one write() call.
        //იმიტომ გამოვიყენე ბუფერული ჩამწერი, რომ შემოწმებისას შეიძლება ბევრი რიცხვის ჩაწერა დამჭირდეს ერთდროულად და მგონი სწორი მიდგომაა.
        for (int i : b){
            result= Math.pow(i, 2) + 2 * i + 3;
            bw.write(String.valueOf(result));
            bw.newLine(); // როგორც ვიცი ნიულაინის ფუნქციას მხოლოდ ბუფერებში ვიყენებთ და ასეე უფრო თვალსაჩინოა ჩანაწერი.
        }
        bw.close();
    }

}
