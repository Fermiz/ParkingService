package com.thoughworks.justiceleague.domain.shared;

import java.io.Serializable;

public interface DomainEntity<T> extends Serializable {

    boolean sameIdentityAs(T other);
}
