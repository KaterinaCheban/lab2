package ad211.cheban;

public class Item {
    private String name; // поле имени
    private float price; // поле цены
    public Item(String name, float price){ // конструктор
        this.name = name;
        if (price<0){ // проверка на отрицательную цену
            this.price = 0;
        }
        else {
            this.price = price;
        }
    }
    public float Price() {
        return price;
    } // возвращение цены
    public void priceIncrease (float percent){ // увеличение цены
        price = price + (price*percent/100);
    }
    public void priceD (float percent){ // понижение цены
        price = price - (price*percent/100);
        if (price<0){ // проверка если после понижения цена будет меньше 0
            this.price = 0;
        }
    }
}
