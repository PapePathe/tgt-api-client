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
import io.swagger.client.model.MetierListItemAttributesMetiers;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * MetierListItemAttributes
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-10-30T17:21:14.807Z[GMT]")
public class MetierListItemAttributes {
  @SerializedName("nom")
  private String nom = null;

  @SerializedName("metiers")
  private MetierListItemAttributesMetiers metiers = null;

  public MetierListItemAttributes nom(String nom) {
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

  public MetierListItemAttributes metiers(MetierListItemAttributesMetiers metiers) {
    this.metiers = metiers;
    return this;
  }

   /**
   * Get metiers
   * @return metiers
  **/
  @Schema(description = "")
  public MetierListItemAttributesMetiers getMetiers() {
    return metiers;
  }

  public void setMetiers(MetierListItemAttributesMetiers metiers) {
    this.metiers = metiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetierListItemAttributes metierListItemAttributes = (MetierListItemAttributes) o;
    return Objects.equals(this.nom, metierListItemAttributes.nom) &&
        Objects.equals(this.metiers, metierListItemAttributes.metiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nom, metiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetierListItemAttributes {\n");
    
    sb.append("    nom: ").append(toIndentedString(nom)).append("\n");
    sb.append("    metiers: ").append(toIndentedString(metiers)).append("\n");
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