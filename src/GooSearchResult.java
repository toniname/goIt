class GooSearchResult {
    private final String url;

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public String parseDomain() {
        String[] parts = url.split("/");
        if (parts.length > 2 && parts[0].equals("http:")) {
            return parts[2];
        } else if (parts.length > 0) {
            return parts[parts.length - 1];
        } else {
            return "";
        }
    }
}

class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
    }
}
