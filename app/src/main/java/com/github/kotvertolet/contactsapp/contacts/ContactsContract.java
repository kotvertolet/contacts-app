package com.github.kotvertolet.contactsapp.contacts;

import com.github.kotvertolet.contactsapp.BasePresenter;
import com.github.kotvertolet.contactsapp.BaseView;
import com.github.kotvertolet.contactsapp.data.pojo.ContactGroupItem;

import java.util.List;

public interface ContactsContract {

    interface View extends BaseView<Presenter> {

        void setLoadingIndicator(boolean show);

        void showContacts(List<ContactGroupItem> contactGroupList);

        void showLoadingContactsError();

    }

    interface Presenter extends BasePresenter {

        void loadContacts(boolean forceUpdate);

    }

}
