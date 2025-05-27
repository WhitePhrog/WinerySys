package br.com.fiap.winery;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.fiap.winery.WineStockService")
public class WineStockServiceImplementation implements WineStockService {

    @Override
    public String getMenu() {
        return "Cabernet Sauvignon, Merlot, Chardonnay, Pinot Noir";
    }

    @Override
    public String placeOrder(String name, int quantity) {
        return "Pedido confirmado! Vinho: " + name + ", Quantidade: " + quantity;
    }
}
