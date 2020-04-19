package interview;

public abstract class Notes {

    //How to Compare
    //Need to output -1 or 1 (or 0)
    /**
     * Compares two {@code Integer} objects numerically.
     *
     * @param   anotherInteger   the {@code Integer} to be compared.
     * @return  the value {@code 0} if this {@code Integer} is
     *          equal to the argument {@code Integer}; a value less than
     *          {@code 0} if this {@code Integer} is numerically less
     *          than the argument {@code Integer}; and a value greater
     *          than {@code 0} if this {@code Integer} is numerically
     *           greater than the argument {@code Integer} (signed
     *           comparison).
     * @since   1.2
     */
    public static int compare(int x, int y) {
        return (x < y) ? -1 : ((x == y) ? 0 : 1);
    }



    /**
     * java.util.Collection cannot be sorted but can only be iterated
     * Sorting collection can be done through converting to Array or List
     * Ironcially Collection.sort takes a list!
     */
    public abstract void storyAboutCollection();
}
