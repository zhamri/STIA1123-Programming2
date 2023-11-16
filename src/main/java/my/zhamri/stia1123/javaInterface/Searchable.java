package my.zhamri.stia1123.javaInterface;

public interface Searchable {
    /**
     * Searches for a match based on a query string.
     *
     * @param query The query string to search for.
     * @return true if the item matches the query, false otherwise.
     */
    boolean search(String query);
}

