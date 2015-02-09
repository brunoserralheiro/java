package com.brunoserralheiro.springmvc2.model.service;

import java.util.List;

import com.brunoserralheiro.springmvc2.model.entity.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
