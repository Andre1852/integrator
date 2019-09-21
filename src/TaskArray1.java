public class TaskArray1 {
    //Заполнить двумерный массив последовательно числами 0,1,2,3 и т.д. до конца массива не объявляя доп. переменных.
    // Можно использовать только следующие переменные:-Индексы массива i,j; -Массив
    //Никакие другие переменные создавать и использовать нельзя.
    //Кирилл, в работе использовал твой код.

    static class massNash {
        int dlin;
        int shir;
        int[][] arr;

        public massNash(int n, int m) {
            dlin = n;
            shir = m;
            arr = new int[n][m];
        }

        private void generate() {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    arr[i][j] = j + i * arr.length;
                }
            }
        }

        private void vivod() {
            for (int[] anArr : arr) {
                for (int anAnArr : anArr) {
                    System.out.print(anAnArr + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        massNash arr1 = new massNash(5,5);
        arr1.generate();
        arr1.vivod();
    }
}
