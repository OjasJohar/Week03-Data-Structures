package sorting_algorithms.heap_sort;

public class SortJobApplicantsBySalary_06 {

    public static void main(String[] args) {

        int[] salaries = {100, 293, 3993, 1230, 133, 2322, 1231};

        System.out.println("Salaries of Applicants before sorting.");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }

        HeapSort.heapSort(salaries);
        System.out.println("\nSalaries of Applicants after sorting.");
        for (int salary : salaries) {
            System.out.print(salary + " ");
        }
    }
}
