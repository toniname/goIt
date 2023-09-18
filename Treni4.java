

import java.util.Arrays;

public class Treni4 {

    public void multiplyPrices(float[] prices) {

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 1000) {
                prices[i] *= 2;
            } else {
                prices[i] *= 1.5F;
            }
        }

    }

    public int[] findMinMaxPrices(int[] prices) {

        if (prices.length == 0 ) {
            return new int[0];
        }

        int minPrice = prices[0];
        int maxPrice = prices[0];

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
            }

        }

        if (minPrice == maxPrice) {
            return new int[]{minPrice};
        } else {
            return new int[]{minPrice, maxPrice};
        }

    }

    public int getMinPriceCount(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int minPrice = prices[0];
        int count = 1;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                count = 1;
            } else if (prices[i] == minPrice) {
                count++;
            }

        }
        return count;
    }

    public void printPrices(float[] prices) {
        for (float price : prices) {
            System.out.println(price + " jup.");
        }
    }

    public int[] removePrice(int[] prices, int toRemove) {
        int count = 0;
        for (int price : prices) {
            if (price != toRemove) {
                count++;
            }
        }
        int count2 = 0;
        int[] resultArr = new int[count];

        for (int price : prices) {
            if (price != toRemove) {
                resultArr[count2] = price;
                count2++;
            }
        }
        return resultArr;
    }

    public int[] leavePrice9(int[] prices) {
        int count = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                count++;
            }

        }

        int[] resultArr = new int[count];

        int count2 = 0;
        for (int price : prices) {
            if (price % 10 == 9) {
                resultArr[count2] = price;
                count2++;
            }

        }
        return resultArr;
    }

    public String[] mergeStocks(String[] showcaseStocks, String[] warehouseStocks) {
        int count = 0;
        for (String showCase : showcaseStocks) {
            count++;
        }
        int count2 = 0;
        for (String showCase : showcaseStocks) {
            count2++;
        }
        int resultCount = count + count2;
        String[] arr = new String[resultCount];

        for (int i = 0; i < showcaseStocks.length; i++) {
            arr[i] = showcaseStocks[i];
        }

        for (int i = 0; i < warehouseStocks.length; i++) {
            arr[showcaseStocks.length + i] = warehouseStocks[i];
        }

        return arr;
    }

    public int getPricesSum(int[] prices, int minPrice, int maxPrice) {
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] >= minPrice && prices[i] <= maxPrice) {
                sum += prices[i];
            }
        }
        return sum;
    }

    //Test output
    public static void main(String[] args) {
        Treni4 shop = new Treni4();
        //Should be [200, 2250]
       float[] prices = new float[]{100f, 1500f};
        shop.multiplyPrices(prices);
        System.out.println(Arrays.toString(prices));
        int[] arr = {3, 4, 6, 2};
        int[] arr2 = {0};
        shop.findMinMaxPrices(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        shop.getMinPriceCount(arr);
        int[] prices2 = new int[]{100, 109, 300, 29, 10, 10, 70};
        System.out.println(shop.getMinPriceCount(prices2));
        System.out.println(shop.getPricesSum(new int[]{10, 700, 40, 500}, 10, 50));


    }
}
