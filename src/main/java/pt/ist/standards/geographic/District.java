package pt.ist.standards.geographic;

public class District extends Place<Country, Municipality> {

    private static final long serialVersionUID = 1L;

    public final String code;

    public District(final Country country, final String name, final String code) {
        super(country, name, code);
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof District && ((District) obj).getCode().equals(getCode());
    }
}
