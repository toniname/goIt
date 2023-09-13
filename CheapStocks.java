

public class CheapStocks {

    public String getCheapStocks(String[] stocks) {
        String[] cheapNames = new String[stocks.length];
        int count = 0;

        for (String stock : stocks) {
            String[] parts = stock.split(" ");
            String productName = parts[0];

            int price = Integer.parseInt(parts[1]);

            if (price < 200) {
                cheapNames[count] = productName;
                count++;
            }
        }
        int newSize = 0;
        for (String cheap : cheapNames) {
            if (cheap != null) {
                newSize++;
            }
        }

        String[] result = new String[newSize];
        int index = 0;
        for (String cheap : cheapNames) {
            if (cheap != null) {
                result[index] = cheap;
                index++;
            }
        }


        return String.join(" ", result);
    }

    public static void main (String[] args) {
        CheapStocks cheapStocks = new CheapStocks();
        String [] arr = new String[]{"gun 500", "firebow 70", "trtrtrt 30" ,  "pixboom 200"};
        System.out.println(cheapStocks.getCheapStocks(arr));
    }
}
