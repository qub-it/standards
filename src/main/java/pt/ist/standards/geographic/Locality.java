package pt.ist.standards.geographic;

public class Locality extends Place<Municipality, PostalCode> {

    private static final long serialVersionUID = 1L;

    public final String code;

    public Locality(final Municipality municipality, final String name, final String code) {
        super(municipality, name, code);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof Locality && ((Locality) obj).getCode().equals(getCode());
    }
}
