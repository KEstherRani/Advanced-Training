package com.esther.p7_3;

import java.util.*;

public class DeSerialization implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	private int m_prodID;
	private String m_prodName;

	DeSerialization() {
		m_prodID = -1;
		m_prodName = "";
	}

	DeSerialization(int newID, String newName) {
		m_prodID = newID;
		m_prodName = newName;
	}

	public int GetID() {
		return m_prodID;
	}

	public String GetName() {
		return m_prodName;
	}

	public void SetID(int newID) {
		m_prodID = newID;
	}

	public void SetName(String newName) {
		m_prodName = newName;
	}

	// Method to print out our data
	public void PrintValues() {
		System.out.println(m_prodID + " " + m_prodName);
	}

	public boolean equals(Object otherProduct) {
		DeSerialization p = (DeSerialization) otherProduct;
		return (this.m_prodID == p.m_prodID);
	}
}

class Products {
	@SuppressWarnings("rawtypes")
	private Vector m_vProds;

	public Products() {
		// Constructor just allocates new vector
		m_vProds = new Vector();
	}

	@SuppressWarnings("unchecked")
	public void AddProduct(int newID, String newName) {
		int i;
		DeSerialization p;

		for (i = 0; i < m_vProds.size(); i++) {
			p = (DeSerialization) m_vProds.elementAt(i);
			if (p.GetID() > newID) {
				break; // insert at position i
			}
		}

		if (i == m_vProds.size()) {
			m_vProds.addElement(new DeSerialization(newID, newName));
		} else {
			m_vProds.insertElementAt(new DeSerialization(newID, newName), i);
		}
	}

	public void DeleteProduct(int targetID) {
		int i;
		i = m_vProds.indexOf(new DeSerialization(targetID, ""));
		if (i < 0)
			return;
		m_vProds.removeElementAt(i);
	}

	public String FindProductName(int targetID) {
		int i;
		String s = "";
		i = m_vProds.indexOf(new DeSerialization(targetID, ""));
		if (i >= 0)
			s = ((DeSerialization) m_vProds.elementAt(i)).GetName();
		return s;
	}

	public void PrintProducts() {
		DeSerialization p;
		for (int i = 0; i < m_vProds.size(); i++) {
			p = (DeSerialization) m_vProds.elementAt(i);
			p.PrintValues();
		}
	}

	public static void main(String[] args) {
		String s;
		Products p = new Products();
		System.out.println("List of the Product:");
		p.AddProduct(1001, "Maruti 800");
		p.AddProduct(2002, "Maruti Zen");
		p.AddProduct(3003, "Maruti Dezire");
		p.AddProduct(4004, "Maruti Alto");

		p.PrintProducts();

		System.out.println("After deletion of the product the new List :");
		p.DeleteProduct(3);
		System.out.println("Object has been deserialized ");
		System.out.println("List of the Product:");
		p.PrintProducts();

	}

}
