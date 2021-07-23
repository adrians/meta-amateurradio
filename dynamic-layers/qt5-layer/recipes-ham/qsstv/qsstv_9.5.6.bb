SUMMARY = "QSSTV"

DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and \
HAMDRM (sometimes called DSSTV). It is compatible with most of MMSSTV and \
EasyPal."

HOMEPAGE = "http://users.telenet.be/on4qz/index.html"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRC_URI = "http://users.telenet.be/on4qz/qsstv/downloads/${BPN}_${PV}.tar.gz \
          "

SRC_URI[md5sum] = "622ffcc401c2314e05d350499ccbd437"
SRC_URI[sha256sum] = "5cfcf717ef5eacecf82e046e7b7460a2d98df6b602a5a7f6d5058928cce160ed"

S = "${WORKDIR}/${BPN}"

inherit qmake5

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
