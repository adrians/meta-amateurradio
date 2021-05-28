SUMMARY = "QSSTV"

DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and \
HAMDRM (sometimes called DSSTV). It is compatible with most of MMSSTV and \
EasyPal."

HOMEPAGE = "http://users.telenet.be/on4qz/index.html"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRC_URI = "http://users.telenet.be/on4qz/qsstv/downloads/${BPN}_${PV}.tar.gz \
           file://0001-FILPATHLEN-has-been-renamed-in-upstream-hamlib-versi.patch \
          "

SRC_URI[md5sum] = "7b19ded9c6e60d328a84c6592ea41a77"
SRC_URI[sha256sum] = "177e286090c71f8a033646b39c3b6abe212cc06718c1ecc9ddc7024198cb7e40"

S = "${WORKDIR}/${BPN}_${PV}"

inherit qmake5

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
