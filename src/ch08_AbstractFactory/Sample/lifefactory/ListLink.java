package ch08_AbstractFactory.Sample.lifefactory;

import ch08_AbstractFactory.Sample.factory.*;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
