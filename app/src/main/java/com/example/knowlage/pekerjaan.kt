package com.example.knowlage

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


data class pekerjaan(val image : Int ,val  pekerjaaan : String, val  PT : String, val tempat : String ) :Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    )

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(pekerjaaan)
        parcel.writeString(PT)
        parcel.writeString(tempat)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<pekerjaan> {
        override fun createFromParcel(parcel: Parcel): pekerjaan {
            return pekerjaan(parcel)
        }

        override fun newArray(size: Int): Array<pekerjaan?> {
            return arrayOfNulls(size)
        }
    }
}

