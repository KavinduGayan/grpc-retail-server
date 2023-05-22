package lk.iit.retail.model;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

    private int checkoutId;
    private List<Catalogue> checkoutCatalogueList = new ArrayList<>();

    public int getCheckoutId() {
        return checkoutId;
    }

    public void setCheckoutId(int checkoutId) {
        this.checkoutId = checkoutId;
    }

    public List<Catalogue> getCheckoutCatalogueList() {
        return checkoutCatalogueList;
    }

    public void setCheckoutCatalogueList(List<Catalogue> checkoutCatalogueList) {
        this.checkoutCatalogueList = checkoutCatalogueList;
    }

    @Override
    public String toString() {
        return "Checkout{" +
                "checkoutId=" + checkoutId +
                ", checkoutCatalogueList=" + checkoutCatalogueList +
                '}';
    }
}
