public class Envelope6 {

    public static String makeEnvelope(int width, int height) {
        /** logic / process */
        double k = (double) (width -2) / (height - 2);

        final int firstRow = 0;
        final int firstCol = 0;
        final int lastRow = height - 1;
        final int lastCol = width - 1;
        int countX = 0;

        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                if((col == width/2 || col == width/2-1 || col == width/2+1)
                        && (row == height/2) && countX!=0) {
                    sb.append("X");
                    countX++;
                }
                else if (row == firstRow || //firstRow
                        row == firstRow +1 ||// second row
                        col == firstCol || col == firstCol + 1 ||                  // first and second col
                        col == lastCol ||  col == lastCol -1 ||                   // last and one before last col
                        row == lastRow ||  row == lastRow - 1  || // lastRow and one before lastRow
                        col == Math.round(row * k)||        // diagonal 1
                        col == lastCol - Math.round(row * k) // diagonal 2
                ) {
                    sb.append("*");
                }

                else {
                    sb.append(" ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        /** input data */
        int height = 11;
        int width = 22;

        /** call the business logic extracted and decoupled from input and output */
        String result = makeEnvelope(width, height);

        /** output result */
        System.out.println(result);
    }

}

