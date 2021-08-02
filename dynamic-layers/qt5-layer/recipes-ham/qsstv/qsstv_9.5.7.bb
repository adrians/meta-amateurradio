SUMMARY = "QSSTV"

DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and \
HAMDRM (sometimes called DSSTV). It is compatible with most of MMSSTV and \
EasyPal."

HOMEPAGE = "http://users.telenet.be/on4qz/index.html"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRC_URI = "http://users.telenet.be/on4qz/qsstv/downloads/${BPN}_${PV}.tar.gz \
          "

SRC_URI[md5sum] = "d8e6792b66783c7ab8193e1a8a3b7cec"
SRC_URI[sha256sum] = "2a8d9341a164ff5bdc1121590425efce8cd61bc8afe487fcf3bf31c7a212af8d"

S = "${WORKDIR}/${BPN}"

inherit qmake5

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
