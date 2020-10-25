package instance;

import java.util.Objects;

public class InstanceOfSato {
	private String firstName;

    public InstanceOfSato(String firstName) {
        this.firstName = firstName;
    }

        @Override
        public int hashCode() {
            return Objects.hash(firstName);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!(obj instanceof InstanceOfSato)) {
                return false;
            }
            InstanceOfSato other = (InstanceOfSato) obj;
            return Objects.equals(firstName, other.firstName);
        }

}
