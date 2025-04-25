LXI H, 2000H ; Load memory location 2000H in HL register pair
LXI D, 2100H ; Load memory location 2100H in DE register pair
MVI B, 0FH ; Load count of bytes (15) in B register
MVI C, 00H ; Initialize count of non-zero bytes



LOOP1:

MOV A, M ; Move current byte to accumulator

MOV A, M ; Move current byte to accumulator

CPI 00H ; Compare accumulator with zero

JZ SKIP ; If zero, skip storing the byte

STAX D ; Store non-zero byte in new block

INX D ; Increment DE register pair

INR C ; Increment count of non-zero bytes

SKIP:

INX H ; Increment HL register pair

DCR B ; Decrement count of bytes

JNZ LOOP1 ; If not all bytes are processed, loop

LXI H, 2100H ; Load memory location 2100H in HL register pair

MOV B, C ; Load count of non-zero bytes in B register

MVI C, 00H ; Initialize sum low byte

MVI D, 00H ; Initialize sum high byte

LOOP2:

MOV A, C ; Move sum low byte to accumulator

ADD M ; Add current byte to sum low byte

MOV C, A ; Update sum low byte

MOV A, D ; Move sum high byte to accumulator

ACI 00H ; Add carry to sum high byte

MOV D, A ; Update sum high byte

INX H ; Increment HL to point to next byte

DCR B ; Decrement count of bytes

JNZ LOOP2 ; If not all bytes are processed, loop

LXI H, 2200H ; Load memory location 2200H in HL register pair

MOV M, C ; Store sum low byte

INX H ; Increment HL

MOV M, D ; Store sum high byte
MOV A, D ; Check if carry is generated
CPI 00H
JZ NO_CARRY
MVI A, 01H ; Set carry flag
STA 2202H ; Store carry
NO_CARRY:
HLT ; Halt the program
