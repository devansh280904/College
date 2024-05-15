
;Write an assembly language code in GNUsim8085 to perform various
; logical operations on a set of 10 data
; a)Addition of First 10 Numbers
; b)Addition of any 10 Numbers stored in memory
; c)Count Even and Odd Numbers 

jmp start

;data

;code
start: nop

; a)Addition of First 10 Numbers
      	MVI C,10
      	MVI A,0
LOOP: 	ADD C
      	DCR C
      	JNZ LOOP
      	STA 0000H

; b)Addition of any 10 Numbers stored in memory
      	MVI A,0AH
      	MOV B,A
      	LXI H,0001H
      	MVI A,00
      	MVI C,00
LOOP1:  ADD M
      	INR L
      	JNC LOOP2
      	INR C
LOOP2:  DCR B
      	JNZ LOOP1
      	STA 000BH
      	MOV A,C 
      	STA 000CH

; c)Count Even and Odd Numbers 
      	LXI H,0001H
      	MVI C,00H
      	MVI D,0AH
LOOP2:  INX H
      	MOV A,M
      	ANI 01
      	JZ LOOP1
      	INR C
LOOP1:  DCR D
      	JNZ LOOP2
      	MOV A,C
      	STA 000DH
      	MVI A,0AH
      	SUB C
      	STA 000EH

hlt
