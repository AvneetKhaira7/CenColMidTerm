import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringJoiner;


public class Lotto649 extends LottoGame implements IBonusNumber {

	private int _bonNum =0;
	//private ArrayList<String> _output  = new ArrayList<String>();
	private String[] _output = new String[5];
	//Constructor*************
	public Lotto649() {
		super(6, 49);
	}
	


	@Override
	public int bonusNumber() {
		
		_bonNum = (int) (1+ Math.random()*_setSize);
		while(_elementArray.contains(_bonNum)){
			_bonNum = (int) (1+ Math.random()*_setSize);
		}
		return _bonNum;
	}
	
	public String toString(){
			String finalOutput = " ";
			for(int i=0; i<5; i++)
			{
			_output[i] = "";
		
			_elementArray.clear();
			
			pickElements();
			for (int a=0; a<_elementArray.size(); a++)
			{
				_output[i] += Integer.toString(_elementArray.get(a)) + ", " ;
				
			}
			
			_output[i] = "{"+ _output[i] +"} "+ "Bonus Number: " + Integer.toString(bonusNumber())  ;
			
			}
			
			//System.out.println(_output + "\n");
			finalOutput = _output[0]+ "\n" + _output[1]+ "\n" + _output[2]+ "\n" + _output[3]+ "\n" + _output[4]+ "\n";
			System.out.println(finalOutput);
		return finalOutput;
	}

}
