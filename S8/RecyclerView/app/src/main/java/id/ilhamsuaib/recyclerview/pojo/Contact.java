package id.ilhamsuaib.recyclerview.pojo;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

/**
 * Created by ilham on 3/27/18.
 */

public class Contact implements Parcelable {

    private String name, phone;
    private int photoProfile;

    public Contact() {
    }

    public Contact(String name, String phone, int photoProfile) {
        this.name = name;
        this.phone = phone;
        this.photoProfile = photoProfile;
    }

    protected Contact(Parcel in) {
        name = in.readString();
        phone = in.readString();
        photoProfile = in.readInt();
    }

    public static final Creator<Contact> CREATOR = new Creator<Contact>() {
        @Override
        public Contact createFromParcel(Parcel in) {
            return new Contact(in);
        }

        @Override
        public Contact[] newArray(int size) {
            return new Contact[size];
        }
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhotoProfile() {
        return photoProfile;
    }

    public void setPhotoProfile(int photoProfile) {
        this.photoProfile = photoProfile;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(phone);
        dest.writeInt(photoProfile);
    }
}
