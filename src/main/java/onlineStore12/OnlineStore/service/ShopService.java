package onlineStore12.OnlineStore.service;

import java.awt.*;
import java.util.List;

public interface ShopService {


    void addItemToCart(List<Integer> itemID);

    public java.util.List<Integer> getCart();

}
