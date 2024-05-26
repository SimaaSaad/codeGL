/***********************************************************************
 * Module:  CommandeStandard.java
 * Author:  21655
 * Purpose: Defines the Class CommandeStandard
 ***********************************************************************/

import java.util.*;

/** @pdOid b5b1b1f4-8ab2-46ba-a4cc-eaefcf2a06d0 */
public class CommandeStandard implements Icommande {
   /** @pdOid 4aa63380-0c8b-457e-8707-591211e0ff7e */
   private int numCmd;
   /** @pdOid e8de99ce-f6f5-46ad-a90f-4f85513d518b */
   private Date dateCreation;
   /** @pdOid 98d8ba1a-250b-4726-af64-3343b8b72aba */
   private Date dateEnvoi;
   /** @pdOid ed4d9162-2ec7-4801-9878-e472c611dee6 */
   private String nomClient;
   /** @pdOid 4c16475e-1ec3-4e7e-bf3b-654ba5ad0e2f */
   private int numClient;
   /** @pdOid f19e800f-9041-476b-8da2-31b0ad9f9711 */
   private String statut;
   /** @pdOid 2ad7a2e9-89bb-4264-8a5c-abe1c9a4a008 */
   private int numEnvoi;
   
   /** @pdOid f2052610-315a-4c53-a1fb-ee050719437c */
   public void confirmerCommande() {
      // TODO: implement
   }
   
   /** @pdOid cd8760be-55c8-4d8d-9355-e017bebbc4a2 */
   public void obtenirPanier() {
      // TODO: implement
   }

}