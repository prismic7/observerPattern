import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<SubInterface> subscribers = new ArrayList<>();
    private String news = "";

    public void subscribe(SubInterface s) {
        if (s != null && !subscribers.contains(s)) {
            subscribers.add(s);
        }
    }

    public void unsubscribe(SubInterface s) {
        subscribers.remove(s);
    }

    public void updateBreakingNews(String updNews) {
        this.news = updNews;
        notifySubscribers();
    }

    private void notifySubscribers() {
        for (SubInterface sub : subscribers) {
            sub.update(news);
        }
    }

    public int getSubscriberCount() {
        return subscribers.size();
    }
}