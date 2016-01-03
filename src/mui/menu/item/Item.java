package mui.menu.item;

public abstract class Item {
    
    protected String name;

    /**
     * 
     * @return True if the menu loop must continue after
     * the function has finished execution. False if
     * the menu loop must end.
     * @throws MenuException If a bad menu item has been selected
     */
    public abstract boolean action();

    public String getName() {
    	
        return name;
        
    }

}
