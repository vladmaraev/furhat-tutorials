package furhatos.demo

import furhatos.demo.audiofeed.FurhatAudioFeedPlayback
import furhatos.demo.audiofeed.FurhatAudioFeedRecorder
import furhatos.demo.audiofeed.FurhatAudioFeedStreamer
import java.io.File
import java.util.Scanner

fun main() {
    val streamer = FurhatAudioFeedStreamer()
    streamer.start("furhat-401.local")

    /** Choose one of them to record or playback audio */
    // recordAudio(streamer)
    playbackAudio(streamer)

    print("Starting streaming/recording, press return to stop...")
    val reader = Scanner(System.`in`)
    val integer = reader.nextLine()
    println(streamer)
    streamer.stop()
    println("Streaming/recording is stopped.")
}

fun recordAudio(streamer: FurhatAudioFeedStreamer) {
    val recorder = FurhatAudioFeedRecorder(streamer)

    /** Choose one of them to record audio in, out or both */
  recorder.startRecordAll(File("recording.wav"))
    // recorder.startRecordSeparate(audioInFile = File("audioIn.wav"), audioOutFile = File("audioOut.wav"))
}

fun playbackAudio(streamer: FurhatAudioFeedStreamer) {
    val playback = FurhatAudioFeedPlayback(streamer)
    playback.start(playSystem = true, playUser = true)
}