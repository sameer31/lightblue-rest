/*
 Copyright 2013 Red Hat, Inc. and/or its affiliates.

 This file is part of lightblue.

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.redhat.lightblue.rest.auth;

import java.util.Set;

import com.redhat.lightblue.rest.auth.health.RolesProviderHealth;

/**
 * Roles provider.
 *
 * @author mpatercz
 *
 */
public interface RolesProvider {

    /**
     * Get roles for given user.
     *
     * @param username
     * @return A set of roles. If no roles are found, returns an empty set. Never returns null.
     * @throws Exception
     */
    public Set<String> getUserRoles(String username) throws Exception;

    /**
     * Checks the Roles Provider health. The respective implementations should
     * provide the health of lightblue Roles Provider which is further exposed by
     * dropwizard metrics HealthCheckServlet REST endpoint
     */
    public RolesProviderHealth checkHealth();
}
