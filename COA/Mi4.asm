LXI H, 8000H ; Load memory location 8000H in HL register pair

LXI D, 9000H ; Load memory location 9000H in DE register pair

MVI B, 0AH ; Load count of numbers (10) in B register

MVI C, 00H ; Initialize count of positive numbers

LOOP:

MOV A, M ; Move current number to accumulator

RAL ; Check sign bit (MSB)

JNC POSITIVE ; If number is positive, increment count

STAX D ; Store negative number in memory location starting from

9000H

INX D ; Increment DE register pair

JMP SKIP

POSITIVE:

INR C ; Increment count of positive numbers

SKIP:

INX H ; Increment HL register pair

DCR B ; Decrement count of numbers

JNZ LOOP ; If not all numbers are processed, loop

MOV A, C ; Move count of positive numbers to accumulator


STA 9100H ; Store count of positive numbers in memory location

9100H

HLT ; Halt the program
