/*
 * QES Quant Service API
 * QES Quant Service API provides easy access to Risk/Optimization API 
 *
 * OpenAPI spec version: 0.0.4
 * Contact: luo.qes@wolferesearch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * JobModel
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-01-22T20:31:04.892Z")
public class JobModel {
  @SerializedName("TYPEID")
  private String TYPEID = null;

  @SerializedName("USER_")
  private String USER_ = null;

  @SerializedName("UUID")
  private String UUID = null;

  @SerializedName("STARTTIME")
  private String STARTTIME = null;

  @SerializedName("STATUS")
  private String STATUS = null;

  @SerializedName("ENDTIME")
  private String ENDTIME = null;

  @SerializedName("MESSAGE")
  private String MESSAGE = null;

  public JobModel TYPEID(String TYPEID) {
    this.TYPEID = TYPEID;
    return this;
  }

   /**
   * Unique id of the risk model
   * @return TYPEID
  **/
  @ApiModelProperty(value = "Unique id of the risk model")
  public String getTYPEID() {
    return TYPEID;
  }

  public void setTYPEID(String TYPEID) {
    this.TYPEID = TYPEID;
  }

  public JobModel USER_(String USER_) {
    this.USER_ = USER_;
    return this;
  }

   /**
   * Template used for risk model
   * @return USER_
  **/
  @ApiModelProperty(value = "Template used for risk model")
  public String getUSER_() {
    return USER_;
  }

  public void setUSER_(String USER_) {
    this.USER_ = USER_;
  }

  public JobModel UUID(String UUID) {
    this.UUID = UUID;
    return this;
  }

   /**
   * Date on which riks model was created
   * @return UUID
  **/
  @ApiModelProperty(value = "Date on which riks model was created")
  public String getUUID() {
    return UUID;
  }

  public void setUUID(String UUID) {
    this.UUID = UUID;
  }

  public JobModel STARTTIME(String STARTTIME) {
    this.STARTTIME = STARTTIME;
    return this;
  }

   /**
   * Date on which riks model was created
   * @return STARTTIME
  **/
  @ApiModelProperty(value = "Date on which riks model was created")
  public String getSTARTTIME() {
    return STARTTIME;
  }

  public void setSTARTTIME(String STARTTIME) {
    this.STARTTIME = STARTTIME;
  }

  public JobModel STATUS(String STATUS) {
    this.STATUS = STATUS;
    return this;
  }

   /**
   * Date on which riks model was created
   * @return STATUS
  **/
  @ApiModelProperty(value = "Date on which riks model was created")
  public String getSTATUS() {
    return STATUS;
  }

  public void setSTATUS(String STATUS) {
    this.STATUS = STATUS;
  }

  public JobModel ENDTIME(String ENDTIME) {
    this.ENDTIME = ENDTIME;
    return this;
  }

   /**
   * Date on which riks model was created
   * @return ENDTIME
  **/
  @ApiModelProperty(value = "Date on which riks model was created")
  public String getENDTIME() {
    return ENDTIME;
  }

  public void setENDTIME(String ENDTIME) {
    this.ENDTIME = ENDTIME;
  }

  public JobModel MESSAGE(String MESSAGE) {
    this.MESSAGE = MESSAGE;
    return this;
  }

   /**
   * Date on which riks model was created
   * @return MESSAGE
  **/
  @ApiModelProperty(value = "Date on which riks model was created")
  public String getMESSAGE() {
    return MESSAGE;
  }

  public void setMESSAGE(String MESSAGE) {
    this.MESSAGE = MESSAGE;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobModel jobModel = (JobModel) o;
    return Objects.equals(this.TYPEID, jobModel.TYPEID) &&
        Objects.equals(this.USER_, jobModel.USER_) &&
        Objects.equals(this.UUID, jobModel.UUID) &&
        Objects.equals(this.STARTTIME, jobModel.STARTTIME) &&
        Objects.equals(this.STATUS, jobModel.STATUS) &&
        Objects.equals(this.ENDTIME, jobModel.ENDTIME) &&
        Objects.equals(this.MESSAGE, jobModel.MESSAGE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(TYPEID, USER_, UUID, STARTTIME, STATUS, ENDTIME, MESSAGE);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobModel {\n");
    
    sb.append("    TYPEID: ").append(toIndentedString(TYPEID)).append("\n");
    sb.append("    USER_: ").append(toIndentedString(USER_)).append("\n");
    sb.append("    UUID: ").append(toIndentedString(UUID)).append("\n");
    sb.append("    STARTTIME: ").append(toIndentedString(STARTTIME)).append("\n");
    sb.append("    STATUS: ").append(toIndentedString(STATUS)).append("\n");
    sb.append("    ENDTIME: ").append(toIndentedString(ENDTIME)).append("\n");
    sb.append("    MESSAGE: ").append(toIndentedString(MESSAGE)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

