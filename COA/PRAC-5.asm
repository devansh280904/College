;Write an assembly languauge code in GNUsim8085 to 
; perform various logical arithmetc operations'
; a) AND
; b) OR
; c) XOR
; d) Complement 
; e) Rotate


jmp start

;data


;code
start: nop

; a) AND
  	MVI A,05H
  	MVI B,05H 
  	ANA B
  	STA 0001H

; b) OR
    MVI A,01H
  	MVI B,02H
  	ORA B
  	STA 0002H
   
; c) XOR
    MVI A,01H
  	MVI B,02H
  	XRA B
  	STA 0002H
   
; d) Complement 
    MVI A,01H
	  CMA
	  STA 0002H
   
; e) Rotate
    MVI A, 08H; 0000 1000 (08)
  	RLC; 00010000 (16)
  	STA 0001H;

    MVI A, 08H; 0000 1000
	  RRC; 0000 0100 (4)
	  STA 0003H; 
 
    MVI A, 08H; 0000 1000
  	RAR; 0000 0100 0
  	STA 0004H;

    MVI A, 08H; 0000 1000 
  	RLC; 0 0001 0000
  	STA 0005H;
hlt

   
