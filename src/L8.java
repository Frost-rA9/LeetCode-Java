public class L8 {
    public int myAtoi(String s) {
        int index = 0;
        int length = s.length();
        char[] ch = s.toCharArray();
        while (index < length && ch[index] == ' ') {
            index++;
        }
        if (index == length) {
            return 0;
        }
        int sign = 1;
        if (ch[index] == '-' || ch[index] == '+') {
            if (ch[index] == '-') {
                sign = -1;
            }
            index++;
        }
        int result = 0;
        int cur = 0;
        while (index < length) {
            int num = ch[index] - '0';
            if (num > 9 || num < 0) {
                break;
            }
            cur = result;
            result = result * 10 + num;
            if (result / 10 != cur) {
                if (sign > 0) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            index++;
        }
        return result * sign;
    }
}
