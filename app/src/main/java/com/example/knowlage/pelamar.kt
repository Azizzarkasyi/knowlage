package com.example.knowlage

import android.os.Parcel
import android.os.Parcelable

data class pelamar(val image : Int ,val  pekerjaan : String, val  riPT : String, val pengalamankj : String, val email : String, val notlp : String, val pengalamanth : String):
    Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(pekerjaan)
        parcel.writeString(riPT)
        parcel.writeString(pengalamankj)
        parcel.writeString(email)
        parcel.writeString(notlp)
        parcel.writeString(pengalamanth)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<pelamar> {
        override fun createFromParcel(parcel: Parcel): pelamar {
            return pelamar(parcel)
        }

        override fun newArray(size: Int): Array<pelamar?> {
            return arrayOfNulls(size)
        }
    }
}