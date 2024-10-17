package HW.chapter01.chapter09;

public class Q02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println(stock.getChangePercent());
    }

    public static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        public Stock(String symbol, String name) {
            this.symbol = symbol;
            this.name = name;
        }

        public double getChangePercent() {
            return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
        }
    }

    public static class Q03 {
    }
}
