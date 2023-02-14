SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://git.code.sf.net/p/fldigi/fldigi;protocol=git;branch=master \
          "
# tag v4.1.24
SRCREV = "9e15ddd3ecbc23e874e7fac4717a9187f8258028"

S = "${WORKDIR}/git"

inherit autotools gettext pkgconfig

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
