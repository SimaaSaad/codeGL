/***********************************************************************
 * Module:  Produit.java
 * Author:  21655
 * Purpose: Defines the Class Produit
 ***********************************************************************/

import java.util.*;

/** @pdOid d8ecdfa1-e2d6-4c7f-94ef-2967071671e0 */
public class Produit {
   /** @pdOid 86b24d14-1167-4ff4-a099-2255c149e56e */
   private int numProd;
   /** @pdOid 6136fca8-011b-48e2-816d-41c67e5ddda0 */
   private String nomProd;
   /** @pdOid be695f28-f971-464b-9b34-01cb60a0e1ed */
   private String description;
   
   /** @pdRoleInfo migr=no name=CommandeStandard assc=prodComstan coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<CommandeStandard> commandeStandard;
   
   /** @pdOid 3d03bfe3-e478-4990-aa8f-27821db3a613 */
   public void ajouterProd() {
      // TODO: implement
   }
   
   /** @pdOid 452f47a9-4a43-45ad-81fb-6ce6ec382222 */
   public void modifierProd() {
      // TODO: implement
   }
   
   /** @pdOid 3b29fcdc-47a5-4c27-a4a2-6087bf84c1f7 */
   public void supprimerProd() {
      // TODO: implement
   }
   
   /** @pdOid 40e6dc24-1ee7-4957-83c2-c372ea6e4d29 */
   public void voirDetailProd() {
      // TODO: implement
   }
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<CommandeStandard> getCommandeStandard() {
      if (commandeStandard == null)
         commandeStandard = new java.util.HashSet<CommandeStandard>();
      return commandeStandard;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorCommandeStandard() {
      if (commandeStandard == null)
         commandeStandard = new java.util.HashSet<CommandeStandard>();
      return commandeStandard.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newCommandeStandard */
   public void setCommandeStandard(java.util.Collection<CommandeStandard> newCommandeStandard) {
      removeAllCommandeStandard();
      for (java.util.Iterator iter = newCommandeStandard.iterator(); iter.hasNext();)
         addCommandeStandard((CommandeStandard)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newCommandeStandard */
   public void addCommandeStandard(CommandeStandard newCommandeStandard) {
      if (newCommandeStandard == null)
         return;
      if (this.commandeStandard == null)
         this.commandeStandard = new java.util.HashSet<CommandeStandard>();
      if (!this.commandeStandard.contains(newCommandeStandard))
         this.commandeStandard.add(newCommandeStandard);
   }
   
   /** @pdGenerated default remove
     * @param oldCommandeStandard */
   public void removeCommandeStandard(CommandeStandard oldCommandeStandard) {
      if (oldCommandeStandard == null)
         return;
      if (this.commandeStandard != null)
         if (this.commandeStandard.contains(oldCommandeStandard))
            this.commandeStandard.remove(oldCommandeStandard);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllCommandeStandard() {
      if (commandeStandard != null)
         commandeStandard.clear();
   }

}