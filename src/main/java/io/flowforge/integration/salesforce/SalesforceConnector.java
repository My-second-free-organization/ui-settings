package io.flowforge.integration.salesforce;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class SalesforceConnector {
    private static final Logger log = LoggerFactory.getLogger(SalesforceConnector.class);

    public void syncContacts() { log.info("Syncing contacts from Salesforce"); }
    public void syncOpportunities() { log.info("Syncing opportunities from Salesforce"); }
    public void createCase(String subject, String description) { log.info("Creating Salesforce case: {}", subject); }
    public void updateLead(String leadId, String status) { log.info("Updating lead {} to {}", leadId, status); }
}
