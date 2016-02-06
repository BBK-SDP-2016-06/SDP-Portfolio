package Question12_Composite;

import java.util.ArrayList;
import java.util.List;

public class HtmlParentElement extends HtmlTag {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTag> children;

    public HtmlParentElement(String tagName) {
        this.tagName = tagName;
        children = new ArrayList<>();
    }

    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChildTag(HtmlTag htmlTag) {
        children.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTag htmlTag) {
        String tagName = htmlTag.getTagName();
        for(HtmlTag tag : children) {
            if (tag.getTagName().equals(tagName)) {
                children.remove(tag);
            }
        }
    }

    @Override
    public List<HtmlTag> getChildren() {
        return children;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for(HtmlTag tag : children) {
            tag.generateHtml();
        }
        System.out.println(endTag);
    }
}
