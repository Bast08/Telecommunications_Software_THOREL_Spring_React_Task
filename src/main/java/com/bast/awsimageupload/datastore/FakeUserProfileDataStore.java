package com.bast.awsimageupload.datastore;


import com.bast.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("d89167b7-0eb0-4454-bc35-082de7eb8bb8"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("bed8c534-c2d2-4389-b3c8-84563dbd468b"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }

}
