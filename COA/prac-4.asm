
;<Write anassembly language code in GNU sim8085 to perform various arithmetic operations.>
;a)Additionoftwo8-bitnumbersandalsomaintaincarryregisters
;b)Additionoftwo16-bitnumbers(withandwithoutcarry)
;c)Subtractionoftwo8-bitnumbers
;d)Subtractionoftwo16-bitnumbers(withandwithoutborrow)
;e)Multiplicationof8-bitnumbers
;f)Divisionof16bitby8-bitnumber

jmp start

;data


;code
start: nop

;a)Additionoftwo8-bitnumbersandalsomaintaincarryregisters
      	MVI C,00H
      	LXI H,0001H
      	MOV A,M
      	INX H
      	MOV B,M
      	ADD B
      	JNC LOOP
      	INR C
LOOP:   STA 0003H
      	MOV A,C
      	STA 0004H

;b)Additionoftwo16-bitnumbers(withandwithoutcarry)
;With carry 
      	MVI C,00H
      	MVI A,00H
      	MVI L,16H
      	MVI H,5AH
      	XCHG
      	MVI L,9AH
      	MVI H,7CH
      	DAD D
      	JNC LOOP
      	INR C
LOOP: 	SHLD 0005H
      	MOV A,C
      	STA 0007H

;Without carry

        MVI L,9AH
      	MVI H,5AH
      	XCHG
      	MVI L,4AH
      	MVI H,20H
      	DAD D
      	SHLD 0008H

;c)Subtractionoftwo8-bitnumbers

      MVI L,00H
    	MVI E,00H
    	LXI H,0001H
    	MOV A,M
    	INX H
    	MOV B,M
    	SUB B
    	JNC LOOP
    	ADI 00H
    	INR C
LOOP:	STA 0005H
    	MOV A,C
    	STA 0006H

;d)Subtractionoftwo16-bitnumbers(withandwithoutborrow


hlt
