package onlineStore12.OnlineStore.controller;


import onlineStore12.OnlineStore.service.ShopService;
import onlineStore12.OnlineStore.service.ShopServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/order")

public class ShopController {

    private final ShopService shopService;


    public ShopController(ShopService shopService, onlineStore12.OnlineStore.service.ShopServiceImpl shopServiceImpl) {
        this.shopService = shopService;
    }

    @GetMapping("/add")
    public String addItemToCart(@RequestParam(value = "itemID") List<Integer> itemID) {
        shopService.addItemToCart(itemID);
        return "Items added to the cart: " + itemID;
    }

    @GetMapping("/get")
    public List<Integer> getShoppingCart() {
        return shopService.getCart();
    }
}


