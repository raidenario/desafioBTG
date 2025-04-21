package tech.desafiobtg.orderms.entity;

import java.math.BigDecimal;

import java.util.List;


import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;



@Document(collection = "tb_orders")
    public class OrderEntity {


        @MongoId
        private String orderId;

        @Indexed(name = "idx_customerId")
        private String customerId;

        @Field(targetType = FieldType.DECIMAL128)
        private BigDecimal totalValue;

        private List<OrderItem> items;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getCustomerId() {
            return customerId;
        }

        public void setCustomerId(String customerId) {
            this.customerId = customerId;
        }

        public BigDecimal getTotalValue() {
            return totalValue;
        }

        public void setTotalValue(BigDecimal totalValue) {
            this.totalValue = totalValue;
        }

        public List<OrderItem> getItems() {
            return items;
        }

        public void setItems(List<OrderItem> items) {
            this.items = items;
        }

        public OrderEntity(String orderId, String customerId, BigDecimal totalValue, List<OrderItem> items) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.totalValue = totalValue;
            this.items = items;
        }

       
        
        

    }


