package onlineStore12.OnlineStore.service;


import onlineStore12.OnlineStore.card.ShoppingCart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ShopServiceImpl implements ShopService {
    private final ShoppingCart shoppingCart;

    public ShopServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }


    @Override
    public void addItemToCart(List<Integer> itemID) {
        for (Integer itemIDs : itemID) {
            shoppingCart.addItemToCart(itemIDs);
        }
        shoppingCart.initMethod();
    }

    @Override
    public List<Integer> getCart() {
        return this.shoppingCart.getItemID();
    }

}

