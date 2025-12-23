package model;

final public class ItemDef 
{
	enum ItemType {WEAPON, ARMOR, BACKPACK, CONSUMEABLE, MISC}
	
	private final String myItemID;
	
	private final ItemType myItemType;
	
	private final boolean myIsStackable;
	
	private final int myMaxStack;
	
	private final int mySlotWidth;
	
	private final int mySlotHeight;
	
	
	public ItemDef(final String theItemID,
					final ItemType theItemType,
					final boolean theIsStackable,
					final int theMaxStack,
					final int theSlotWidth,
					final int theSlotHeight)
	{
		myItemID = theItemID;
		myItemType = theItemType;
		myIsStackable =  theIsStackable;
		myMaxStack = theMaxStack;
		mySlotWidth = theSlotWidth;
		mySlotHeight = theSlotHeight;
	}
	
	public String getItemID()
	{
		return myItemID;
	}
	
	public ItemType getItemType()
	{
		return myItemType;
	}
	
	public boolean isStackable()
	{
		return myIsStackable;
	}
	
	public int getMaxStack()
	{
		return myMaxStack;
	}
	
	public int getWidth()
	{
		return mySlotWidth;
	}
	
	public int getHeight()
	{
		return mySlotHeight;
	}

}
