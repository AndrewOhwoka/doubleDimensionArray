public class Test {
    public static void main(String[] args) {
        DoubleDimensionalArray dda = new DoubleDimensionalArray(3, 3);
        // Traverse the intial array
        System.out.println("Initial array:");
        dda.traverse();
        // Inserting values into the array
        System.out.println("Inserting values into the array:");
        dda.insert(0,0,1);
        dda.insert(0,1,2);
        dda.insert(0,2,6);
        dda.insert(1,0,4);
        dda.insert(1,1,8);
        dda.insert(1,2,9);
        dda.insert(2,0,3);
        dda.insert(2,1,5);
        dda.insert(2,2,7);
        // Traversing the array
        dda.traverse();
        // // Traversing the array
        // dda.traverse();
        // // Searching for a value
        // dda.search(20);
        // // Deleting a value
        // dda.delete(0,2);
    }       
}
