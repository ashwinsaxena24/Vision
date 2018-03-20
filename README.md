# Vision
Rajasthan Hackathon 4.0
[![Vision](https://github.com/kunalrajora/vision/blob/master/resource/Vis_logo.jpg?raw=true)](https://github.com/kunalrajora/vision/blob/master/resource/My%20Movie%203.mp4?raw=true)

OpenCV, AI, AR based app that identifies and tracks lanes used for autonomous driving features such as lane changing, blindspot detection, hill crest detection, turn detection, vehicle detection and sign recognition. Along with this it also detects places of users desire and show information about them via augmented reality.


This is a project by team Vision. The goal is to detect lane lines on video using computer vision methods and show path on them in real time(OpenCV library).

[![Presentation video](https://github.com/ashwinsaxena24/Vision/blob/master/video/Vis_App1.mp4)]


# Example processed video frame image

Here is an example of resulted video frame image with drawn lane lines, curvature and offset information
(https://github.com/kunalrajora/vision/blob/master/resource/Vis_app.png?raw=true)

# Conclusion

Reprojecting into trapezoidal view and fitting lane lines by polynomial is promising method which may find not only straight lane lines but also curved ones. But it is not robust enough to deal with complex environment with tree shadows, road defects, brightness/contrast issues. It will be effective on environments where lane lines are bright, contrast, not occluded or overlapped.

In many situations human drivers consider lane lines not as direct driving rule but as hint of which position of the road it is better to take. Also human drivers may predict lanes on roads without lane lines marks. I think this OpenCV approach may be used for generating dataset for more complex model. Such as neural network which may be able to predict lane lines marks. Using well detected parts of video we may erase lane line marks using morphology operations and use such images without lane lines marks (and also another augmentation technics) along with detected curves as dataset for training. I think such method may be used to get lane lines on roads that even have no lane lines.We can also use this road signs detection, distance from vehicle detection and street lights detection.

