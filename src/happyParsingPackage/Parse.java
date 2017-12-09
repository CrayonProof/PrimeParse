package happyParsingPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.List;

public class Parse {
	
	public static String view; //current character in parse
	public static boolean between = true; //between primes?
	static int n; //number of primes parsed
	static String prime; //current prime being parsed
	
	public static void parse()
	{
		for (int i = 0; i < file.length; i ++)
		{
			view = file.get(i); //set view to current character in parse
			if ((view == " ") || (view == (System.getProperty("line.separator")))) //in between primes
			{
				between = true;
			}
			else
			{
				if (between) //start of a new prime
				{
					between = false;
					n++; //increment number of primes parsed
					prime = view; //set current prime to current (and first) digit of current prime
				}
				else //middle of prime
				{
					prime = prime + view; //append current digit of prime to previous digits of prime
				}
			}
		}
	}
}
