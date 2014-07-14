/*
 * Camel Api Route test generated by camel-component-util-maven-plugin
 * Generated on: Wed Jul 09 19:57:10 PDT 2014
 */
package org.apache.camel.component.linkedin;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.builder.RouteBuilder;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.camel.component.linkedin.internal.LinkedInApiCollection;
import org.apache.camel.component.linkedin.internal.GroupsResourceApiMethod;

/**
 * Test class for {@link org.apache.camel.component.linkedin.api.GroupsResource} APIs.
 */
public class GroupsResourceIntegrationTest extends AbstractLinkedInTestSupport {

    private static final Logger LOG = LoggerFactory.getLogger(GroupsResourceIntegrationTest.class);
    private static final String PATH_PREFIX = LinkedInApiCollection.getCollection().getApiName(GroupsResourceApiMethod.class).getName();

    // TODO provide parameter values for addPost
    @Ignore
    @Test
    public void testAddPost() throws Exception {
        final Map<String, Object> headers = new HashMap<String, Object>();
        headers.put("CamelLinkedIn.group_id", 0L);
        // parameter type is org.apache.camel.component.linkedin.api.model.Post
        headers.put("CamelLinkedIn.post", null);

        requestBodyAndHeaders("direct://ADDPOST", null, headers);
    }

    // TODO provide parameter values for getGroup
    @Ignore
    @Test
    public void testGetGroup() throws Exception {
        // using long message body for single parameter "group_id"
        final org.apache.camel.component.linkedin.api.model.Group result = requestBody("direct://GETGROUP", 0L);

        assertNotNull("getGroup result", result);
        LOG.debug("getGroup: " + result);
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            public void configure() {
                // test route for addPost
                from("direct://ADDPOST")
                  .to("linkedin://" + PATH_PREFIX + "/addPost");

                // test route for getGroup
                from("direct://GETGROUP")
                  .to("linkedin://" + PATH_PREFIX + "/getGroup?inBody=group_id");

            }
        };
    }
}
