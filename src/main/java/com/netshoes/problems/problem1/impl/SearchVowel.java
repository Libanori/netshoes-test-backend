package com.netshoes.problems.problem1.impl;

import com.netshoes.problems.problem1.api.Stream;

// NAO RENOMEAR ESSA CLASSE!
public class SearchVowel {

    
	
	public static char firstChar(Stream input) {
        char test;
        char result = '0';
        boolean a = false;
        boolean e = false;
        boolean i = false;
        boolean o = false;
        boolean u = false;
        int aut = 0;
		
        while(input.hasNext()) {
        	test = input.getNext();
        	
        	switch (test) {
			case 'a':
				if(!a) {
					a = true;
					if(aut == 2)
						result = 'a';
				}
				else
					if(result == 'a')
						result = '0';
				aut = 1;				
				break;
			case 'A':
				if(!a) {
					a = true;
					if(aut == 2)
						result = 'a';
				}
				else
					if(result == 'a')
						result = '0';
				aut = 1;				
				break;
			case 'e':
				if(!e) {
					e = true;
					if(aut == 2)
						result = 'e';
				}
				else
					if(result == 'e')
						result = '0';
				aut = 1;				
				break;
			case 'E':
				if(!e) {
					e = true;
					if(aut == 2)
						result = 'e';
				}
				else
					if(result == 'e')
						result = '0';
				aut = 1;				
				break;
			case 'i':
				if(!i) {
					i = true;
					if(aut == 2)
						result = 'i';
				}
				else
					if(result == 'i')
						result = '0';
				aut = 1;				
				break;
			case 'I':
				if(!i) {
					i = true;
					if(aut == 2)
						result = 'i';
				}
				else
					if(result == 'i')
						result = '0';
				aut = 1;				
				break;
			case 'o':
				if(!o) {
					o = true;
					if(aut == 2)
						result = 'o';
				}
				else
					if(result == 'o')
						result = '0';
				aut = 1;				
				break;
			case 'O':
				if(!o) {
					o = true;
					if(aut == 2)
						result = 'o';
				}
				else
					if(result == 'o')
						result = '0';
				aut = 1;				
				break;
			case 'u':
				if(!u) {
					u = true;
					if(aut == 2)
						result = 'u';
				}
				else
					if(result == 'u')
						result = '0';
				aut = 1;				
				break;
			case 'U':
				if(!u) {
					u = true;
					if(aut == 2)
						result = 'u';
				}
				else
					if(result == 'u')
						result = '0';
				aut = 1;				
				break;

			default:
				if(aut == 1)
					aut++;
				else
					aut = 0;
				break;
			}
        }
        
		return result;
    }

}
