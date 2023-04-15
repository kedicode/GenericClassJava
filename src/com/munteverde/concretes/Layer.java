package com.munteverde.concretes;

import com.munteverde.interfaces.Mappable;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {
    private List<T> elements;

    public Layer(List<T> elements) {
        this.elements = elements;
    }

    public Layer() {
        this(new ArrayList<>());
    }

    public void addElement(T element) {
        if (!elements.contains(element)) {
            elements.add(element);
        }
    }

    public void renderLayer() {
        for (T element : elements) {
            System.out.println(element.render());
        }
    }
}
