package StatMethods;

public class Statistics {
    int percent;
    int[] data;

    public Statistics(int percent, int[] data) {
        this.percent = percent;
        this.data = data;
    }

    public void selectionSort(int data[]){
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

    public int percentile(int percent, int[] data){
        int x = data.length * percent / 100;
        return data[x - 1];
    }

    public double medianNumbers(int[] data){
        int x = data.length / 2;
        if (data.length % 2 != 0){
            return data[x];
        }
        double y = data[x - 1] + data[x];
        return y / 2;
    }

    public double average(int[] data){
        double sum = 0;
        for (int s : data) {
            sum = sum + s;
        }
        return sum / data.length;
    }

    public int minData(int[] data){
        return data[0];

    }
    public int maxData(int[] data){
        return data[data.length - 1];
    }

}
