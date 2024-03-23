public class SkillBuilder5 {

    public static double[] prefixAverage(double[] data) {
        int n = data.length;
        double[] prefixAverages = new double[n];
        double prefixSum = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += data[i];
            prefixAverages[i] = prefixSum / (i + 1);
        }

        return prefixAverages;
    }

    public static int indexOf(int searchValue, int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] == searchValue) {
                return i;
            }
        }
        return -1; // If the value is not found
    }

    public static int indexOf(String s, String[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i].equals(s)) {
                return i;
            }
        }
        return -1; // If the string is not found
    }

    public static String[] remove(String s, String[] anArray) {
        int count = 0;

        for (String str : anArray) {
            if (str.equals(s)) {
                count++;
            }
        }

        String[] newArray = new String[anArray.length - count];
        int index = 0;

        for (String str : anArray) {
            if (!str.equals(s)) {
                newArray[index++] = str;
            }
        }

        return newArray;
    }

    public static void reverse(int[] anArray) {
        int start = 0;
        int end = anArray.length - 1;

        while (start < end) {
            int temp = anArray[start];
            anArray[start] = anArray[end];
            anArray[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Example usage
        double[] myDatum = {2, 4, 6, 8, 10};
        double[] pa = prefixAverage(myDatum);
        System.out.print("pa\n*----> ");
        for (double avg : pa) {
            System.out.print(avg + " ");
        }

        int loc1 = indexOf(5, new int[]{8, 99, 45, 5, 34, 87, 5, 22, 1});
        System.out.println("\nIndex of 5: " + loc1);

        int loc2 = indexOf("python", new String[]{"za", "hello", "bye", "anaconda", "python", "pycharm", "python"});
        System.out.println("Index of 'python': " + loc2);

        String[] myArray = {"French", "English", "Spanish", "Greek", "Russian", "Spanish"};
        myArray = remove("Spanish", myArray);
        System.out.print("myArray\n*----> ");
        for (String str : myArray) {
            System.out.print("\"" + str + "\"");
        }

        int[] na = {1, 2, 3, 4, 5, 6};
        reverse(na);
        System.out.print("\nna\n*----> ");
        for (int num : na) {
            System.out.print(num);
        }
    }
}