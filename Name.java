import java.util.Date;

public class Name {
    private String title;
    private String first;
    private String middle;
    private String surname;
    private String paternal;
    private String maternal;
    private String suffixGenerational;
    private String suffixProfessional;

    public Name (
            String title,
            String first,
            String middle,
            String surname,
            String paternal,
            String maternal,
            String generational,
            String professional
            ) {
        this.title = title;
        this.first = first;
        this.middle = middle;
        this.surname = surname;
        this.paternal = paternal;
        this.maternal = maternal;
        this.suffixGenerational = generational;
        this.suffixProfessional = professional;
    }

    public String getTitle() {
        return title;
    }

    public String getFirst() {
        return this.first;
    }

    public String getMiddle() {
        return null;
    }

    public String getSurname() {
        return null;
    }

    public String getPaternal() {
        return paternal;
    }

    public String getMaternal() {
        return maternal;
    }

    public String getSuffixProfessional() {
        return professional;
    }

    public String getSuffixGenerational() {
        return suffixGenerational;
    }
		
		public String getNameAllCaps() {
			return null;
		}
}
