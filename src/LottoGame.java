import java.util.ArrayList;


public abstract class LottoGame {
	
	protected ArrayList<Integer> _numberArray  = new ArrayList<Integer>();
	protected ArrayList<Integer> _elementArray = new ArrayList<Integer>();
	protected int _elementNum;
	protected int _setSize;
	
	public LottoGame(int elementNum, int setSize){
		this._elementNum = elementNum;
		this._setSize = setSize;
	}
	
	protected void _initialize(){
		for(int i=0; i<_setSize; i++){
			int myNum = 1+ i;
			this._numberArray.add(myNum);
		}
	}
	
	public void pickElements(){
		for (int a=0; a<_elementNum; a++){
			int myGameNum = (int) (1 + (Math.random()*_setSize));
			this._elementArray.add(myGameNum);
			
		}
		this._initialize();
		
	}
	
	
	
}
