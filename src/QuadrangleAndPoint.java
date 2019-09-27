import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//Дан выпуклый четырехугольник (координаты вершин) и произвольная точка (координаты)
//найти расположение точки относительно четырехугольника
//Примечание: программу можно оптимизировать для работы с любым выпуклым многоугольником и так же
//можно объединить методы в один.

public class QuadrangleAndPoint {
    static double x = 3;
    static double y = 9;
    static double[] arrB = new double[4];
    static double[] arrC = new double[4];

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("data2")))
        {
            ArrayList<Double> numbers = new ArrayList<>();
            while (scanner.hasNextDouble())             {
                numbers.add(scanner.nextDouble());
            }
            System.out.println(numbers); //вывел значения чисел для наглядности
            System.out.println(numbers.size() + " значений"); // количество чисел

            double[] arrX = new double[numbers.size() / 2];
            double[] arrY = new double[numbers.size() / 2];
            for (int i = 0; i < numbers.size() / 2; i++) {
                arrX[i] = numbers.get(i * 2);
                arrY[i] = numbers.get(i * 2 + 1);
            }
            for (double o : arrX) {
                System.out.print(o + "  "); //массив значений X
            }
            System.out.println();

            for (double o : arrY) {
                System.out.print(o + "  "); //массив значений Y
            }
            System.out.println();
            System.out.println("координаты точки: x = " + x + ", y = " + y);

            Location location = new Location(x, y, arrX, arrY, arrB, arrC);
            location.searchTops(x, y);
            location.coefficient();
            location.quadrangleEdge(x, y);
            location.inOrOut(x, y);



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
