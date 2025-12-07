public class MainService {
    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();

        Subscriber s1 = new Subscriber(1);
        Subscriber s2 = new Subscriber(2);
        Subscriber s3 = new Subscriber(3);

        agency.subscribe(s1);
        agency.subscribe(s2);
        agency.subscribe(s3);

        System.out.println("Subscribers: " + agency.getSubscriberCount());

        agency.updateBreakingNews("Breaking: Major earthquake in the Pacific!");

        agency.unsubscribe(s2);

        System.out.println("\nAfter one unsubscribed:");
        agency.updateBreakingNews("New update: Rescue operations underway.");
    }
}