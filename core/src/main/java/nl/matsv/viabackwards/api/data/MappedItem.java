package nl.matsv.viabackwards.api.data;

import us.myles.ViaVersion.protocols.protocol1_13to1_12_2.ChatRewriter;

public class MappedItem {

    private final int id;
    private final String jsonName;

    public MappedItem(int id, String name) {
        this.id = id;
        this.jsonName = ChatRewriter.legacyTextToJson("§r" + name).toString();
    }

    public int getId() {
        return id;
    }

    public String getJsonName() {
        return jsonName;
    }
}
