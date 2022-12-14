package dev.om.library.checkout;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, UUID> {

    Checkout findByCheckoutID(UUID checkoutID);
    List<Checkout> findAllByUserID(UUID userID);

    Boolean existsByCheckoutID(UUID checkoutID);

    int countByUserID(UUID userID);
    int countByIsbn(String isbn);

}