/*
 * TAAG-AT/Api/v1/Etudiants
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
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
import io.swagger.client.model.DetailsMetierDataAttributesCompetences;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * DetailsMetierDataAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-30T17:21:14.807Z[GMT]")
public class DetailsMetierDataAttributes {
  @SerializedName("nom")
  private String nom = null;

  @SerializedName("competences")
  private DetailsMetierDataAttributesCompetences competences = null;

  @SerializedName("missions")
  private DetailsMetierDataAttributesCompetences missions = null;

  public DetailsMetierDataAttributes nom(String nom) {
    this.nom = nom;
    return this;
  }

   /**
   * Get nom
   * @return nom
  **/
  @Schema(description = "")
  public String getNom() {
    return nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public DetailsMetierDataAttributes competences(DetailsMetierDataAttributesCompetences competences) {
    this.competences = competences;
    return this;
  }

   /**
   * Get competences
   * @return competences
  **/
  @Schema(description = "")
  public DetailsMetierDataAttributesCompetences getCompetences() {
    return competences;
  }

  public void setCompetences(DetailsMetierDataAttributesCompetences competences) {
    this.competences = competences;
  }

  public DetailsMetierDataAttributes missions(DetailsMetierDataAttributesCompetences missions) {
    this.missions = missions;
    return this;
  }

   /**
   * Get missions
   * @return missions
  **/
  @Schema(description = "")
  public DetailsMetierDataAttributesCompetences getMissions() {
    return missions;
  }

  public void setMissions(DetailsMetierDataAttributesCompetences missions) {
    this.missions = missions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailsMetierDataAttributes detailsMetierDataAttributes = (DetailsMetierDataAttributes) o;
    return Objects.equals(this.nom, detailsMetierDataAttributes.nom) &&
        Objects.equals(this.competences, detailsMetierDataAttributes.competences) &&
        Objects.equals(this.missions, detailsMetierDataAttributes.missions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, competences, missions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailsMetierDataAttributes {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    competences: ").append(toIndentedString(competences)).append("\n");
    sb.append("    missions: ").append(toIndentedString(missions)).append("\n");
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
