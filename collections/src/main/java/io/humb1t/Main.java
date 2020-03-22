package io.humb1t;

import java.util.List;

import static io.humb1t.Task5.main5;

public class Main {
    public static List<Order> orders;

    public static void main(String[] args) {
        main5();
    }

    public enum OrderStatus {
        NOT_STARTED, PROCESSING, COMPLETED
    }

    public static class Order {
        public final OrderStatus status;
        public int numberOfOrder;

        public Order(OrderStatus status) {
            this.status = status;
        }

        public OrderStatus getStatus() {
            return status;
        }
    }


}
