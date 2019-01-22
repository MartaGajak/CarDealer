import java.util.List;

//* koszyk powienien pozwalać na dodanie/usunięcie przedmiotu ze koszyka

public interface Basket {

    void add(List<Car> carList);
    void delete(List<Car> carList);
    int sumOfBasket();

}
