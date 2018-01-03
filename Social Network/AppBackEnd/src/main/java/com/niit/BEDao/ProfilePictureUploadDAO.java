package com.niit.BEDao;

import com.niit.BEmodel.Profilepic;

public interface ProfilePictureUploadDAO {
     public boolean save(Profilepic pp);
     public Profilepic getProfilepic(String username);
}
