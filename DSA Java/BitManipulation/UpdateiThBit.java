public class UpdateiThBit {
    public static void UpdateiTh(int num, int pos, int val) {
        // Step 1: Clear the bit at 'pos'
        int clearMask = ~(1 << pos);
        num = num & clearMask;

        // Step 2: Set the bit to 'val'
        int setMask = (val << pos);
        num = num | setMask;

        System.out.println(num);
    }

    public static void main(String[] args) {
        int num = 10; // binary: 1010
        int val = 1;  // we want to set bit to 1
        int pos = 2;  // update the 2nd bit (0-indexed from right)
        UpdateiTh(num, pos, val); // Output: 14 (binary: 1110)
    }
}