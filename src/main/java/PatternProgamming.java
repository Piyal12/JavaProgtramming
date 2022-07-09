public class PatternProgamming {
    public static void main(String[] args) {
        int row=3;
        int count=3;

        for (int i=0;i<=row;i++){
            for (int j=3;j>=count;j--){
                System.out.print(j);
            }
            System.out.println();
            count--;
            row--;

        }

    }
}
/*
321
32
3*/
