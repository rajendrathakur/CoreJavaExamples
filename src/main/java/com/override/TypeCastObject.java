package com.override;

class Flower{
	int leafCount = 10;
	int leafCount1 = 40;
	
	
	void smell(){
		System.out.println("Flower smells");
	}
	
	void size(){
		System.out.println("Flower Size");
	}
}
class Rose extends Flower{
	int leafCount = 20;
	int leafCount2 = 40;
	
	void smell(){
		System.out.println("Rose smells");
	}
	void throne(){
		System.out.println("Rose is having thrones.");
	}
}

public class TypeCastObject {

	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.smell();
		flower.size();
		
		/*Rose rose1 = (Rose) flower;
		rose1.smell();
		rose1.size();
		rose1.throne();*/
		
		Rose rose = new Rose();
		rose.smell();
		rose.throne();
		rose.size();
		
		
		System.out.println("<------Up cASTING---->");
		//Up Casting. Super class reference variable refer to sub class object
		Flower flowerUp = new Rose();
		flowerUp.smell();
		flowerUp.size();
		
		//flowerUp.throne();  compile time error
		System.out.println("LeafCount :"+ flowerUp.leafCount );
		System.out.println("LeafCount :"+ flowerUp.leafCount1 );
		//System.out.println("LeafCount :"+ flowerUp.leafCount2 );
		
		System.out.println("<------Down cASTING---->");
		//Down Casting or Explicit Casting.Sub class reference variable refer to super class object
		Rose roseDown = (Rose) flowerUp ;
		roseDown.smell();
		roseDown.throne();
		roseDown.size();
		
	}
}
