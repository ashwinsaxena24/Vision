cmake_minimum_required(VERSION 3.5)
project(opencv)

set(OpenCV_DIR /usr/local/share/OpenCV)
find_package(OpenCV REQUIRED)
set(CMAKE_CXX_FLAGS "${CMAKE_CXX_FLAGS} -std=c++11")
set(SOURCE_FILES app/src/main/cpp/main.cpp)
add_executable(opencv ${SOURCE_FILES})

include_directories(${OpenCV_INCLUDE_DIRS})
target_link_libraries(opencv ${OpenCV_LIBS})