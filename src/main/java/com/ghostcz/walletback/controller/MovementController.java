package com.ghostcz.walletback.controller;

import com.fasterxml.jackson.databind.JsonNode;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movement")
public class MovementController {

	@PostMapping(value = "/list")
	public String listener(HttpServletRequest request , @RequestBody JsonNode payload) {
		System.out.println(payload);
		System.out.println(payload.get("test"));
		return "respuesta ok ";
	}

}
