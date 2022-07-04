SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[md5sum] = "d10ff27d670ef3b1cea1e45a5a57564a"
SRC_URI[sha256sum] = "e366e1fc9fc343f57d39128a6603a696f872351ed48dba8f3c3d168bda1fca8d"

inherit autotools gettext

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
