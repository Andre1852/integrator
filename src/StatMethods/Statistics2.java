package StatMethods;

public class Statistics2 implements StatisticsMethods {

    int percent;
    int[] data;

    public Statistics2(int percent, int[] data) {
        this.percent = percent;
        this.data = data;
    }

    @Override
    public void selectionSort(int[] arr) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int min_i = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    min_i = j;
                }
            }
            if (i != min_i){
                int tmp = data[i];
                data[i] = data[min_i];
                data[min_i] = tmp;
            }
        }
    }

    @Override
    public int percentile(int percent, int[] data) {
        int x = data.length * percent / 100;
        return data[x - 1];
    }

    @Override
    public double medianNumbers(int[] data) {
        int x = data.length / 2;
        if (data.length % 2 != 0){
            return data[x];
        }
        double y = data[x - 1] + data[x];
        return y / 2;
    }

    @Override
    public double average(int[] data) {
        double sum = 0;
        for (int s : data) {
            sum = sum + s;
        }
        return sum / data.length;
    }

    @Override
    public int minData(int[] data) {
        return data[0];
    }

    @Override
    public int maxData(int[] data) {
        return data[data.length - 1];
    }
}
