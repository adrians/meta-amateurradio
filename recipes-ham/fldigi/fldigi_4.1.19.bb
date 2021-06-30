SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "61f68a174bfabedbd88b417c48ec21c7"
SRC_URI[sha256sum] = "8715e7109d2a674d80b742c97743fe7cb8997166b3c6ddef622c8cd8779d6e7f"

inherit autotools gettext

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
