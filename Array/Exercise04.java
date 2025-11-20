public class Exercise04 {
    public static void main(String[] args) {
        int[] arr = {20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        double avg = sum/arr.length;
        System.out.println(avg);
    }
}
