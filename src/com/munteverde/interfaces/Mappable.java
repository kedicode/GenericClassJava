package com.munteverde.interfaces;

public interface Mappable {

    String TEMPLATE = "Render %s as %s ([%s])";
    abstract String render();
}

