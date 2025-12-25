package model;

/**
 * This class hold the basic data for a item within the inventory system
 * @author Skyler Broussard
 * @version 0.01
 */
final public class ItemDef 
{
	/**
	 * Base Enums for a game can be changed accordingly.
	 */
	enum ItemType {WEAPON, ARMOR, BACKPACK, CONSUMEABLE, MISC}
	
	/**
	 * StringID represents a Item name or ID, whatever is used.
	 */
	private final String myItemID;
	
	/**
	 * ItemType is the specific enum mentioned.
	 */
	private final ItemType myItemType;
	
	/**
	 * Boolean representing if a item is stackable.
	 */
	private final boolean myIsStackable;
	
	/**
	 * Checks max stack of the item.
	 */
	private final int myMaxStack;
	
	/**
	 * Item width in slots.
	 */
	private final int mySlotWidth;
	
	/**
	 * Item height in slots.
	 */
	private final int mySlotHeight;
	
	/**
	 * This is the constructor for the ItemDef.
	 * @param theItemID Name or ID of the item.
	 * @param theItemType Item's type.
	 * @param theMaxStack The max stack this item can be.
	 * @param theSlotWidth The slot width of the item.
	 * @param theSlotHeight The slot height of the item.
	 */
	public ItemDef(final String theItemID,
					final ItemType theItemType,
					final int theMaxStack,
					final int theSlotWidth,
					final int theSlotHeight)
	{
		myItemID = theItemID;
		myItemType = theItemType;
		myMaxStack = theMaxStack;
		myIsStackable =  theMaxStack > 1;
		mySlotWidth = theSlotWidth;
		mySlotHeight = theSlotHeight;
	}
	
	/**
	 * This gets the string representing the Item's ID.
	 * @return String that represents the ID.
	 */
	public String getItemID()
	{
		return myItemID;
	}
	
	/**
	 * This gets the ItemType of the Item.
	 * @return ItemType of the Item.
	 */
	public ItemType getItemType()
	{
		return myItemType;
	}
	
	/**
	 * This checks if the item is stackable.
	 * @return Boolean representing if stackable.
	 */
	public boolean isStackable()
	{
		return myIsStackable;
	}
	
	/**
	 * Gets the max stack of the item.
	 * @return Integer of the Item's max stack.
	 */
	public int getMaxStack()
	{
		return myMaxStack;
	}
	
	/**
	 * Gets the Item's slot width
	 * @return Integer representing the items slot width.
	 */
	public int getWidth()
	{
		return mySlotWidth;
	}
	
	/**
	 * Gets the Item's slot height.
	 * @return Integer representing the items slot height.
	 */
	public int getHeight()
	{
		return mySlotHeight;
	}
}
