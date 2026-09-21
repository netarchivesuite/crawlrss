package is.landsbokasafn.crawler.rss;

public interface DuplicateNotifier {
	void setDuplicateListener(DuplicateReceiver duplicateReciever);
}
