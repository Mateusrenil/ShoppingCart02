public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "camisa";
        String message = custName+" quer comprar duas " +itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double preco = 23.50;   
        double imposto = 0.28;
        int quantidade = 2;
        
        // Declare and assign a calculated totalPrice
        double custoTotal = (preco + quantidade) + (imposto);
        
        // Modify message to include quantity 
        System.out.println(message);
        System.out.println("O custo total com o imposto é $"+ custoTotal);
        
        // Print another message with the total cost
        
    }    
}
