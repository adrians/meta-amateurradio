SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "f9dfece16e79eb22ed08be06db4a3f81"
SRC_URI[sha256sum] = "43a8768c0f8fcffe5509eede1f7e95f18ed6290de3e46573424019a8fb8f8d70"

inherit autotools gettext pkgconfig

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
