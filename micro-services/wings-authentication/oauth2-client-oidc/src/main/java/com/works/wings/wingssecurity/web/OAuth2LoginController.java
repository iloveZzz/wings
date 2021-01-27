package com.works.wings.wingssecurity.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rob Winch
 */
@RestController
public class OAuth2LoginController {

	@GetMapping("/acc")
	public OAuth2User index(
							@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
							@AuthenticationPrincipal OAuth2User oauth2User) {
		System.out.println( oauth2User.getName());
		System.out.println(authorizedClient.getClientRegistration().getClientName());
		System.out.println(oauth2User.getAttributes());
		return oauth2User;
	}
}