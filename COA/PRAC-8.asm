;Write an Assembly Language Code in GNUsim8085
;to find the factorial of a number

jmp start

;data

;code
start: nop
      	MVI B,05
      	MOV C,B
      	DCR B
LOOP1:  MOV D,B
      	MVI A,00
LOOP2:  ADD C
      	DCR D
      	JNZ LOOP2
      	MOV C,A
      	DCR B
      	JNZ LOOP1
      	STA 0001H

hlt
