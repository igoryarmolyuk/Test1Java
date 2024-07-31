package homework;

import javax.sound.midi.*;

public class One {

    public static void main(String[] args) {
        // this part playing MIDI music & melody composed by me "Igor Yarmolyuk"
        Midi(200, 82, 100, 0);
        Midi(200, 76, 100, 0);
        Midi(200, 77, 100, 0);
        Midi(200, 76, 100, 0);
        Midi(200, 75, 100, 0);
        Midi(200, 76, 100, 0);
        Midi(200, 77, 100, 0);
        Midi(200, 76, 100, 0);
        Midi(200, 73, 100, 0);
        Midi(200, 70, 100, 0);
        Midi(200, 69, 100, 0);

    }

    public static void Midi(int time2wait, int NoteNumbers, int volume, int channel) {
        try {

            // Get the default MIDI synthesizer
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();

            // Get the synthesizer's MIDI receiver
            Receiver receiver = synthesizer.getReceiver();

            // Create a note-on message and send it to the receiver
            ShortMessage noteOn = new ShortMessage();
            noteOn.setMessage(ShortMessage.NOTE_ON, channel, NoteNumbers, volume); // this part is
            receiver.send(noteOn, -1); //this part is sending note that we want to play to the speakers I guess

            // Wait for time that set in parameter time2wait
            Thread.sleep(time2wait);

            // Close the synthesizer
            synthesizer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}