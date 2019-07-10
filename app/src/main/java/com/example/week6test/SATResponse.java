
package com.example.week6test;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SATResponse implements Parcelable
{

    @SerializedName("dbn")
    @Expose
    private String dbn;
    @SerializedName("school_name")
    @Expose
    private String schoolName;
    @SerializedName("num_of_sat_test_takers")
    @Expose
    private String numOfSatTestTakers;
    @SerializedName("sat_critical_reading_avg_score")
    @Expose
    private String satCriticalReadingAvgScore;
    @SerializedName("sat_math_avg_score")
    @Expose
    private String satMathAvgScore;
    @SerializedName("sat_writing_avg_score")
    @Expose
    private String satWritingAvgScore;
    public final static Parcelable.Creator<SATResponse> CREATOR = new Creator<SATResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public SATResponse createFromParcel(Parcel in) {
            return new SATResponse(in);
        }

        public SATResponse[] newArray(int size) {
            return (new SATResponse[size]);
        }

    }
    ;

    protected SATResponse(Parcel in) {
        this.dbn = ((String) in.readValue((String.class.getClassLoader())));
        this.schoolName = ((String) in.readValue((String.class.getClassLoader())));
        this.numOfSatTestTakers = ((String) in.readValue((String.class.getClassLoader())));
        this.satCriticalReadingAvgScore = ((String) in.readValue((String.class.getClassLoader())));
        this.satMathAvgScore = ((String) in.readValue((String.class.getClassLoader())));
        this.satWritingAvgScore = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public SATResponse() {
    }

    /**
     * 
     * @param satCriticalReadingAvgScore
     * @param numOfSatTestTakers
     * @param schoolName
     * @param dbn
     * @param satWritingAvgScore
     * @param satMathAvgScore
     */
    public SATResponse(String dbn, String schoolName, String numOfSatTestTakers, String satCriticalReadingAvgScore, String satMathAvgScore, String satWritingAvgScore) {
        super();
        this.dbn = dbn;
        this.schoolName = schoolName;
        this.numOfSatTestTakers = numOfSatTestTakers;
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
        this.satMathAvgScore = satMathAvgScore;
        this.satWritingAvgScore = satWritingAvgScore;
    }

    public String getDbn() {
        return dbn;
    }

    public void setDbn(String dbn) {
        this.dbn = dbn;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getNumOfSatTestTakers() {
        return numOfSatTestTakers;
    }

    public void setNumOfSatTestTakers(String numOfSatTestTakers) {
        this.numOfSatTestTakers = numOfSatTestTakers;
    }

    public String getSatCriticalReadingAvgScore() {
        return satCriticalReadingAvgScore;
    }

    public void setSatCriticalReadingAvgScore(String satCriticalReadingAvgScore) {
        this.satCriticalReadingAvgScore = satCriticalReadingAvgScore;
    }

    public String getSatMathAvgScore() {
        return satMathAvgScore;
    }

    public void setSatMathAvgScore(String satMathAvgScore) {
        this.satMathAvgScore = satMathAvgScore;
    }

    public String getSatWritingAvgScore() {
        return satWritingAvgScore;
    }

    public void setSatWritingAvgScore(String satWritingAvgScore) {
        this.satWritingAvgScore = satWritingAvgScore;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(dbn);
        dest.writeValue(schoolName);
        dest.writeValue(numOfSatTestTakers);
        dest.writeValue(satCriticalReadingAvgScore);
        dest.writeValue(satMathAvgScore);
        dest.writeValue(satWritingAvgScore);
    }

    public int describeContents() {
        return  0;
    }

}
