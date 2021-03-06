/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: Apache License, Version 2.0
 * See the LICENSE file in the root directory or visit http://www.apache.org/licenses/LICENSE-2.0
 */
package org.hibernate.sqm.parser.criteria.spi.path;

import javax.persistence.criteria.From;

import org.hibernate.sqm.parser.common.ImplicitAliasGenerator;

/**
 * @author Steve Ebersole
 */
public interface FromImplementor<Z,X> extends From<Z,X>, PathImplementor<X> {
	void prepareAlias(ImplicitAliasGenerator implicitAliasGenerator);
}
