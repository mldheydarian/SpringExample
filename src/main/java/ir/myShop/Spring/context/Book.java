package ir.myShop.Spring.context;

import org.springframework.stereotype.Component;

@Component
public interface Book {

    int getPrice();
    String getTitle();

}
