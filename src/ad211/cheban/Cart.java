package ad211.cheban;

public class Cart {
    private final Item[] items; // стек
    private final int max_elements;
    private int index;

    public Cart(int max_elements){ // конструктор
        this.max_elements = max_elements;
        items = new Item[(max_elements)];
        index = -1;
    }
    public boolean plusItem(Item item) {
        return plus(item);
    }
    private boolean plus (Item item) { // добавление товара в корзину
        if(overflow()) // переполнение корзины (проверка)
            return false;
        int i  = ++index;
        items[i] = item;
        return true;
    }
    public boolean overflow(){
        return (index + 1) == max_elements;
    }
    public Item deleteLastPlusItem() {
        return del();
    }
    private Item del() { // удаление последнего добавленого товара в корзину
        if(Empty()) // если корзина пустая (проверка)
            return null;
        return items[index--];
    }
    public boolean Empty(){
        return index != -1;
    }
    public int Sum(){ // итоговая сумма
        int sum = 0;
        for(int i = 0; i <=index;i++){
            sum+=items[i].Price();
        }
        return sum;
    }
    public void raise_the_price(float percent){ // повышение цены
        for(int i = 0; i <=index;i++){
            items[i].priceIncrease(percent);
        }
    }
    public void lower_the_price(float percent){ // понижение цены
        for(int i = 0; i <=index;i++){
            items[i].priceD(percent);
        }
    }
}
