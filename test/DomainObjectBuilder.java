package test;

import java.io.Serializable;

abstract class DomainObjectBuilder<T extends Serializable, U extends DomainObjectModification<T>> implements Serializable {

    DomainObjectBuilder(T bound, boolean boundToInstance) {
    }
}
