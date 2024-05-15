;<Write an assembly language code in GNUsim8085 to implement data transfer instruction. (HINT : MOV, MVI, LXI, LDAX, LDA, STA, STAX )>

jmp start

;data


;code
start: nop
	MVI B,12H ;Loads immediate data 12H into register B
	MVI C,45H ;Loads immediate data 45H into register C

	MOV D,B ;Moves data from register B to D register
	MOV E,C ;Moves data from register C to E register

	LXI H,1326H ;Loads immediate data 1326H into register pair HL

	LDAX D ;Loads accumulator with data from memory address pointed by DE pair

	LDA 0001H ;Loads accumulator with data from memory address 0001H

	STAX B ;Stores accumulator data to memory address pointed by bc pair

	STA 0005H ;Stores accumulator data to memory address 0005H


hlt
