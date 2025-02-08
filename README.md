# RTSP Video Streaming Application

## Overview

This Android application enables users to stream video using the Real-Time Streaming Protocol (RTSP). It provides a simple and intuitive interface for users to input RTSP URLs and control video playback.

## Features

- Input field for RTSP URL
- Video playback using ExoPlayer
- Play, Pause, and Stop functionality
- Error handling with user-friendly messages
- Optimized for performance with minimal latency

## Requirements

- Android Studio Arctic Fox (2020.3.1) or newer
- Minimum SDK: API 21 (Android 5.0 Lollipop)
- Target SDK: API 33 (Android 13)

## Setup and Installation

1. Clone the repository:
   \`\`\`
   git clone https://github.com/yourusername/rtsp-streaming-app.git
   \`\`\`

2. Open the project in Android Studio.

3. Sync the project with Gradle files.

4. Build the project and run it on an Android device or emulator.

## Usage

1. Launch the application on your Android device.

2. Enter a valid RTSP URL in the input field at the bottom of the screen.

3. Tap the "Play" button to start streaming the video.

4. Use the "Pause" and "Stop" buttons to control playback as needed.

5. If any errors occur during streaming, an error message will be displayed.

## Project Structure

- \`MainActivity.kt\`: The main activity that handles the UI and video playback logic.
- \`activity_main.xml\`: The layout file for the main activity.
- \`build.gradle\`: Contains the project dependencies and build configurations.

## Dependencies

- ExoPlayer: Used for video playback and RTSP streaming
  - exoplayer-core:2.17.1
  - exoplayer-ui:2.17.1
  - exoplayer-rtsp:2.17.1

## Troubleshooting

- Ensure that you have a stable internet connection.
- Verify that the RTSP URL is correct and accessible.
- Check that your Android device supports the video codec used in the RTSP stream.

## Known Issues

- The application may experience increased latency on slower network connections.
- Some RTSP servers may require additional authentication, which is not currently supported in this version.

## Future Improvements

- Add support for RTSP URLs requiring authentication.
- Implement a list of recent or favorite RTSP URLs.
- Add landscape mode and full-screen playback support.
- Enhance error handling and recovery mechanisms.
- Implement network connectivity checks before streaming.

## Contributing

Contributions to improve the application are welcome. Please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature.
3. Commit your changes and push to your fork.
4. Create a pull request with a description of your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

If you have any questions or suggestions, please open an issue in the GitHub repository.

\`\`\`


