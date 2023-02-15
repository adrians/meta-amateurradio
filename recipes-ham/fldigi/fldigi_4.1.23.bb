SUMMARY = "fldigi"

DESCRIPTION = "Fldigi is a software modem for Amateur Radio use. It is a sound \
card based program that is used for both transmitting and receiving data in \
various digital modes"

HOMEPAGE = "http://www.w1hkj.com/"

LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://COPYING;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "git://git.code.sf.net/p/fldigi/fldigi;protocol=git;branch=master \
          "
# tag v4.1.23
SRCREV = "61b97f4133c488063f3de1795c894d22d5032e8a"

# Version 4.1.24 requires Autoconf 2.71, which dunfell does
# not support.

S = "${WORKDIR}/git"

inherit autotools gettext

DEPENDS = "fltk udev libsamplerate0 portaudio-v19"
