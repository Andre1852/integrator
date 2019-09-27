public class Location implements LocationMethods {
    double x;
    double y;
    double[] arrX;
    double[] arrY;
    double[] arrB;
    double[] arrC;

    public Location(double x, double y, double[] arrX, double[] arrY, double[] arrB, double[] arrC) {
        this.x = x;
        this.y = y;
        this.arrX = arrX;
        this.arrY = arrY;
        this.arrB = arrB;
        this.arrC = arrC;
    }

    @Override
    public void searchTops(double x, double y) {
        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] == x && arrY[i] == y){
                System.out.println("точка - вершина четырёхугольника");
                return;
            }
        }
    }

    @Override
    public void coefficient() {
        for (int i = 0; i < 4; i++) {
            if (i < 3){
                if (arrX[i] == arrX[i + 1]){
                    System.out.println("рассчет коэфициэнтов невозможен (деление на 0)!");
                    System.out.println("грань четырёхугольника между точками " + (i + 1) + " и " + (i
                            + 2));
                    System.out.println("лежит на прямой x = " + arrX[i]);
                    return;
                }
                arrB[i] = (arrY[i + 1] - arrY[i]) / (arrX[i + 1] - arrX[i]);
                arrC[i] = arrY[i] - arrB[i] * arrX[i];
            } else {
                if (arrX[0] == arrX[i]){
                    System.out.println("рассчет коэфициэнтов невозможен (деление на 0)!");
                    System.out.println("грань четырёхугольника между точками 1 и " + (i
                            + 1));
                    System.out.println("лежит на прямой x = " + arrX[i]);
                    return;
                }
                arrB[i] = (arrY[0] - arrY[i]) / (arrX[0] - arrX[i]);
                arrC[i] = arrY[i] - arrB[i] * arrX[i];
            }
        }
    }

    @Override
    public void quadrangleEdge(double x, double y) {
        for (int i = 0; i < 4; i++) {
            if (x * arrB[i] + arrC[i] == y && i < 3) {
                if (arrX[i] < x && x < arrX[i + 1] || arrX[i] > x && x > arrX[i + 1]){
                    System.out.println("точка лежит на стороне четырехугольника");
                    return;
                }
            } else {
                if (x * arrB[i] + arrC[i] == y) {
                    if (arrX[0] < x && x < arrX[i] || arrX[0] > x && x > arrX[i]){
                        System.out.println("точка лежит на стороне четырехугольника");
                        return;
                    }
                }
            }
        }
    }

    @Override
    public void inOrOut(double x, double y) {
        boolean[] booleans = {false, false, false, false};
        boolean[] boolpoint = {false, false, false, false};
        double c;
        for (int i = 0; i < 4; i++) {
            if (i < 2) {
                c = arrY[i + 2] - arrB[i] * arrX[i + 2];
                //System.out.println(c + " ");
                if (c <= arrC[i]) {
                    booleans[i] = true;
                }
            } else {
                c = arrY[i - 2] - arrB[i] * arrX[i - 2];
                //System.out.println(c + " ");
                if (c <= arrC[i]) {
                    booleans[i] = true;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            if ((y - arrB[i] * x) <= arrC[i]){
                boolpoint[i] = true;
            }
            if (boolpoint[i] != booleans[i]){
                System.out.println("точка снаружи четырехугольника");
                return;
            }
        }
        System.out.println("точка внутри четырехугольника");
    }
}
