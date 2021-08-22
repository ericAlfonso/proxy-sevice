package com.proxy.service.controller;

import java.net.URI;
import java.net.URISyntaxException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.view.RedirectView;

import com.proxy.service.controller.form.ProxyForm;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/proxy")
public class ProxyController {

	@GetMapping("/redirectWithRedirectView")
	public RedirectView redirectWithUsingRedirectView(HttpServletRequest request,
			@RequestParam(name = "url-website", required = true) final String url) {
		log.info("{} Headers", request.getHeaderNames().nextElement());
		return new RedirectView(url);
	}

	@SuppressWarnings("unchecked")
	@PostMapping("/redirectTo")
	public ResponseEntity<Object> redirect(HttpServletRequest request, @RequestBody ProxyForm form)
			throws URISyntaxException {
		log.info("{} Headers", request.getHeaderNames().nextElement());

		URI uri = new URI(form.getUrl());

		return ResponseEntity.status(HttpStatus.PERMANENT_REDIRECT).location(uri).build();
	}
}
