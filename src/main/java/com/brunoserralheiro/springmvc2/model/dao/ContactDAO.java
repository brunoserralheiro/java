package com.brunoserralheiro.springmvc2.model.dao;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.brunoserralheiro.springmvc2.model.entity.Contact;

@Transactional(propagation = Propagation.REQUIRED)
public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
