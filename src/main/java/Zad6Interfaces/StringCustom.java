package Zad6Interfaces;

public final class StringCustom implements CharSequence, Comparable<StringCustom> {

    private String val;

    public StringCustom(String stringVal){
        val = reversedString(stringVal);
    }

    public int length() {
        return val.length();
    }

    public char charAt(int index) {
        return val.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        return val.subSequence(start,end);
    }

    /**
     * Compares two StringCustom objects. Ignores cases and returns true if second string is same as the first one when
     * reading from the end.
     * @param stringVal2
     * @return 0 if equal, -1 if not
     */
    public int compareTo(StringCustom stringVal2) {
        if (this.val.compareToIgnoreCase(stringVal2.val) == 0){
            return 0;
        }

        if (this.val.length() == stringVal2.length()){
            char[] ch1 = val.toLowerCase().toCharArray();
            char[] ch2 = stringVal2.val.toLowerCase().toCharArray();
            int chLength = ch1.length;

            for (int i = 0; i < chLength; i++){
                if (ch1[i] != ch2[chLength - i - 1]){
                    return -1;
                }
            }

            return 0;
        }

        return -1;
    }

    @Override
    public String toString(){
        return val;
    }

    private String reversedString(String original){
        StringBuilder sb = new StringBuilder(original);
        sb.reverse();

        return sb.toString();
    }
}
