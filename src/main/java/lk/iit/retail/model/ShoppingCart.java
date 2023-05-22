package lk.iit.retail.model;

import java.util.List;

public class ShoppingCart {

    private int shopperId;
    private int cartId;
    private List<Catalogue> catalogueList;

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public List<Catalogue> getCatalogueList() {
        return catalogueList;
    }

    public void setCatalogueList(List<Catalogue> catalogueList) {
        this.catalogueList = catalogueList;
    }

    public int getShopperId() {
        return shopperId;
    }

    public void setShopperId(int shopperId) {
        this.shopperId = shopperId;
    }

    public void printCatalogueList() {
        catalogueList.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "shopperId=" + shopperId +
                ", cartId=" + cartId +
                ", catalogueList=" + catalogueList +
                '}';
    }
}
