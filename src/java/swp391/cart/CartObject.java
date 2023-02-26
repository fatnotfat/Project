/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swp391.cart;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.naming.NamingException;
import swp391.product.ProductDAO;
import swp391.product.ProductDTO;

/**
 *
 * @author nguye
 */
public class CartObject implements Serializable{
    private Map<String, Integer> items;
    private Map<String, ProductDTO> itemDetail;
    
    
    public Map<String, Integer> getItems() {
        return items;
    }
    
    public Map<String, ProductDTO> getItemDetail(){
        return itemDetail;
    }
    
    public ProductDTO getBoughtProduct(String id){
        return this.itemDetail.get(id);
    }

    
    
    public void addItemToCart(String id) throws NamingException, SQLException{
        
        ProductDAO dao = new ProductDAO();
        //1. Check item's id is existed
        if(id == null){
            return;
        }
        if(id.trim().isEmpty()){
            return;
        }
        //2. when item is existed, checking existed items
        if(this.items == null){
            this.items = new HashMap<>();
        }
        
        if(this.itemDetail == null){
            this.itemDetail = new HashMap<>();
        }
        
        
        
        //3. when items has existed, checking existed id
        int quantity = 1;
        
        if(this.items.containsKey(id)){
            quantity = this.items.get(id) + 1;
        }
        
        if(!this.itemDetail.containsKey(id)){
            this.itemDetail.put(id, dao.getItemByID(id));
        }
        
        //4. update items
        
        this.items.put(id, quantity);
    }
    
    public void removeItemFromCart(String id){
        
        if(id == null){
            return;
        }
        
        if(id.trim().isEmpty()){
            return;
        }
        //1. checking if cart existed
        if(this.items == null){
            return;
        }
        
        //2. when items existed, check id 
        if(this.items.containsKey(id)){
            this.items.remove(id);
            if(this.items.isEmpty()){
                this.items = null;
            }
        }
        
        
    }
    
    public void updateItemQuantity(String id, int quantity){
        if(id == null){
            return;
        }
        
        if(id.trim().isEmpty()){
            return;
        }
        //1. checking if cart existed
        if(this.items == null){
            return;
        }
        //2. when items existed, check id 
        if(this.items.containsKey(id)){
            this.items.put(id, quantity);
            if(quantity == 0){
                this.items.remove(id);
                this.itemDetail.remove(id);
            }
        }
    }
}
