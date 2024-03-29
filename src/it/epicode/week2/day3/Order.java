package it.epicode.week2.day3;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private String status;
    private LocalDate deliveryDate;
    private Customer Clienti;

    public Order(Customer clienti) {
        Clienti = clienti;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setClienti(Customer clienti) {
        Clienti = clienti;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public Customer getClienti() {
        return Clienti;
    }

    public List<Product> getProductList() {
        return productList;
    }

    List<Product> productList;

    public void addList(Product p){
        productList.add(p);
        System.out.println(productList);
    }
    public void rimuovi(Product p){
        productList.remove(p);
        System.out.println(productList);
    }

}
