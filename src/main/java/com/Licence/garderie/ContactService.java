package com.Licence.garderie;

import java.util.List;


public interface ContactService {
    List < Contact > getAllContacts();
    void saveContact(Contact contact);
    void updateContact(Contact contact);
    Contact getContactById(long id);
    void deleteContactById(long id);
}

