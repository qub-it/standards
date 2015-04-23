package pt.ist.standards.geographic;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class PostalCode extends Place<Locality, Place<PostalCode, ?>> {

    private static final long serialVersionUID = 1L;

    final SortedSet<String> streets = new TreeSet<String>();

    public final String code;

    public PostalCode(final Locality locality, final String name, final String code) {
        super(locality, name, code);
        this.code = code;
        locality.parent.parent.parent.postalCodeMap.put(code, this);
    }

    public SortedSet<String> getStreets() {
        return Collections.unmodifiableSortedSet(streets);
    }

    public String getCode() {
        return code;
    }
}
