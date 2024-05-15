;Write an assembly level code in GNUsim8085 to store 
;numbers in reverse order in memory location as
;block transfer operation

jmp start

;data

;code
start: nop
      	LXI H,8000H
      	MOV C,M
      	LXI D,9000H
      	MOV A,L
      	ADD C
      	MOV L,A
LOOP:   MOV A,M
      	STAX D
      	INX D
      	DCX H
      	DCR C
      	JNZ LOOP

hlt
