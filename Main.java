import javax.sound.midi.*;

public class Main {

    public static void main(String[] args) {
        // this part playing MIDI music & melody composed by "Giblyns"
        Midi(240, 81, 93, 0);
        Midi(120, 76, 93, 0);
        Midi(240, 76, 93, 0);
        Midi(240, 81, 93, 0);
        Midi(120, 76, 93, 0);
        Midi(240, 76, 93, 0);
        Midi(240, 81, 93, 0);
        Midi(960, 77, 93, 0);
        Midi(960, 76, 93, 0);

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