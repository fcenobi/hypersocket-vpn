package com.hypersocket.websites;

import java.util.Set;

import com.hypersocket.network.handlers.ForwardingService;
import com.hypersocket.permissions.AccessDeniedException;
import com.hypersocket.permissions.Role;
import com.hypersocket.realm.Realm;
import com.hypersocket.resource.AbstractAssignableResourceService;
import com.hypersocket.resource.ResourceChangeException;
import com.hypersocket.resource.ResourceCreationException;

public interface WebsiteResourceService extends
		AbstractAssignableResourceService<WebsiteResource>, ForwardingService<WebsiteResource> {

	WebsiteResource updateResource(WebsiteResource resourceById, String name,
			String launchUrl, String additionalUrls, Set<Role> roles)
			throws ResourceChangeException, AccessDeniedException;

	WebsiteResource createResource(String name, String launchUrl,
			String additionalUrls, Set<Role> roles, Realm realm)
			throws ResourceCreationException, AccessDeniedException;

}