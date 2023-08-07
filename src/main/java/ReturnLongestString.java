import java.util.HashMap;

public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){

        HashMap<Integer, String> hMap = new HashMap<>();
        hMap.put(1, arr[0]);

        for (int idx = 0; idx < arr.length; idx++) {

            if (arr[idx].length() > hMap.get(1).length()) {
                hMap.put(1, arr[idx]);
            }
        }

        return hMap.get(1);
    }
}
