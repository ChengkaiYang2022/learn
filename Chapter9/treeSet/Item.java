package Chapter9.treeSet;


/**
 * An item with a description and a part number;
 *
 */
public class Item implements Comparable<Item>
{
    private String description;
    private int partNumber;

    public int compareTo(Item other){
        int diff = Integer.compare(this.partNumber,other.partNumber);
        return diff != 0? diff:description.compareTo(other.description);
    }
}