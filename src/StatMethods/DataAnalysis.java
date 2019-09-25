package StatMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Считать из файла последовательность целых чисел. Вычислить 90 персентиль, медиану, максимальное,
//минимальное и среднее значения. На вход программа получает файл с числами. Каждое число в файле
//находится на новой строке. Вывод в консоль должен быть следующим:
//90 percentile <значение>
//median <значение>
//average <значение>
//max <значение>
//min <значение>

public class DataAnalysis {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("data1")))
        {
            ArrayList<Integer> numbers = new ArrayList<>();
            while (scanner.hasNextInt())             {
                numbers.add(scanner.nextInt());
            }
            System.out.println(numbers); //вывел значения чисел для наглядности
            System.out.println(numbers.size() + " значений"); // количество чисел

            int[] arr = new int[numbers.size()];
            for (int i = 0; i < numbers.size(); i++) {
                arr[i] = numbers.get(i);
            }
            //StatMethods.Statistics statistics = new StatMethods.Statistics(90, arr);
            Statistics2 statistics = new Statistics2(90, arr);
            statistics.selectionSort(arr);
            for (int o : arr) {
                System.out.print(o + "  "); //массив после сортировки
            }
            System.out.println();
            System.out.println("--------------------------------------");
            System.out.println(statistics.percent + " персентиле <" + statistics.percentile(statistics.percent, arr) + ">");
            System.out.println("median <" + statistics.medianNumbers(arr) + ">");
            System.out.println("average <" + statistics.average(arr) + ">");
            System.out.println("max <" + statistics.maxData(arr) + ">");
            System.out.println("min <" + statistics.minData(arr) + ">");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
