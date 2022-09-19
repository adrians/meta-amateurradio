SUMMARY = "QSSTV"

DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and \
HAMDRM (sometimes called DSSTV). It is compatible with most of MMSSTV and \
EasyPal."

HOMEPAGE = "http://users.telenet.be/on4qz/index.html"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRC_URI = "http://users.telenet.be/on4qz/qsstv/downloads/${BPN}_${PV}.tar.gz \
          "
MIRRORS += "https://low-level.wiki/large_files/"

SRC_URI[md5sum] = "99e7fecd91f6c9bf211395fddceba44c"
SRC_URI[sha256sum] = "c03f7fa5c680ced8fd331c25ff3e47440c9aedb48ec7b66255c6aa0ed88e7a68"

S = "${WORKDIR}/${BPN}"

inherit qmake5 pkgconfig

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"

EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
