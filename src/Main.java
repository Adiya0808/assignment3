public class Main {
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        Searcher searcher = new Searcher();
        Experiment experiment = new Experiment(sorter, searcher);

        int[] demoArray = sorter.generateRandomArray(10);

        System.out.println("Original array:");
        sorter.printArray(demoArray);

        int[] insertionArray = demoArray.clone();
        sorter.basicSort(insertionArray);
        System.out.println("\nAfter Insertion Sort:");
        sorter.printArray(insertionArray);

        int[] quickArray = demoArray.clone();
        sorter.advancedSort(quickArray);
        System.out.println("\nAfter Quick Sort:");
        sorter.printArray(quickArray);

        int target = quickArray[quickArray.length / 2];
        int index = searcher.search(quickArray, target);
        System.out.println("\nLinear Search:");
        System.out.println("Target " + target + " found at index: " + index);


        System.out.println();
        experiment.runAllExperiments();
    }
}