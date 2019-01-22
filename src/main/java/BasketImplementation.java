import java.util.ArrayList;
import java.util.List;

public class BasketImplementation implements Basket{
private List<Car> selectedCarList = new ArrayList<>();

    @Override
    public void add(List<Car> carList) {
        selectedCarList.add(carList);

    }

    @Override
    public void delete(List<Car> carList) {

    }

    @Override
    public int sumOfBasket() {
        return 0;
    }
}
