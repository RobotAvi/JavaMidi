package com.company;
import javax.sound.midi.*;

public class Music {
    private static MidiChannel mChannel;
    public static void play() throws MidiUnavailableException {
        int speed = 250;
        int instrument = 1;

        Synthesizer midiSynth = MidiSystem.getSynthesizer();
        midiSynth.open();
        Instrument[] instr = midiSynth.getDefaultSoundbank().getInstruments();
        int instProgram = instr[instrument].getPatch().getProgram();

        MidiChannel[] mChannels = midiSynth.getChannels();
        mChannel = mChannels[1];
        mChannel.programChange(instProgram);


        int[] channels = new int[]{0, 1};
        int[][] music = new int[][]{
                {Notes.E4, Notes.D2},
                {0, Notes.A2},
                {Notes.D4, Notes.D3},
                {Notes.A3, Notes.A2},
                {0, Notes.D2},
                {Notes.A3, Notes.A2},
                {0, Notes.D3},
                {0, Notes.A2},

                {Notes.C4, Notes.G1},
                {0, Notes.D2},
                {Notes.AU3, Notes.G2},
                {Notes.F3, Notes.D2},
                {0, Notes.G1},
                {Notes.F3, Notes.D2},
                {0, Notes.G2},
                {0, Notes.D2},

                {Notes.AU3, Notes.AU1},
                {0, Notes.F2},
                {Notes.G3, Notes.AU2},
                {Notes.D3, Notes.F2},
                {0, Notes.AU1},
                {Notes.D3, Notes.F2},
                {0, Notes.AU2},
                {0, Notes.F2},

                {Notes.G3, Notes.A1},
                {0, Notes.E2},
                {Notes.E3, Notes.A2},
                {Notes.CU3, Notes.E2},
                {0, Notes.A1},
                {0, Notes.E2},
                {0, Notes.A2},
                {0, Notes.E2},


                {Notes.A3, Notes.G1},
                {0, Notes.D2},
                {Notes.G3, Notes.G2},
                {Notes.D3, Notes.D2},
                {0, Notes.G1},
                {Notes.D3, Notes.D2},
                {0, Notes.G2},
                {0, Notes.D2},

                {Notes.G3, Notes.AU1},
                {0, Notes.F2},
                {Notes.F3, Notes.AU2},
                {Notes.CU3, Notes.F2},
                {0, Notes.AU1},
                {Notes.CU3, Notes.F2},
                {0, Notes.AU2},
                {0, Notes.F2},

                {Notes.F3, Notes.D2},
                {0, Notes.A2},
                {Notes.D3, Notes.D3},
                {Notes.A2, Notes.A2},
                {0, Notes.D2},
                {Notes.D3, Notes.A2},
                {0, Notes.D3},
                {0, Notes.A2},

                {Notes.D3, Notes.D2},
                {Notes.A3, Notes.A2},
                {Notes.FU3, Notes.D3},
                {Notes.A3, Notes.A2},
                {Notes.C4, Notes.D2},
                {Notes.A3, Notes.A2},
                {Notes.DU3, Notes.D3},
                {Notes.D3, Notes.A2}

        };

        playNote(music, speed, channels);
    }
    private static void playNote(int[][] notes, int speed, int[] channels) {
        for (int row = 0; row < notes.length; row++) {
            for (int channel : channels) {
                if (notes[row][channel] != 0) {
                    System.out.print(notes[row][channel] + ", ");
                    int note = notes[row][channel];
                    mChannel.noteOn(note, 100);//On channel 0, play note number 60 with velocity 100
                }
            }
            try {
                Thread.sleep(60 * 1000 / speed); // wait time in milliseconds to control duration
                mChannel.allSoundOff();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println();

        }
        //mChannel.noteOff(note);//turn of the note
    }

    class Notes {

        static int C0 = 12;
        static int CU0 = 13;
        static int D0 = 14;
        static int DU0 = 15;
        static int E0 = 16;
        static int F0 = 17;
        static int FU0 = 18;
        static int G0 = 19;
        static int GU0 = 20;
        static int A0 = 21;
        static int AU0 = 22;
        static int B0 = 23;
        static int C1 = 24;
        static int CU1 = 25;
        static int D1 = 26;
        static int DU1 = 27;
        static int E1 = 28;
        static int F1 = 29;
        static int FU1 = 30;
        static int G1 = 31;
        static int GU1 = 32;
        static int A1 = 33;
        static int AU1 = 34;
        static int B1 = 35;
        static int C2 = 36;
        static int CU2 = 37;
        static int D2 = 38;
        static int DU2 = 39;
        static int E2 = 40;
        static int F2 = 41;
        static int FU2 = 42;
        static int G2 = 43;
        static int GU2 = 44;
        static int A2 = 45;
        static int AU2 = 46;
        static int B2 = 47;
        static int C3 = 48;
        static int CU3 = 49;
        static int D3 = 50;
        static int DU3 = 51;
        static int E3 = 52;
        static int F3 = 53;
        static int FU3 = 54;
        static int G3 = 55;
        static int GU3 = 56;
        static int A3 = 57;
        static int AU3 = 58;
        static int B3 = 59;
        static int C4 = 60;
        static int CU4 = 61;
        static int D4 = 62;
        static int DU4 = 63;
        static int E4 = 64;
        static int F4 = 65;
        static int FU4 = 66;
        static int G4 = 67;
        static int GU4 = 68;
        static int A4 = 69;
        static int AU4 = 70;
        static int B4 = 71;
        static int C5 = 72;
        static int CU5 = 73;
        static int D5 = 74;
        static int DU5 = 75;
        static int E5 = 76;
        static int F5 = 77;
        static int FU5 = 78;
        static int G5 = 79;
        static int GU5 = 80;
        static int A5 = 81;
        static int AU5 = 82;
        static int B5 = 83;
        static int C6 = 84;
        static int CU6 = 85;
        static int D6 = 86;
        static int DU6 = 87;
        static int E6 = 88;
        static int F6 = 89;
        static int FU6 = 90;
        static int G6 = 91;
        static int GU6 = 92;
        static int A6 = 93;
        static int AU6 = 94;
        static int B6 = 95;
        static int C7 = 96;
        static int CU7 = 97;
        static int D7 = 98;
        static int DU7 = 99;
        static int E7 = 100;
        static int F7 = 101;
        static int FU7 = 102;
        static int G7 = 103;
        static int GU7 = 104;
        static int A7 = 105;
        static int AU7 = 106;
        static int B7 = 107;
        static int C8 = 108;
        static int CU8 = 109;
        static int D8 = 110;
        static int DU8 = 111;
        static int E8 = 112;
        static int F8 = 113;
        static int FU8 = 114;
        static int G8 = 115;
        static int GU8 = 116;
        static int A8 = 117;
        static int AU8 = 118;
        static int B8 = 119;
        static int C9 = 120;
        static int CU9 = 121;
        static int D9 = 122;
        static int DU9 = 123;
        static int E9 = 124;
        static int F9 = 125;
        static int FU9 = 126;
        static int G9 = 127;
    }
}
