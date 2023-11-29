package example.lesson23.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeElement implements Element{

    List<Element> elements = new ArrayList<>();

    public CompositeElement(Element... elements) {
        this.elements.addAll(List.of(elements));
    }

    @Override
    public int getPrice() {
        return elements.stream().map(Element::getPrice).mapToInt(Integer::intValue).sum();
    }
}