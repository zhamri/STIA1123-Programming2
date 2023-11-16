package my.zhamri.stia1123.javaInterface;

public interface Reservable {

    /**
     * Reserves the item for a member.
     *
     * @param member The member who is reserving the item.
     * @return true if the reservation was successful, false otherwise.
     */
    boolean reserve(Member member);

    /**
     * Cancels the reservation for the item.
     *
     * @return true if the cancellation was successful, false otherwise.
     */
    boolean cancelReservation();
}

