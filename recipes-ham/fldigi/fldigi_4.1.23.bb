SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "http://www.w1hkj.com/files/fldigi/${BP}.tar.gz \
          "
SRC_URI[sha256sum] = "e366e1fc9fc343f57d39128a6603a696f872351ed48dba8f3c3d168bda1fca8d"

inherit autotools gettext pkgconfig

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
