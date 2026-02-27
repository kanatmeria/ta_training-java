package com.epam.rd.autotasks;


class FunctionsTask1 {
    /**
     * <summary>
     * Implement code according to description of task.
     * </summary>
     * if set invalid arguments in method, then method must throws
     * IllegalArgumentException
     */
    public static boolean isSorted(int[] array, SortOrder order) {
       //TODO: Delete line below and write your own solution
        if (array == null || order == null) {
            throw new IllegalArgumentException("Array and sort order must not be null.");
        }

        // Empty array or single element → sorted
        if (array.length <= 1) {
            return true;
        }

        if (order == SortOrder.ASC) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }
            }
        } else { // DESC
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        }

        return true;
    }




}
