package my.zhamri.stia1123.javaInterface;

public interface Loanable {

    /**
     * Checks out the item to a member.
     *
     * @param member The member who is loaning the item.
     * @return true if the checkout was successful, false otherwise.
     */
    boolean checkout(Member member);

    /**
     * Returns the item to the library.
     *
     * @return true if the return was successful, false otherwise.
     */
    boolean returnItem();
}

