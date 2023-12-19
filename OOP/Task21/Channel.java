public class Channel {
    private String mtv;
    private String discovery;
    private String firstChannel;
    private String news;
    private String musicChannel;

    public Channel(String mtv, String discovery, String firstChannel, String news, String musicChannel) {
        this.mtv = mtv;
        this.discovery = discovery;
        this.firstChannel = firstChannel;
        this.news = news;
        this.musicChannel = musicChannel;
    }

    public String getMtv() {
        return mtv;
    }

    public String getDiscovery() {
        return discovery;
    }

    public String getFirstChannel() {
        return firstChannel;
    }

    public String getNews() {
        return news;
    }

    public String getMusicChannel() {
        return musicChannel;
    }
}