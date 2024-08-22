public class ProductArrayExceptItself {
    public static int[] getProduct(int[] num){
        int n = num.length;
        int[] result = new int[n];

        // step1 left pass
        result[0] = 1;
        for(int i=1;i<n;i++){
            result[i] = result[i-1] *num[i-1];
        }
        //step2 right pass
        int rightProduct=1;
        for(int i=n-1;i>=0;i--){
            result[i]=result[i] * rightProduct;
            rightProduct *= num[i];
        }
        return result;
    }

    public static void main(String[] args) {
       int[] res = getProduct(new int[]{2, 2, 3, 4});
       for(int num:res){
           System.out.print(num +" ");
       }
    }
}
