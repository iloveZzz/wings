package com.works.wings.wingssecurity.web;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

/**
 * @author Rob Winch
 */
@Controller
public class OAuth2LoginController {

	@GetMapping("/acc")
	public Mono<Void> index(Model model,
							@RegisteredOAuth2AuthorizedClient OAuth2AuthorizedClient authorizedClient,
							@AuthenticationPrincipal OAuth2User oauth2User) {
		model.addAttribute("userName", oauth2User.getName());
		model.addAttribute("clientName", authorizedClient.getClientRegistration().getClientName());
		model.addAttribute("userAttributes", oauth2User.getAttributes());
		System.out.println(1111);
		return Mono.empty();
	}
}