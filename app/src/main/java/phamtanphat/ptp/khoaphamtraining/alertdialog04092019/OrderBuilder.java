package phamtanphat.ptp.khoaphamtraining.alertdialog04092019;

public interface OrderBuilder {
    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    // trả về đối tượng muốn set chức năng
    Order build();
}
