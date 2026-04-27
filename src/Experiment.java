public class Experiment {

    private final Sorter sorter;
    private final Searcher searcher;

    public Experiment(Sorter sorter, Searcher searcher) {
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public long measureSortTime(int[] arr, String type) {
        int[] copy = arr.clone();

        long startTime = System.nanoTime();

        if (type.equalsIgnoreCase("basic")) {
            sorter.basicSort(copy);
        } else if (type.equalsIgnoreCase("advanced")) {
            sorter.advancedSort(copy);
        }

        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public long measureSearchTime(int[] arr, int target) {
        long startTime = System.nanoTime();
        searcher.search(arr, target);
        long endTime = System.nanoTime();
        return endTime - startTime;
    }

    public void runAllExperiments() {
        int[] sizes = {10, 100, 1000};

        System.out.println("SORTING AND SEARCHING EXPERIMENTS");

        for (int size : sizes) {
            System.out.println("\nArray size: " + size);

            int[] randomArray = sorter.generateRandomArray(size);
            int[] sortedArray = sorter.generateSortedArray(size);

            long insertionRandomTime = measureSortTime(randomArray, "basic");
            long insertionSortedTime = measureSortTime(sortedArray, "basic");

            long quickRandomTime = measureSortTime(randomArray, "advanced");
            long quickSortedTime = measureSortTime(sortedArray, "advanced");

            int randomTarget = randomArray[size / 2];
            int sortedTarget = sortedArray[size / 2];

            long linearRandomSearchTime = measureSearchTime(randomArray, randomTarget);
            long linearSortedSearchTime = measureSearchTime(sortedArray, sortedTarget);

            System.out.println("Insertion Sort (Random): " + insertionRandomTime + " ns");
            System.out.println("Insertion Sort (Sorted): " + insertionSortedTime + " ns");

            System.out.println("Quick Sort (Random): " + quickRandomTime + " ns");
            System.out.println("Quick Sort (Sorted): " + quickSortedTime + " ns");

            System.out.println("Linear Search (Random): " + linearRandomSearchTime + " ns");
            System.out.println("Linear Search (Sorted): " + linearSortedSearchTime + " ns");
        }
    }
}