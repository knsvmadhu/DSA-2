import java.util.Arrays;

public class HotstarChunkSorting {

    public static void main(String[] args) {

        int chunks[] = {
            24, 12, 18, 31, 7, 39,
            15, 22, 5, 28, 11, 35, 19, 9
        };
        System.out.println("Original Chunk Order:");
        for(int x : chunks)
            System.out.print(x + " ");

        Arrays.sort(chunks);
        System.out.println("\n\nSorted Chunk Order:");
        for(int x : chunks)
            System.out.print(x + " ");
    }
}