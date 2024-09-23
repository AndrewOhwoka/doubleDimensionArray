public class DoubleDimensionalArray {
    int[][] arr;  // Declare the 2D array

    // Constructor to create the 2D array with given rows and columns
    public DoubleDimensionalArray(int rows, int cols) {
        arr = new int[rows][cols];  // Initialize the 2D array with the given size
        // Fill the array with a default value, say Integer.MIN_VALUE to represent empty cells
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = Integer.MIN_VALUE;
            }
        }
    }

    // Method to insert a value into a specific index (row, column)
    public void insert(int row, int col, int value) {
        try {
            if (arr[row][col] == Integer.MIN_VALUE) {
                arr[row][col] = value;  // Insert the value if the cell is empty
                System.out.println("Successfully inserted " + value + " at (" + row + "," + col + ")");
            } else {
                System.out.println("Cell at (" + row + "," + col + ") is already occupied.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for insertion.");
        }
    }

    // Method to traverse the entire 2D array and print its elements
    public void traverse() {
        System.out.println("Traversing the 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");  // Print each element
            }
            System.out.println();  // Move to the next line after each row
        }
    }

    // Method to search for a value in the 2D array
    public void search(int value) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Value " + value + " found at (" + i + "," + j + ")");
                    return;
                }
            }
        }
        System.out.println("Value " + value + " not found in the array.");
    }

    // Method to delete a value at a specific index (row, column)
    public void delete(int row, int col) {
        try {
            if (arr[row][col] != Integer.MIN_VALUE) {
                System.out.println("Deleting value at (" + row + "," + col + "): " + arr[row][col]);
                arr[row][col] = Integer.MIN_VALUE;  // Reset the cell to the empty value
            } else {
                System.out.println("Cell at (" + row + "," + col + ") is already empty.");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index for deletion.");
        }
    }
}
