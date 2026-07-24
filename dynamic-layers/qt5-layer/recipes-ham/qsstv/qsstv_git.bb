SUMMARY = "QSSTV"

DESCRIPTION = "QSSTV is a program for receiving and transmitting SSTV and \
HAMDRM (sometimes called DSSTV). It is compatible with most of MMSSTV and \
EasyPal."

HOMEPAGE = "https://www.cqsstv.com/"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=57baf3d8c07efa88a6a07754076c97d7"

SRCREV = "8c27d6d169d8c6c197eb47c2089870e39bc06a02"
SRC_URI = "git://github.com/ON4QZ/QSSTV.git;protocol=https;branch=main \
          "

inherit qmake5 pkgconfig

DEPENDS = "openjpeg alsa-lib pulseaudio hamlib fftw v4l-utils qtbase"

QMAKE_PROFILES += "${S}/src/${PN}.pro"
EXTRA_QMAKEVARS_PRE += "PREFIX=${prefix}"
