package com.jonathanduque.maestrodetalle.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p/>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    static {
        // Add 3 sample items.
        addItem(new DummyItem("0", "Acerca de Guarne"));
        addItem(new DummyItem("1", "Bares"));
        addItem(new DummyItem("2", "Hoteles"));
        addItem(new DummyItem("3", "Sitios Turisticos"));
        addItem(new DummyItem("4", "Acerca del Autor"));
        //addItem(new DummyItem("5", "Pagina Oficial"));

    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public String id;
        public String item_name;

        public DummyItem(String id, String item_name) {
            this.id = id;
            this.item_name = item_name;
        }

        @Override
        public String toString() {
            return item_name;
        }
    }
}
