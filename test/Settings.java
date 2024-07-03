package test;

abstract class Settings<S extends Settings<? extends S, B>, B extends Settings.Builder<? extends B, S>> {

    abstract static class Builder<B extends Builder<? extends B, S>, S extends Settings<? extends S, B>> extends DomainObjectBuilder<S, Modification<S>> {

        protected Builder(S bound, boolean boundToInstance) {
            super(bound, boundToInstance);
        }
    }

    static class Modification<S extends Settings<? extends S, ?>> implements DomainObjectModification<S> {
    }
}
