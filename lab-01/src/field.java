public class field {

    private int size;

    public field(int size) {
        this.size = size;
    }

    public void printField(turtleeee turtle) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                if (i == turtle.getX() && j == turtle.getY()) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }

            }
            System.out.println();
        }

        System.out.println();
    }

    public int getSize() {
        return size;
    }
}