import javax.sound.midi.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            // Open a sequencer
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            // Open a synthesizer
            Synthesizer synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();

            // Get the default MIDI channel (usually 0)
            MidiChannel midiChannel = synthesizer.getChannels()[0];

            // Define the notes you want to play simultaneously (in MIDI note numbers)
            int[] notes = {64, 67}; // Example: C Major chord

            // Play each note
            for (int note : notes) {
                // Send a NOTE_ON message for each note
                midiChannel.noteOn(note, 100); // 100 is the velocity (volume)
            }

            // Sleep to allow the notes to play
            Thread.sleep(2000); // Adjust this value as needed

            // Close the sequencer and synthesizer
            sequencer.close();
            synthesizer.close();
        } catch (MidiUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
