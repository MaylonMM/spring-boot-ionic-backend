package com.maylonmagri.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.maylonmagri.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
