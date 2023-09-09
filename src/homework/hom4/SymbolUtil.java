package homework.hom4;

class FindSymbolOccurrence {
    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        return count;
    }
}
