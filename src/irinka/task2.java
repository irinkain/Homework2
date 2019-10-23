package irinka;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

//ფაილიდან ამოკითხვა

public class task2 {
    public static void Task2() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("function.txt"));
        String st;

        List<Double> data = new ArrayList<>();
        while ((st = reader.readLine()) != null) {
            data.add(Double.parseDouble(st)); //ყველა ლაინის წასაკითხად შემეძლო სხვანაირადაც დამეწერა, მაგრამ ალბათ არც ესაა შეცდომა
        }
        reader.close();

        System.out.println("მინიმუმი:" + Collections.min(data));
        System.out.println("მქსიმუმი:"+ Collections.max(data)); //კოლექციები იმირომ, რომ მინიმუმი და მაქსიმუმის გამოსათვლელად ცალკე რამე ფუნქცია არ დამჭირდეს

    }
    public task2() throws FileNotFoundException {
        System.out.println("ფაილი არ მოიძებნა ");
    }

}