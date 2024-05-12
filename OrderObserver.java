import java.util.*;

// Observer Pattern for notifying customers about order status changes
interface OrderObserver {
    void update(Order order);
}