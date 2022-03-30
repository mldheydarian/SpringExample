package ir.myShop.Spring.context;

import org.springframework.stereotype.Component;

@Component
public class HistoryBook implements Book{

    private int price;
    private String title;

    public HistoryBook() {

    }

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public String getTitle() {
        return null;
    }
}
