package com.brunoserralheiro.springmvc2.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.brunoserralheiro.springmvc2.model.dao.ContactDAO;
import com.brunoserralheiro.springmvc2.model.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	
	@Autowired(required = false)
	@Transactional
	public void addContact(Contact contact) {
		contactDAO.addContact(contact);
	}

	@Transactional
	public List<Contact> listContact() {

		return contactDAO.listContact();
	}

	@Transactional
	public void removeContact(Integer id) {
		contactDAO.removeContact(id);
	}
}
