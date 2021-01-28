package com.works.wings.auth.clientRepository;

import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClientRepository;
import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class InMysqlRegisteredClientRepository implements RegisteredClientRepository {
    private final ConcurrentHashMap<String, RegisteredClient> idRegistrationMap;
    private final ConcurrentHashMap<String, RegisteredClient> clientIdRegistrationMap;
    public InMysqlRegisteredClientRepository(RegisteredClient... registrations) {
        this(Arrays.asList(registrations));
    }
    public InMysqlRegisteredClientRepository(List<RegisteredClient> registrations) {
        Assert.notEmpty(registrations, "registrations cannot be empty");
        ConcurrentHashMap<String, RegisteredClient> idRegistrationMapResult = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, RegisteredClient> clientIdRegistrationMapResult = new ConcurrentHashMap<>();
        for (RegisteredClient registration : registrations) {
            Assert.notNull(registration, "registration cannot be null");
            String id = registration.getId();
            if (idRegistrationMapResult.containsKey(id)) {
                throw new IllegalArgumentException("Registered client must be unique. " +
                        "Found duplicate identifier: " + id);
            }
            String clientId = registration.getClientId();
            if (clientIdRegistrationMapResult.containsKey(clientId)) {
                throw new IllegalArgumentException("Registered client must be unique. " +
                        "Found duplicate client identifier: " + clientId);
            }
            idRegistrationMapResult.put(id, registration);
            clientIdRegistrationMapResult.put(clientId, registration);
        }
        this.idRegistrationMap = idRegistrationMapResult;
        this.clientIdRegistrationMap = clientIdRegistrationMapResult;
    }
    @Override
    public RegisteredClient findById(String id) {
        return null;
    }

    @Override
    public RegisteredClient findByClientId(String clientId) {
        return null;
    }
}
