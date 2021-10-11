
public class MultiplyG {
    public static String multiply(String nums1, String nums2) {
        int[] products = new int[nums1.length() + nums2.length()];
        for(int i = nums1.length()-1; i >= 0; i--)
            for(int j = nums2.length()-1; j >= 0; j--)
                products[i+j+1] += (nums1.charAt(i) - '0') * (nums2.charAt(j) - '0');

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = products.length-1; i >= 0; i--) {
            sb.insert(0, (products[i]+carry)%10);
            carry = (products[i]+carry)/10;
        }

        while (sb.length() != 0 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "777";
        String num2 = "999";
        System.out.println(multiply(num1,num2));
    }
}
