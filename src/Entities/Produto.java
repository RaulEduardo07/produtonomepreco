package Entities;

public class Produto {

    public String name;
    public double price;
    public int quantity;

    public double TotalValueInStock() {
        return price * quantity;
    }
    public void addProduto (int quantity){
        this.quantity += quantity;
    }
    public void removeProduto (int quantity){

        this.quantity -= quantity;
    }
    public String toString () {
        return name
        + ", $ "
        + String.format("%.2f", price )
        + ", "
        + quantity
        + "units, Total: $"
        + String.format("%.2f", TotalValueInStock());

    }
}
